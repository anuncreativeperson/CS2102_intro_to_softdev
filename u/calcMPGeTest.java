import org.junit.Test;
import static org.junit.Assert.*;

//This is where the different unit and edge tests for CarRunner are 

public class calcMPGeTest {
    
    @Test
    public void fiftyfivedividedby11equals5() {
        Hybrid MPGe = new Hybrid();
        MPGe.setElectricMiles(120);
        MPGe.setTotalkWh(33.7);
        assertEquals(120, MPGe.calcMPGe(), 0);
    }
    
    @Test 
    public void negativeEmilesCheck() {
        Hybrid MPGe = new Hybrid();
        assertThrows(IllegalArgumentException.class, 
            () -> {
                MPGe.setElectricMiles(-5);
            }
    );
        MPGe.setTotalkWh(400);
    }
    
    @Test 
    public void negativekWhCheck() {
        Hybrid MPGe = new Hybrid();
        MPGe.setElectricMiles(400);
        assertThrows(IllegalArgumentException.class, 
            () -> {
                MPGe.setTotalkWh(-5);
            }
    );
    }
}