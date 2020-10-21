package Lektion2_Polymorfism;

import Lektion3_Interface.Hjulburen;
import Lektion3_Interface.Printable;

/**
 * Created by Nick Danielsson
 * Date 2020-09-22
 * Time 11:21
 * Project ObjektoJava
 */
public class MainDemo {
    public static void main(String[] args) {

        Båt boat = new Båt(20,1000,900);
        Tåg train = new Tåg(80,20000,5);
        Bil car = new Bil(100,1500,5,1);
        Cykel bike = new Cykel(25,20,12,1);

        printObjekts(boat,train,car,bike);

        boat.printViaInterface();
        train.printViaInterface();
        car.printViaInterface();
        bike.printViaInterface();
        System.out.println("******");
        Hjulburen h1 = bike;
        System.out.println(h1.getAntalHjul());
        h1 = car;
        System.out.println(h1.getAntalHjul());
        System.out.println("******");

        Hjulburen h2 = new Bil(50,1100,6,1);
        System.out.println(h2.getAntalHjul());



    }
    public void printFordon (Fordon fordon){
        fordon.printMe();
    }

    public static void printObjekts(Båt boat, Tåg train, Bil car, Cykel bike){
        boat.printMe();
        train.printMe();
        car.printMe();
        bike.printMe();
    }
}
