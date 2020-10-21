package Bankomaten;

/**
 * Created by Nick Danielsson
 * Date 2020-09-30
 * Time 13:42
 * Project ObjektoJava
 */
public class Staff extends Person {

    private int salary;

    public Staff (){}

    public Staff(String name, String idNr, int salary) {
        super(name, idNr);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
