package lab37;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {

    @Test
    public void shiftRight_principle(){
        String input = "ABCDE";
        System.out.println("Shift_1 "+input.substring(4)+"#"+input.substring(0,4));
        System.out.println("Shift_2 "+input.substring(3)+"#"+input.substring(0,3));
        System.out.println("Shift_3 "+input.substring(2)+"#"+input.substring(0,2));
        System.out.println("Shift_4 "+input.substring(1)+"#"+input.substring(0,1));
    }

    @Test
    public void shiftRight_ABC_4(){
        String actual = StringUtils.rightShift("ABC", 4);
        String expected = "CAB";
        assertEquals(expected, actual);
    }
}
