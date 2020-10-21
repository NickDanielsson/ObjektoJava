package Lektion11_Filhantering_Skrivning;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * Created by Nick Danielsson
 * Date 2020-10-12
 * Time 09:48
 * Project ObjektoJava
 */
public class FilDemo {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/Lektion11_Files/Testfil1.txt");
        if(!Files.exists(path)){
        Files.createFile(path);
        }
        BufferedWriter out = Files.newBufferedWriter(path);
        out.write("test test     test");
        out.close();
        /*

        Path path2 = Paths.get("src/Lektion11_Files/testFil2.txt");
        Files.copy(path,path2);

         out = Files.newBufferedWriter(path2,StandardOpenOption.APPEND);

        out.newLine();
        out.append("Mer text efter kopiering");
        out.close();*/
    }
}
