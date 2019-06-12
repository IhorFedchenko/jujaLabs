package lab33;

import java.math.BigInteger;

public class FractionUtils {
    public static BigInteger[] sum(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = new BigInteger[]{new BigInteger("0"), new BigInteger("0")};
        BigInteger x1ResultA = x[0].multiply(y[1]);
        BigInteger x1ResultB = (x[1].multiply(y[0]));
        BigInteger xResult = x1ResultA.add(x1ResultB);
        BigInteger yResult = x[1].multiply(y[1]);
        BigInteger commonFactor = xResult.gcd(yResult);
        result[0] = xResult.divide(commonFactor);
        result[1] = yResult.divide(commonFactor);
        return result;
    }
}