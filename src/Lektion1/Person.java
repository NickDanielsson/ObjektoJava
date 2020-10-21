package Lektion1;

import java.io.Serializable;

/**
 * Created by Nick Danielsson
 * Date 2020-09-21
 * Time 14:38
 * Project ObjektoJava
 */
public class Person implements Serializable {
    private String name;
    private String address;
    private int age;

    public Person (){

    }

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
