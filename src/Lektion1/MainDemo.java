package Lektion1;

/**
 * Created by Nick Danielsson
 * Date 2020-09-21
 * Time 15:01
 * Project ObjektoJava
 */
public class MainDemo {
    public static void main(String[] args) {

        CarOwner p1 = new CarOwner("Nick","Prg 52",32);
        CarOwner p2 = new CarOwner("Camilla", "Prg 52",30);
        CarOwner p3 = new CarOwner("Anja","Stan",30);

        Car c1 = new Car("ABC123","Auris","Toyota",p1);
        Car c2 = new Car("CBA321","Prius","Toyota",p2);

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        c1.newCarOwner(p3);

        System.out.println(c1.toString());
    }
}
