package BasicsOfJava.com.example.oop.basics.mouse_listener;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Frame extends JFrame implements MouseListener {

    private JLabel label;
    public Frame()
    {
        label = new JLabel("_ _ _ _");
        label.setBounds(10,10,250,50);
        this.add(label);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        String str = "Clicked x: " + x + " y: " + y;
        label.setText(str);
        System.out.println(str);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
