import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardingPassTest {
    @Test
    public void testBoardingPass() {
        BoardingPass boardingpass = new BoardingPass("R8,S4");
        assertEquals(boardingpass.getBoardingPass(),"R8,S4");
    }

    
    
}
