package Lektion8_Filhantering_TDD;

import Lektion8_Filhantering_TDD.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Nick Danielsson
 * Date 2020-10-06
 * Time 09:35
 * Project ObjektoJava
 */
public class SquareTest {
    Square sq = new Square(10,5);

    @Test
    public final void setterTest() {

        assertEquals(5, sq.getWidth());
    }
    @Test
    public final void getAreaTest() {

        assertTrue(sq.getArea() == 50);
    }

    @Test
    public final void getCircumferenceTest() {

      assertTrue(sq.getCircumference() == 30);
    }

}
