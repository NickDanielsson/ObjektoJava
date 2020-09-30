package Inlupp1;

import javax.swing.*;

/**
 * Created by Nick Danielsson
 * Date 2020-09-28
 * Time 10:49
 * Project ObjektoJava
 */
public class MainDemo {
    public static void main(String[] args) {

        // Polymorfism, Animal tar formen av olika djur.
       Animal d1 = new Dog(5,"Sixten");
       Animal d2 = new Dog(10,"Dogge");
       Animal c1 = new Cat(5,"Venus");
       Animal c2 = new Cat(3,"Ove");
       Animal s1 = new Snake(1,"Hypno");

       String input = JOptionPane.showInputDialog("Vilket djur ska få mat?");
       if (input == null){
          JOptionPane.showMessageDialog(null, "Du har valt att avbryta, programmet avslutas");
           System.exit(0);
       }

        switch (input) {
            case "Sixten", "sixten" -> d1.getFood();
            case "Dogge", "dogge" -> d2.getFood();
            case "Venus", "venus" -> c1.getFood();
            case "Ove", "ove" -> c2.getFood();
            case "Hypno", "hypno" -> s1.getFood();
            default -> JOptionPane.showMessageDialog(null, "Inget djur med det namnet hittades.");
        }

    }
}
