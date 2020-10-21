package Övning3b_Listor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-27
 * Time 09:44
 * Project ObjektoJava
 */
public class MainListDemo {
    public static void main(String[] args) {

        List<String> kurser = new LinkedList<>();
        kurser.add(0,"OOP");
        kurser.add(1,"Affärsmannaskap");
        kurser.add(2,"Javautveckling");
        kurser.add(3,"Javabackend");

        Lärare l1 = new Lärare("Anna","750403",kurser);

        Student s1 = new Student("Nick","871018",kurser);
        Student s2 = new Student("Peter","800627",kurser);
        Student s3 = new Student("Camilla","900624",kurser);

        List<Student> students = new LinkedList<>();
        students.add(0,s1);
        students.add(1,s2);
        students.add(2,s3);

        Kurs kurs1 = new Kurs("OOP",students,l1);
        printKurs(kurs1);


    }
    public static void printKurs (Kurs kurs){
        System.out.println("Kursnamn: " + kurs.kursNamn);
        System.out.println("Lärare: " +kurs.teacher.name);
        for (var studenter: kurs.students) {
            System.out.println(studenter);
        }

    }

}
