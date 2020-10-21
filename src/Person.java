/**
 * Created by Nick Danielsson
 * Date 2020-09-21
 * Time 10:06
 * Project ObjektoJava
 */
public class Person {

    private String name;
    protected String adress;
    protected int age;

    public Person (){

    }
    public Person (String name, String adress, int age) {
        this.name = name;
        this.adress = adress;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                '}';
    }
}
