import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BagTests {
    @Test
    public void testWeight() {
        try {
            Bag bag = new Bag(13);
            assertEquals(bag.getWeight(), 13);
        } catch (Exception err) {

        }
    }

    @Test
    public void testWeighterror() throws Exception {
        try {
            new Bag(0);
        } catch (Exception error) {
            assertEquals(error.getMessage(), "Bag must have a weight");
        }
    }

}
