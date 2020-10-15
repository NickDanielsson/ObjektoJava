package Inlämningsuppgift_2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDate;

/**
 * Created by Nick Danielsson
 * Date 2020-10-12
 * Time 20:19
 * Project ObjektoJava
 */
public class GymKund implements IPrintCustomerToFile {

    protected String iD;
    protected String name;
    protected LocalDate membershipDate;

    public GymKund(String iD, String name, LocalDate membershipDate) {
        this.iD = iD;
        this.name = name;
        this.membershipDate = membershipDate;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    public void setMembershipDate(LocalDate membershipDate) {
        this.membershipDate = membershipDate;
    }

    @Override
    public String toString() {
        return "GymKund{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", membershipDate='" + membershipDate + '\'' +
                '}';
    }

    @Override
    public void printCustomerToFile() throws IOException {

        LocalDate date = LocalDate.now();
        String pathName = "src/Inlämningsuppgift_2/" + name + ".txt";
        Path path = Paths.get(pathName);
        Files.createDirectories(path.getParent());
        if (!Files.exists(path)) {
            Files.createFile(path);
        }
        try (BufferedWriter out = Files.newBufferedWriter(path, StandardOpenOption.APPEND);) {
            out.append(name).append(", ").append(iD).append(", ").append(String.valueOf(date));
            out.newLine();

        } catch (NoSuchFileException e) {
            System.out.println("Filen kunde inte hittas.");
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Det går inte att skriva till filen.");
            e.printStackTrace();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Okänt fel.");
            e.printStackTrace();
            System.exit(0);
        }

    }
}
