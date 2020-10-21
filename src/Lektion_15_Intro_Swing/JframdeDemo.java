package Lektion_15_Intro_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Nick Danielsson
 * Date 2020-10-19
 * Time 08:28
 * Project ObjektoJava
 */
public class JframdeDemo extends JFrame implements ActionListener {

    JPanel panel = new JPanel();
    JPanel northPanel = new JPanel();
    JPanel sotuhPanel = new JPanel();
    JPanel WestPanel = new JPanel();
    JLabel label = new JLabel("Hej!");
    JLabel label2 = new JLabel("Hej!");
    JLabel label3 = new JLabel("Hej!");
    JLabel label4 = new JLabel("Hej!");
    ImageIcon image = new ImageIcon("C:\\Users\\nickd\\Desktop\\Drunk-Russian-Christmas-Party.png");
    JLabel label5 = new JLabel(image);
    JButton button = new JButton("Tryck här!");
    JButton button2 = new JButton("Tryck här!");
    JButton button3 = new JButton("Tryck här!");
    JButton button4 = new JButton("Tryck här!");

    JframdeDemo () {
       // panel.setLayout(new FlowLayout());
        add(panel);
       // panel.setLayout(new GridLayout(2,2));
        panel.setLayout(new BorderLayout());
        panel.add(northPanel,BorderLayout.NORTH);
        panel.add(sotuhPanel,BorderLayout.SOUTH);

        northPanel.add(label);
        northPanel.add(label2);
        northPanel.add(label3);

        sotuhPanel.add(button);
        sotuhPanel.add(button2);
        sotuhPanel.add(button3);

        button.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
       // panel.add(label);
       // panel.add(button);
       // panel.add(label2);
      //  panel.add(button2);
       // panel.add(label3);
      //  panel.add(button3);
      //  panel.add(label4);
       // panel.add(button4);
        panel.add(label5);
        setSize(300,300);            // storlek på ruta
        setTitle("Demo av JFrame");
      // setLocation(550,200);                   // bestämmer plats på ruta
        pack();                                  // anpassar rutans storlek efter innehåll
        setLocationRelativeTo(null);             // rutan hamnar i mitten
        setVisible(true);                        // behövas för att synas
        setDefaultCloseOperation(EXIT_ON_CLOSE); // avslutas om X

    }

    public static void main(String[] args) {
        JframdeDemo j = new JframdeDemo();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button){
            label.setText("Du klickade på vänstra rutan");
        }
        else if (e.getSource() == button2) {
            label2.setText("Du klickade i mittenrutan");
        }
        else if (e.getSource() == button3) {
            label3.setText("Du klickade på högra rutan");
        }
    }
}
