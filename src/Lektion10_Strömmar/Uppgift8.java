package Lektion10_Strömmar;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-10-08
 * Time 10:28
 * Project ObjektoJava
 */
public class Uppgift8 {

    String text;

    public Double parseDoubleValue(String text){
        double temp;
        text.trim();
        String newText = text.replace(",",".");
        temp = Double.parseDouble(newText);
        return temp;
    }
    public List<Double> generateListFromFile(){
        List<Double> allMeasurments = new LinkedList<>();
        try( BufferedReader inRead = new BufferedReader(new FileReader("temp.txt"));)
            {
                while((text = inRead.readLine()) !=null){
                    Double temp = parseDoubleValue(text);
                    allMeasurments.add(temp);
                }
        } catch (Exception e){
            System.out.println("Någonting gick fel");
            e.printStackTrace();
            System.exit(0);
        }
        return allMeasurments;
    }

    public Double minMeasurement(List<Double> allMeasurements){
        double maxTemp = Double.MAX_VALUE;
        for (var d: allMeasurements){
            if (d < maxTemp){
                maxTemp = d;
            }
        }
        return maxTemp;
    }

    public Double maxMeasurement(List<Double> allMeasurements){
        double minTemp = Double.MIN_VALUE;
        for (var d: allMeasurements){
            if (d > minTemp){
                minTemp = d;
            }
        }
        return minTemp;
    }

    public Double calculateAvrage(List<Double> allMeasurements){
        double sum = 0;
        for (var d: allMeasurements){
            sum+= d;
        }
        return sum / allMeasurements.size();
    }

    public Uppgift8(){
        List<Double> allMeasurements = generateListFromFile();
        System.out.printf("Maxtemp är %.1f\nMintemp är %.1f\nMedeltemp är %.1f\n",maxMeasurement(allMeasurements)
        ,minMeasurement(allMeasurements),calculateAvrage(allMeasurements));
    }

    public static void main(String[] args) {
        Uppgift8 x = new Uppgift8();
    }
}
