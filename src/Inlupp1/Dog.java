package Inlupp1;

import javax.swing.*;

/**
 * Created by Nick Danielsson
 * Date 2020-09-28
 * Time 10:31
 * Project ObjektoJava
 */
public class Dog extends Animal {

    //enum
    Animalfood dogfood = Animalfood.HUNDFODER;

    public Dog () {}

    public Dog(int weight,String name) {
        super(weight, name);
    }

    @Override // Polymorfism
    public void getFood() {
       String s = (this.weight * 1000) /100 + " gram " + dogfood.foodName;
       JOptionPane.showMessageDialog(null,s);
    }
}
