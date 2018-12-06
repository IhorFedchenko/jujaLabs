package lab31;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinerTest{



    @Test
    public void queue_empty(){
        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();
        assertEquals("QueueEmpty",odessaSeaPort.printQueueShip());
    }

    @Test
    public void check_delete_in_empty_queue(){
        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();
        int expectedStatusRemoveShipInQueueEmpty = -1;
        assertEquals(expectedStatusRemoveShipInQueueEmpty, odessaSeaPort.removeShipFromBeginQueue());
    }

    @Test
    public void check_successful_remove_ship(){

        AbstractShip testLiner = new Liner("NameTestLiner",1000, 1000, 1000, 100);
    }
}
