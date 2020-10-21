package Lektion_17_Fördjupning_Git;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Nick Danielsson
 * Date 2020-10-21
 * Time 11:17
 * Project ObjektoJava
 */
public class ButtonMouseOver extends JFrame {

    JPanel panel = new JPanel();
    JButton button = new JButton("Knapp");

    public ButtonMouseOver (){
        add(panel);
        panel.add(button);
        button.addMouseListener(mouse);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    MouseAdapter mouse = new MouseAdapter() {

        @Override
        public void mouseEntered(MouseEvent e) {
            button.setBackground(Color.RED);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            button.setBackground(Color.WHITE);
        }
    };

    public static void main(String[] args) {
        ButtonMouseOver b = new ButtonMouseOver();
    }
}
