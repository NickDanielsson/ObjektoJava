package Lektion2_Polymorfism.ExtraÖvning;

/**
 * Created by Nick Danielsson
 * Date 2020-09-24
 * Time 12:08
 * Project ObjektoJava
 */
public interface Revenuable {

    default double calcualteRevenue(int price){
        return price * 0.8;
    }
}
