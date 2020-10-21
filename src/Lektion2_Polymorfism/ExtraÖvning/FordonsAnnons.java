package Lektion2_Polymorfism.ExtraÖvning;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 12:51
 * Project ObjektoJava
 */
public class FordonsAnnons {

    protected int price;
    protected String headline;
    protected int modellYear;
    protected int miles;

    public FordonsAnnons(){

    }

    public FordonsAnnons(int price, String headline, int modellYear, int miles) {
        this.price = price;
        this.headline = headline;
        this.modellYear = modellYear;
        this.miles = miles;
    }

    public void getAnnonsText(FordonsAnnons fordon){

        System.out.println(fordon.headline + "\nAv modellår: " +fordon.modellYear + "\nMed " + fordon.miles + " gångna mil"
        + " för endast " + fordon.price + " kr!");

    }

}
