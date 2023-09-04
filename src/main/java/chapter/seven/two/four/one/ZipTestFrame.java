package chapter.seven.two.four.one;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

class ZipTestFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 400;
    public static final int DEFAULT_HEIGHT = 300;
    private final JComboBox<String> fileCombo;
    private final JTextArea fileText;
    private String zipname;

    public ZipTestFrame() {
        setTitle("ZipTest");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JFileChooser chooser = new JFileChooser();
                chooser.setCurrentDirectory(new File("."));
                int r = chooser.showOpenDialog(ZipTestFrame.this);
                if (r == JFileChooser.APPROVE_OPTION) {
                    zipname = chooser.getSelectedFile().getPath();
                    fileCombo.removeAllItems();
                    scanZipFile();  //第一个压缩文件流:填下拉列表项
                }
            }
        });
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        menuBar.add(menu);
        setJMenuBar(menuBar);
        fileText = new JTextArea();
        fileCombo = new JComboBox<String>();
        fileCombo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {//第二个压缩文件流:填文本区
                loadZipFile((String) fileCombo.getSelectedItem());
            }
        });
        add(fileCombo, BorderLayout.SOUTH);
        add(new JScrollPane(fileText), BorderLayout.CENTER);
    }

    public void scanZipFile() {
        new SwingWorker<Void, String>() {  //Java SE 6 的抽象类


            @Override
            protected Void doInBackground() throws Exception {
                ZipInputStream zin = new ZipInputStream(new FileInputStream(zipname));
                ZipEntry entry;
                while ((entry = zin.getNextEntry()) != null) {
                    publish(entry.getName());  //将压缩文件内的entry 登载到List
                    zin.closeEntry();
                }
                zin.close();
                return null;
            }

            protected void process(List<String> names) {  /*将List entry 名数组加到下拉列表中*/
                for (String name : names) {
                    fileCombo.addItem(name);
                }
            }
        }.execute();  //执行该工作线程
    }

    public void loadZipFile(final String name) {
        fileCombo.setEnabled(false);  //暂时屏蔽下拉列表
        fileText.setText("");
        new SwingWorker<Void, Void>() { //处理长时间的GUI 交互任务

            @Override
            protected Void doInBackground() {
                try {
                    var zin = new ZipInputStream(new FileInputStream(zipname));
                    ZipEntry entry;
                    while ((entry = zin.getNextEntry()) != null) {
                        if (entry.getName().equals(name)) {
                            Scanner in = new Scanner(zin);
                            while (in.hasNextLine()) {
                                fileText.append(in.nextLine());
                                fileText.append("\n");
                            }
                        }
                        zin.closeEntry();
                    }
                    zin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }

            protected void done() {    //SwingWorker 对象的方法:解除对于下拉列表的屏蔽
                fileCombo.setEnabled(true);
            }
        }.execute();        //执行该工作线程
    }
}
