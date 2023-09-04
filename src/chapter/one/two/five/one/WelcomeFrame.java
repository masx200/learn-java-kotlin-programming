package chapter.one.two.five.one;

import javax.swing.*;
import java.awt.*;

class WelcomeFrame extends JFrame {
    public static final int DEFAULT_WIDTH = 300;  //设置窗口宽
    public static final int DEFAULT_HEIGHT = 200; //设置窗口高

    public WelcomeFrame() {
        setTitle("Welcome");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        WelcomePanel panel = new WelcomePanel();
        Container contentPane = getContentPane();
        contentPane.add(panel);
    }
}
