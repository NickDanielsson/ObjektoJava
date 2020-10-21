package Lektion4_Listor_Arrayer;

/**
 * Created by Nick Danielsson
 * Date 2020-09-25
 * Time 10:14
 * Project ObjektoJava
 */
public class MainDemo {
    public static void main(String[] args) {

        String[] kurser = new String[3];
        kurser[0] = "OOP";
        kurser[1] = "Affärsmannaskap";
        kurser[2] = "Java Backend";

        Student s1 = new Student("Nick","871018",kurser);
        Student s2 = new Student("Camilla","900624",kurser);
        Student[] studenter = new Student[10];
        studenter[0] = s1;
        studenter[1] = s2;

        Lärare l1 = new Lärare("Sigrun","600414",kurser);

        Kurs kurs = new Kurs(studenter,l1,"OOP");

        printKurs(kurs);

    }

    public static void printKurs(Kurs course){
        System.out.println(course.kursNamn);
        System.out.println(course.teacher);
        for (int i = 0; i < course.Studenter.length; i++) {
            if (course.Studenter[i] != null)
                System.out.println(course.Studenter[i]);
        }

    }
}
