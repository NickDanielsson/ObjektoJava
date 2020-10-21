package Lektion_15_Intro_Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-10-19
 * Time 10:30
 * Project ObjektoJava
 */
public class VäxlaBild extends JFrame implements ActionListener {


    JPanel panel = new JPanel();
    JPanel southPanel = new JPanel();
    JButton button = new JButton("Byt bild!");

    ImageIcon image = new ImageIcon("C:\\Users\\nickd\\Desktop\\Bilder till prog\\bild2.png");
    ImageIcon image2 = new ImageIcon("C:\\Users\\nickd\\Desktop\\Bilder till prog\\bild1.jpg");
    JLabel label1 = new JLabel(image);
    int counter = 0;

    int imageIndex = 0;
    Path path = Paths.get("C:\\Users\\nickd\\Desktop\\Bilder till prog");
    List<String> imageList = loadImageNames(path);
    JLabel imageIcon = new JLabel(new ImageIcon(imageList.get(imageIndex)));
    int imageCount = imageList.size();
   // JLabel labelTest = new JLabel((new ImageIcon()));


    VäxlaBild() {
        panel.setBackground(Color.BLACK);
        add(panel);
        panel.setLayout(new BorderLayout());
        panel.add(imageIcon);
        panel.add(southPanel, BorderLayout.SOUTH);
        southPanel.add(button);
        button.addActionListener(this);
        setSize(800, 800);            // storlek på ruta
        setTitle("Demo av JFrame");
        // setLocation(550,200);                   // bestämmer plats på ruta
       // pack();                                  // anpassar rutans storlek efter innehåll
        setLocationRelativeTo(null);             // rutan hamnar i mitten
        setVisible(true);                        // behövas för att synas
        setDefaultCloseOperation(EXIT_ON_CLOSE); // avslutas om X

    }

    public static void main(String[] args) {
       VäxlaBild bild = new VäxlaBild();

    }

    /*
    @Override
    public void actionPerformed(ActionEvent e) {

       if (counter == 0){
           label1.setIcon(image2);
           counter = 1;
       }
       else if (counter == 1){
           label1.setIcon(image);
           counter = 0;
       }

    } */

    // Metod för att läsa in bildfiler från mapp
    protected List <String> loadImageNames(Path imageDir){
        List<String> imageFileNames = new LinkedList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(imageDir)) {
            for (Path file: stream) {
                imageFileNames.add(file.toString());
                System.out.println(file.toString());
            }
        } catch (IOException | DirectoryIteratorException x) {
            x.printStackTrace();
        }
        return imageFileNames;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        imageIndex = (imageIndex + 1) % imageCount;
        imageIcon.setIcon(new ImageIcon(imageList.get(imageIndex)));

    }
}
