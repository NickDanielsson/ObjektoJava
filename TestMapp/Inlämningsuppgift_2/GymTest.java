package Inlämningsuppgift_2;

import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by Nick Danielsson
 * Date 2020-10-15
 * Time 14:27
 * Project ObjektoJava
 */
public class GymTest {

    Gym gym = new Gym();

    @Test
    public void generateCustomerListTest(){
        List<GymKund> testList = gym.generateCustomerList();
        assertEquals(14, testList.size());
        assertNotEquals(10, testList.size());

    }
    @Test
    public void searchGymKunder(){
        LocalDate todaysDateMinusOneYear = LocalDate.now().minusYears(1);
        GymKund kund1 = new GymKund("871018","Nick", LocalDate.of(2020,10,14));
        GymKund kund2 = new GymKund("750323","Simon", LocalDate.of(2017,12,14));

        assertTrue(kund1.membershipDate.compareTo(todaysDateMinusOneYear) > 0 );
        assertFalse(kund2.membershipDate.compareTo(todaysDateMinusOneYear) > 0);
        assertFalse(kund1.membershipDate.compareTo(todaysDateMinusOneYear) < 0 );
    }

}
