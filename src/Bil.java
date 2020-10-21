/**
 * Created by Nick Danielsson
 * Date 2020-09-21
 * Time 10:17
 * Project ObjektoJava
 */
public class Bil {

    protected String regNr;
    protected String modell;
    protected String brand;
    protected Bilägare bilägare;

    public Bil(String regNr, String modell, String brand, Bilägare bilägare) {
        this.regNr = regNr;
        this.modell = modell;
        this.brand = brand;
        this.bilägare = bilägare;
    }

    public void newBilägare (Bilägare bilägare){
        this.bilägare = bilägare;
    }

    public void bilägare(Bilägare agare2) {
    }

    @Override
    public String toString() {
        return "Bil{" +
                "regNr='" + regNr + '\'' +
                ", modell='" + modell + '\'' +
                ", brand='" + brand + '\'' +
                ", bilägare=" + bilägare +
                '}';
    }
}
