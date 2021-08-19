import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

//    public void areaOfRectangleShouldBeEqual(){
//
//    }

    @Test
    public void testForGetArea(){
        // Arrange
        Rectangle rectangle = new Rectangle();

        // Act
        int actualResult = rectangle.getArea(10, 30);

        // Assert
        assertEquals(actualResult, 300);
    }

    @Test
    public void testForGetAreaWithMultipleValues(){
        Rectangle rectangle = new Rectangle();
        assertEquals(rectangle.getArea(10, 50), 500);
        assertEquals(rectangle.getArea(20, 50), 1000);
        assertEquals(rectangle.getArea(5, 50), 250);
    }

    @Test
    public void testForGetParameter(){
        Rectangle rectangle = new Rectangle();
        assertEquals(rectangle.getParameter(10, 20), 60);
    }

}
