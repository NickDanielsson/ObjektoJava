package Lektion5_Enum;

/**
 * Created by Nick Danielsson
 * Date 2020-09-29
 * Time 10:26
 * Project ObjektoJava
 */
public class Romerskasiffror {

    public enum Romersksiffra {I(1),V(5),X( 10),L(50),C(100),D(500),M(1000);


        final Integer digit;
        Romersksiffra(Integer digit) {

            this.digit = digit;
        }

        public Integer getDigit() {
            return digit;
        }
    }

}
