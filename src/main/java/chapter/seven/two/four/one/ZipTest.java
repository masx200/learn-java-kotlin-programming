package chapter.seven.two.four.one;

import javax.swing.*;
import java.awt.*;

public class ZipTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {          //将含有JFrame 的主方法体置于迟发线程体中
                ZipTestFrame frame = new ZipTestFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}

