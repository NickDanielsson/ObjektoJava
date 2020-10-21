package Lektion2_Polymorfism.ExtraÖvning;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 13:00
 * Project ObjektoJava
 */
public class BilAnnons extends FordonsAnnons implements Publishable, Revenuable {

    private String color;
    private String winterTires;
    private String summerTires;

    public BilAnnons(){

    }

    public BilAnnons(int price, String headline, int modellYear, int miles, String color, String winterTires,
                     String summerTires) {
        super(price, headline, modellYear, miles);
        this.color = color;
        this.winterTires = winterTires;
        this.summerTires = summerTires;
    }

    @Override
     public void getAnnonsText(FordonsAnnons fordon) {

        System.out.println(fordon.headline + "\nAv modellår: " +fordon.modellYear + "\nMed " + fordon.miles + " gångna mil"
              + " för endast " + fordon.price + " kr!");
        System.out.println("i kulören " + this.color + "\nSommardäck: " + this.summerTires + "\nVinterdäck: " + this.winterTires);

    }

    @Override
    public void printHeader() {
        System.out.println(headline + price);
    }

    @Override
    public void completeAd() {
        System.out.println(headline + "\nAv modellår: " + modellYear + "\nMed " + miles + " gångna mil"
                + " för endast " + price + " kr!");
        System.out.println("i kulören " + this.color + "\nSommardäck: " + this.summerTires + "\nVinterdäck: " + this.winterTires);

    }
}
