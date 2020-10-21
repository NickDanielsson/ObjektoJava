package Bankomaten;

/**
 * Created by Nick Danielsson
 * Date 2020-09-30
 * Time 13:11
 * Project ObjektoJava
 */
public class Person {

    protected String name;
    protected String idNr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNr() {
        return idNr;
    }

    public void setIdNr(String idNr) {
        this.idNr = idNr;
    }

    public Person (){}

    public Person(String name, String idNr) {
        this.name = name;
        this.idNr = idNr;
    }
}
