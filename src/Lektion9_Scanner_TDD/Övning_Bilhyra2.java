package Lektion9_Scanner_TDD;

import java.util.InputMismatchException;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by Nick Danielsson
 * Date 2020-10-07
 * Time 11:07
 * Project ObjektoJava
 */
public class Övning_Bilhyra2 {
    public static void main (String[] arg) {
        String indata = showInputDialog
                ("Ange antal dagar, pris per dag samt bilmodell");
        Scanner sc = new Scanner(indata);
        int antalDagar = 0;
        double dagsPris = 0;
        String bil = "";
        try {
             antalDagar = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Fel typ av indata, ange heltal");

        }
        catch(Exception e){
            System.out.println("Okänt fel inträffade");
        }
        try {
             dagsPris = sc.nextDouble();
        }
        catch (InputMismatchException e) {
            System.out.println("Fel typ av indata");
        }
        catch (Exception e){
            System.out.println("Okänt fel inträffade");
        }
        try {
             bil = sc.next();
        }
        catch (NullPointerException e){
            System.out.println("Kan inte ange tomt");
        }
        catch (Exception e){
            System.out.println("Okänt fel insträffade");
        }
        double totPris = dagsPris * antalDagar;
        String s = String.format("Totalt pris för %s: %.2f",
                bil, totPris);
        showMessageDialog(null, s);
    }
}
