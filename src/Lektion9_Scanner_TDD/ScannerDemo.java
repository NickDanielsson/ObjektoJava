package Lektion9_Scanner_TDD;

import java.util.Scanner;

/**
 * Created by Nick Danielsson
 * Date 2020-10-07
 * Time 09:44
 * Project ObjektoJava
 */
public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Skriv en mening.");

        while (sc.hasNextLine()){
            s = sc.nextLine();
            if (s.isBlank())
                break;
            System.out.println("Du skrev " + s);
        }

    }
}
