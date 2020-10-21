package Lektion8_Filhantering_TDD;

/**
 * Created by Nick Danielsson
 * Date 2020-10-06
 * Time 10:57
 * Project ObjektoJava
 */
public class Triangle implements Figure {

    protected int base;
    protected int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getCircumference() {
       return base + lengthOfSide()*2;
    }

    public double lengthOfSide() {
        return Math.sqrt(Math.pow(base/2,2) + Math.pow(height,2));
    }
}
