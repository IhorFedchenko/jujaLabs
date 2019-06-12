package lab32;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinerTest {

    @Test
    public void check_arrays_length_more_than_zero(){
        String testLinerName = "TestLinerName";
        float testLinerLength = 1000;
        float testLinerWidth = 1000;
        float testLinerDisplacement = 1000;
        int testLinerPassengers = 100;
        String testCargoName = "TestCargoName";
        float testCargoLength = 1000;
        float testCargoWidth = 1000;
        float testCargoDisplacement = 1000;
        float testCargoTonnage = 100;
        String testTankerName = "TestTankerName";
        float testTankerLength = 1000;
        float testTankerWidth = 1000;
        float testTankerDisplacement = 1000;
        float testTankerVolume = 100;

        String expectedSortedShipString = "TestTankerName=25000.0TestCargoName=55000.0TestLinerName=100000.0";

        AbstractShip[] arrayShips = {
                new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers),
                new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage),
                new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume)
        };

        assertEquals(expectedSortedShipString, OdessaSeaPort.sortSumPaymentAsc(arrayShips));
    }
}
