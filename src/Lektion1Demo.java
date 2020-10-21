/**
 * Created by Nick Danielsson
 * Date 2020-09-21
 * Time 09:29
 * Project ObjektoJava
 */
public class Lektion1Demo {
    public static void main(String[] args) {
        Person per1 = new Person("Nick","Prg 52",32);
        Person per2 = new Person("Camilla","Prg 52",30);

        Bilägare agare = new Bilägare(per1);
        Bilägare agare2 = new Bilägare(per2);



        Bil b1 = new Bil("ABC123","XC60","Volvo",agare);
        Bil b2 = new Bil("CBA321","Auris","toyota",agare2);

        System.out.println(b1.toString());
        b1.bilägare(agare2);
        System.out.println(b1.toString());








    }

}
