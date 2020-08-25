import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {
    private Bus bus;



    @Before
    public void before() {
        bus = new Bus();
    }

    @Test
    public void hasNoPassengers() {
        assertEquals(0, bus.getPassengers());
    }

}