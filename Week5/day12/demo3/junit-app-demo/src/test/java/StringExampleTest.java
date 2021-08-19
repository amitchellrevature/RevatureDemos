import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringExampleTest {

    @Test
    public void TestForCompareFirstAndLastCharacterAreSame(){
        StringExample se = new StringExample();
        boolean actualValue= se.compareFirstAndLastCharactersAreSame("ABAB");
        boolean expectedValue = true;
        assertEquals(actualValue, true);
        //assertTrue(actualValue);
        //assertFalse(actualValue);
        //assertEquals(actualValue, false);
    }
}
