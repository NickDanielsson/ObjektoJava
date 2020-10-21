package Lektion12_Tid_Datum_Serialisering;

import java.time.Duration;
import java.time.LocalTime;

/**
 * Created by Nick Danielsson
 * Date 2020-10-13
 * Time 10:52
 * Project ObjektoJava
 */
public class VideotapeDemo {
    public static void main(String[] args) {
        LocalTime t1 = LocalTime.of(1,30);
        LocalTime t2 = LocalTime.of(0,30);
        System.out.println(Duration.between(t2,t1).toMinutes());
        int timeLeft = (int) Duration.between(t2,t1).toMinutes();

    }
}
