package Inlupp1;

import javax.swing.*;

/**
 * Created by Nick Danielsson
 * Date 2020-09-28
 * Time 10:56
 * Project ObjektoJava
 */
public class Cat extends Animal {

    //enum
    Animalfood catfood = Animalfood.KATTFODER;

    public Cat(int weight, String name) {
        super(weight, name);
    }

    @Override //polymorfism
    public void getFood() {
        String s = (this.weight * 1000) /150 + " gram " + catfood.foodName;
        JOptionPane.showMessageDialog(null,s);
    }
}
