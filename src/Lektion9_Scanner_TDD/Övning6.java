package Lektion9_Scanner_TDD;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Nick Danielsson
 * Date 2020-10-07
 * Time 13:36
 * Project ObjektoJava
 */
public class Övning6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Double> valör = new LinkedList<>();
        valör.add(1.);
        valör.add(2.);
        valör.add(5.);
        valör.add(10.);
        valör.add(20.);
        valör.add(50.);
        valör.add(100.);
        valör.add(500.);
        valör.add(1000.);
        double price = 0;
        double pay = 0;
        System.out.println("Hur mycket kostar varan?");
        price = sc.nextDouble();
        System.out.println("Hur mycket betalar du?");
        pay = sc.nextDouble();

    }
    public double changeValue (double price, double pay){
        return pay - price;
    }

}
