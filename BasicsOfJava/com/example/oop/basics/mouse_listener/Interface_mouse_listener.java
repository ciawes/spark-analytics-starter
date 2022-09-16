package BasicsOfJava.com.example.oop.basics.mouse_listener;

import javax.swing.*;

public class Interface_mouse_listener {
    public static void main(String[] args) {

        Frame frame = new Frame();

        frame.setSize(300,300);
        frame.setTitle("Przyklad");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addMouseListener(frame);


    }
}
