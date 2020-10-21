package Lektion8_Filhantering_TDD;

/**
 * Created by Nick Danielsson
 * Date 2020-10-06
 * Time 09:33
 * Project ObjektoJava
 */
public class Square implements Figure{

    protected int length;
    protected int width;

    public Square () {}

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public double getArea() {

        return length*width;
    }

    @Override
    public double getCircumference() {

      return length * 2 + width * 2;
    }
}
