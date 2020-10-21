package Lektion2_Polymorfism.ExtraÖvning;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 13:05
 * Project ObjektoJava
 */
public class HusvagnsAnnons extends FordonsAnnons implements Publishable, Revenuable {

    private String shower;
    private int beds;

    public HusvagnsAnnons(){

    }

    public HusvagnsAnnons(int price, String headline, int modellYear, int miles, String shower, int beds) {
        super(price, headline, modellYear, miles);
        this.shower = shower;
        this.beds = beds;
    }

    @Override
    public void getAnnonsText(FordonsAnnons fordon) {

        System.out.println(fordon.headline + "\nAv modellår: " +fordon.modellYear + "\nMed " + fordon.miles + " gångna mil"
                + " för endast " + fordon.price + " kr!");
        System.out.println("Antal bäddar: " + this.beds + "\nUtrustad med dusch: " + this.shower);
    }

    @Override
    public void printHeader() {
        System.out.println(headline + price);
    }

    @Override
    public void completeAd() {
        System.out.println(headline + "\nAv modellår: " +modellYear + "\nMed " + miles + " gångna mil"
                + " för endast " + price + " kr!");
        System.out.println("Antal bäddar: " + this.beds + "\nUtrustad med dusch: " + this.shower);
    }

    @Override
    public double calcualteRevenue(int price) {
        return price * 0.80;
    }
}
