package lab34;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class BigIntegerUtilsTest {

    @Test
    public void to_bit_str(){
        BigInteger k = new BigInteger("10");
        assertEquals("1010", BigIntegerUtils.toBitStr(k));
    }
}
