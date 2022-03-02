import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AirportTests {
    @Test
    public void testAiport(){

        Airport airport = new Airport("Manchester Aiport");
        Plane plane = new Plane(657);
        Passenger passenger = new Passenger("Scully");
        plane.checkInPassenger(passenger);
        passenger.setSeatNumber("R45,S2");
        airport.inboundplane(plane);
        boolean isInAirport = (airport.getPlanes().contains(plane))&&(plane.getPassenger().contains(passenger));
        assertEquals(isInAirport, true);



        
    }
    
}
