import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void addNumberTest(){
        // Arrange
        Calculator cal = new Calculator();

        // Act
        int actualResult = cal.addNumber(10,20);

        // Assert
        int expectedResult = 30;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testForFindMaxNumber(){
        Calculator cal = new Calculator();
        int actualResult = cal.findMaxNumber(new int[]{1,2,3});
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);

        int act2 = cal.findMaxNumber(new int[]{ -12,-5,-7, -4,-1 });
        int exp2 = -1;
        assertEquals(exp2, act2);

    }

    @Test
    public void testForGetCube(){
        int actualResult =  calculator.getCube(3);
        int expectedResult = 27;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testForReverseString(){
        assertEquals("cba", calculator.reverseString("abc"));
    }

}
