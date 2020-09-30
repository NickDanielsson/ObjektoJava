package Inlupp1;

import javax.swing.*;

/**
 * Created by Nick Danielsson
 * Date 2020-09-28
 * Time 11:01
 * Project ObjektoJava
 */
public class Snake extends Animal{

    //enum
    Animalfood snakefood = Animalfood.ORMPELLETS;

    public Snake(int weight, String name) {
        super(weight, name);
    }

    @Override //polymorfism
    public void getFood() {
        JOptionPane.showMessageDialog(null,20 + " gram " + snakefood.foodName);
    }
}
