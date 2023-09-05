package chapter.one.two.five.one;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class WelcomePanel extends JPanel {             //定义方法类
    public WelcomePanel() {
        JLabel prompt = new JLabel("请输入您的名字:"); //提示输入
        final JTextField input = new JTextField(10);     //创建接收输入字符条
        final JTextField output = new JTextField(25);    //创建显示字符条
        JButton btnn = new JButton("Welcome");         //创建Welcome按钮
        add(prompt);       //输入提示放首行
        add(input);        //接收输入字符条随后
        add(output);       //输入字符条放第二行
        add(btnn);         //Welcome 按钮随后
        btnn.addActionListener(new ActionListener() {     //监听事件
            public void actionPerformed(ActionEvent event) {   //定义方法
                String s = input.getText();
                output.setText("Hello " + s + ",欢迎您参加Java考试!");
            }
        });
    }
}
