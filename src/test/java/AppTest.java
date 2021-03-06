import engine.world.Location;
import engine.world.World;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    /*
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
    */

    @Test public void testLocationDistance() {
        World world = new World();
        Location l1 = new Location(1.0, 3.0, world);
        Location l2 = new Location(6.0, 9.0, world);
        assertEquals(7.81025, l1.distance(l2),0.00005);
    }

}
