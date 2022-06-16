package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Demo {


    @Test
    public void test1(){
        String str1 = "catdog";
        boolean expectedValue1 = true;
        String str2 = "catcat";
        boolean expectedValue2 = false;
        String str3 = "1cat1cadodog";
        boolean expectedValue3 = true;

        Assertions.assertEquals(expectedValue1,catDog(str1));
        Assertions.assertEquals(expectedValue2, catDog(str2));
        Assertions.assertEquals(expectedValue3, catDog(str3));
    }

    public static boolean catDog(String str) {
        int cat=0,dog=0;
        for (int i=0;i<str.length()-2;i++) {
            if (str.substring(i,i+3).equals("cat")) {
                cat++;
            }
            if (str.substring(i,i+3).equals("dog")) {
                dog++;
            }
        }
        return cat==dog;
    }


}
