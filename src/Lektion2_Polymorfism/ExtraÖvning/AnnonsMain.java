package Lektion2_Polymorfism.ExtraÖvning;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 13:11
 * Project ObjektoJava
 */
public class AnnonsMain {
    public static void main(String[] args) {

        FordonsAnnons f1 = new BilAnnons(3500,"Blabla",2008,9000,"Gul",
                "nej","ja");

        BilAnnons b1 = new BilAnnons(45000,"Superfin begagnad Toyota!",2010,15000,"Röd",
                "Ja","Ja");

        HusvagnsAnnons h1 = new HusvagnsAnnons(550000,"Perfekt husvagn för familjen!",2017,
                3000,"Ja",5);

        MotorCykelAnnons m1 = new MotorCykelAnnons(133000,"Motorcykel SKIT FIN!",2013,1400,
                900,"Kedja");


        f1.getAnnonsText(f1);
        System.out.println();
        b1.getAnnonsText(b1);
        System.out.println();
        h1.getAnnonsText(h1);
        System.out.println();
        m1.getAnnonsText(m1);

        System.out.println("*******");
        b1.printHeader();
        System.out.println();
        b1.completeAd();
        System.out.println("******");

        System.out.println("Vinst bil: " + b1.calcualteRevenue(b1.price));
        System.out.println("Vinst husvagn: " + h1.calcualteRevenue(h1.price));
        System.out.println("Vinst motorcykel: " + m1.calcualteRevenue(m1.price));

    }
}
