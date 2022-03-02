import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BagTests {
    @Test
    public void testWeight() {
        Bag bag = new Bag(13);
        assertEquals(bag.getWeight(), 13);
    }
    
}
