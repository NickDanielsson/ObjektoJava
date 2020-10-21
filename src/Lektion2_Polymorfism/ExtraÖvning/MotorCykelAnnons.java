package Lektion2_Polymorfism.ExtraÖvning;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 13:07
 * Project ObjektoJava
 */
public class MotorCykelAnnons extends FordonsAnnons implements Publishable, Revenuable {

    private int motorVolume;
    private String drivtyp;

    public MotorCykelAnnons(){

    }

    public MotorCykelAnnons(int price, String headline, int modellYear, int miles, int motorVolume, String drivtyp) {
        super(price, headline, modellYear, miles);
        this.motorVolume = motorVolume;
        this.drivtyp = drivtyp;
    }

    @Override
   public void getAnnonsText(FordonsAnnons fordon) {

        System.out.println(fordon.headline + "\nAv modellår: " +fordon.modellYear + "\nMed " + fordon.miles + " gångna mil"
                + " för endast " + fordon.price + " kr!");
        System.out.println("Motorvolym: " + this.motorVolume + " cm3 " + "\nDrivtyp: " + this.drivtyp);
    }

    @Override
    public void printHeader() {
        System.out.println(headline + price);
    }

    @Override
    public void completeAd() {
        System.out.println(headline + "\nAv modellår: " +modellYear + "\nMed " + miles + " gångna mil"
                + " för endast " + price + " kr!");
        System.out.println("Motorvolym: " + this.motorVolume + " cm3 " + "\nDrivtyp: " + this.drivtyp);
    }

    @Override
    public double calcualteRevenue(int price) {
        return (price * 0.90) * 0.80;
    }
}
