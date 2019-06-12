package lab33;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FractionUtilsTest {

    @Test
    public void fraction_util(){
        BigInteger[] x = {new BigInteger("1"), new BigInteger("2")};
        BigInteger[] y = {new BigInteger("1"), new BigInteger("3")};
        BigInteger[] actual = FractionUtils.sum(x, y);
        assertEquals(5,actual[0].intValue());
        assertEquals(6,actual[1].intValue());

    }
}
