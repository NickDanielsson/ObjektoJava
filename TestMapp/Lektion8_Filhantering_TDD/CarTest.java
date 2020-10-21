package Lektion8_Filhantering_TDD;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by Nick Danielsson
 * Date 2020-10-06
 * Time 11:47
 * Project ObjektoJava
 */
public class CarTest {
    Car c1 = new Car(10000,8000,200);

    @Test
    public final void milesDriven(){
        assertEquals(2000, c1.milesDriven());
    }

    @Test
    public final void gasPerMile(){
        assertEquals(0.1, c1.gasPerMile());
    }
}
