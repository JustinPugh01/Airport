import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class PlaneTests {
    @Test
    public void testPlane(){
        Plane plane = new Plane(2341);
        assertEquals(plane.getPlaneNumber(),2341);

    } 

    @Test 
    public void testaarival(){
        Plane plane = new Plane(541);
        Passenger passenger = new Passenger("Scully");
        passenger.setSeatNumber("R45,S2");
        plane.checkInPassenger(passenger);
        boolean isInPlane = (plane.getPassenger().contains(passenger));
        assertEquals(isInPlane, true);
    }
    
    
}
