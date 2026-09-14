import org.junit.Test;
import static org.junit.Assert.*;

//This is where the different unit and edge tests for CarRunner are 

public class calcgasMPGTest {
    
    @Test
    public void fiftyfivedividedby11equals5() {
        Hybrid MPG = new Hybrid();
        MPG.setMilesfromGas(55);
        MPG.setGallonsfromGas(11);
        assertEquals(5.0, MPG.calcgasMPG(), 0);
    }
    @Test 
    public void negativeMilesCheck() {
        Hybrid MPG = new Hybrid();
        assertThrows(IllegalArgumentException.class, 
            () -> {
                MPG.setMilesfromGas(-19);
            }
    );
        MPG.setGallonsfromGas(400);
    }
    
    @Test 
    public void negativeGallonsCheck() {
        Hybrid MPG = new Hybrid();
        MPG.setMilesfromGas(400);
        assertThrows(IllegalArgumentException.class, 
            () -> {
                MPG.setGallonsfromGas(-100);
            }
    );
    }
}