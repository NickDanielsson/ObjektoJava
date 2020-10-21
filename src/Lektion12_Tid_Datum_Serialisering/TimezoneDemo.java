package Lektion12_Tid_Datum_Serialisering;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.TimeZone;

/**
 * Created by Nick Danielsson
 * Date 2020-10-13
 * Time 09:42
 * Project ObjektoJava
 */
public class TimezoneDemo {


    public static void timeFromStockholmShanghaiToronto(){
        Scanner sc = new Scanner(System.in);
        TimeZone time;
        String s = "";
        System.out.println("Ange vilken stad du vill veta tiden i Toronto, Stockholm eller Shanghai");
        s = sc.next();
        if (s.equalsIgnoreCase("toronto")) {
            time = TimeZone.getTimeZone("America/Toronto");
            TimeZone.setDefault(time);

        }
       else if (s.equalsIgnoreCase("stockholm")) {
            time = TimeZone.getTimeZone("Europe/Stockholm");
            TimeZone.setDefault(time);

        }
       else if (s.equalsIgnoreCase("shanghai")) {
            time = TimeZone.getTimeZone("Asia/Shanghai");
            TimeZone.setDefault(time);

        } else {
            System.out.println("Kan ej hämta tid.");
            System.exit(0);
        }
        System.out.println("Tiden i " + s + " är " + LocalTime.now());
    }

    public static void main(String[] args) {

        timeFromStockholmShanghaiToronto();
    }
}

 //   TimeZone tokyoTimeZone = TimeZone
//                .getTimeZone("Asia/Tokyo");
//        TimeZone.setDefault(tokyoTimeZone);
//
//        System.out.println(LocalTime.now());