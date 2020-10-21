package Inlämningsuppgift_2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Calendar;

/**
 * Created by Nick Danielsson
 * Date 2020-10-13
 * Time 21:05
 * Project ObjektoJava
 */
public class Demodemo {
    public static void main(String[] args) throws IOException {
        /*
        LocalDate todaysDate = LocalDate.now();
        System.out.println(todaysDate);
        LocalDate otherDate = LocalDate.parse("2019-10-14");
        System.out.println(otherDate);
        LocalDate todayMinusYear = todaysDate.minusYears(1);

        System.out.println(todayMinusYear);
        if (otherDate.compareTo(todayMinusYear) > 0 ){
            System.out.println("mindre än ett år");
        }
        else{
            System.out.println("mer än ett år");
        }
*/


        LocalDate date = LocalDate.now();
        String pathName = "src/Inlupp2/TEST.txt";
        Path path = Paths.get(pathName);
        Files.createDirectories(path.getParent());
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        try (BufferedWriter out = Files.newBufferedWriter(path, StandardOpenOption.APPEND);) {
            out.append("Nick").append(" ").append("871018").append(" ").append(String.valueOf(date));
            out.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
