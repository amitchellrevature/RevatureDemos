import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CounterTest {

    Counter counter;

    @BeforeEach
    public void setup(){
        System.out.println("before test");
        counter = new Counter();
    }

    @Test
    public void testForCounterIncrement(){
        System.out.println("increment test");
//        Counter counter = new Counter();
        int countValue =  counter.increment();
        assertEquals(countValue, 1);;
    }

    @Test
    public void testForCounterDecrement(){
        System.out.println("decrement test");
  //      Counter counter = new Counter();
        int countValue =  counter.decrement();
        assertEquals(countValue, -1);;
    }

    @AfterEach
    public void tearDown(){
        System.out.println("after test");
        counter = null;
    }
}
