package Övning3b_Listor;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-27
 * Time 10:55
 * Project ObjektoJava
 */
public class MainListDemo2 {
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
       // printKurs(kurs1);

        Kurs2 k1 = new Kurs2("Java",l1);
        Kurs2 k2 = new Kurs2("Python",l1);
        Kurs2 k3 = new Kurs2("C#",l1);

        Deltagande d1 = new Deltagande(s1,k1);
        Deltagande d2 = new Deltagande(s2,k2);
        Deltagande d3 = new Deltagande(s3,k3);

        List<Deltagande> dList = new LinkedList<>();
        dList.add(d1);
        dList.add(d2);
        dList.add(d3);

        printStudent(s1);;



    }
    public static void printKurs (Kurs2 kurs){
        System.out.println("Kursnamn: " + kurs.kursNamn);


    }
    public static void printStudent(Student student){
        System.out.println("Student namn: " + student.name);
        for (var studkurs : student.kurser){
            System.out.println(studkurs);

        }
    }
}
