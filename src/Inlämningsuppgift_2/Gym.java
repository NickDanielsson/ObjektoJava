package Inlämningsuppgift_2;


import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Nick Danielsson
 * Date 2020-10-11
 * Time 17:14
 * Project ObjektoJava
 */
public class Gym {

    public List<GymKund> generateCustomerList() {

        List<GymKund> customerList = new LinkedList<>();
        String firstLine = "";
        String secondLine = "";
        Path filePath = Paths.get("src/Inlämningsuppgift_2/customers.txt");

        try (Scanner inRead = new Scanner(filePath)) {
            while (inRead.hasNext()) {
                firstLine = inRead.nextLine();
                String[] first = firstLine.split(",");

                if (inRead.hasNext()) {
                    secondLine = inRead.nextLine();
                    LocalDate second = LocalDate.parse(secondLine);
                    GymKund g1 = new GymKund(first[0], first[1].substring(1), second);
                    customerList.add(g1);
                }
            }

        } catch (NoSuchFileException e) {
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("Det gick inte att läsa från fil");
            e.printStackTrace();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Okänt fel.");
            e.printStackTrace();
            System.exit(0);
        }
        return customerList;
    }

    public void searchGymKunder() {

        Gym gym = new Gym();
        LocalDate todaysDateMinusOneYear = LocalDate.now().minusYears(1);
        int nameInList = 0;

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ange namn på gymkund du söker eller personnr. ");
            String customer = sc.nextLine();
            if (customer.isEmpty()) {
                throw new NullPointerException();
            }
            for (GymKund x : gym.generateCustomerList()) {
                if (x.getName().equalsIgnoreCase(customer) || x.getiD().equalsIgnoreCase(customer)) {
                    nameInList++;
                    if (x.membershipDate.compareTo(todaysDateMinusOneYear) > 0) {
                        System.out.println(x.getName() + " är en nuvarande kund.");
                        x.printCustomerToFile();

                    } else {
                        System.out.println("Medlemskap för " + x.getName() + " har gått ut.");
                    }
                }
            }

        } catch (NullPointerException e) {
            System.out.println("Du har inte matat in information.");
            e.printStackTrace();
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Okänt fel.");
            e.printStackTrace();
            System.exit(0);
        }
        if (nameInList < 1) {
            System.out.println("Personen kunde inte hittas.");
        }
    }


    public static void main(String[] args) {
        Gym gym = new Gym();
        gym.searchGymKunder();

    }
}
