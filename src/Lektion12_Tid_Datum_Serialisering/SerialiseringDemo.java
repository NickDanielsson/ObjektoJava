package Lektion12_Tid_Datum_Serialisering;

import Lektion1.Person;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-10-13
 * Time 11:23
 * Project ObjektoJava
 */
public class SerialiseringDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person p1 = new Person("Nick", "Prg 52", 33);
        Person p2 = new Person("Camilla", "Prg 52", 30);
        Person p3 = new Person("Sam", "Prg 52", 5);
        List<Person> personLista = new LinkedList<Person>();
        personLista.add(p1);
        personLista.add(p2);
        personLista.add(p3);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("f.ser"));
        out.writeObject(p1);
       // out.writeObject(personLista);
        out.close();

        Person testIn;
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.ser"));
        testIn = (Person)in.readObject();
        System.out.println(testIn.getName());
        System.out.println(testIn.toString());

        List<Person> testList = new LinkedList<>();
        testList = (List<Person>) in.readObject();
        for (Person p: testList)
              {
                  System.out.println(p.toString());
        }

    }
}
