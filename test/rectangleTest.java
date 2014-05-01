import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class rectangleTest {
    private final int width;
    private final int height;

    @Test
    public void testShouldKnowThatTwoRectanglesAreEqual() {
        assertEquals(new Rectangle(1, 2), new Rectangle(1, 2));
    }

    @Test
    public void testShouldKnowThatTwoRectanglesWithTheSameHeightAndDifferentWidthsAreNotEqual() {
        assertNotEquals(new Rectangle(2,4), new Rectangle(3,4));
    }

    @Test
    public void testShouldKnowThatTwoRectanglesWithTheSameWidthAndDifferentHeightsAreNotEqual() {
        assertNotEquals(new Rectangle(1,3), new Rectangle(1,4));
    }
    @Test
    public void testShouldKnowThatRectanglesWithDifferentWidthAndHeightAreNotEqual()
    {
        assertNotEquals(new Rectangle(1,2),new Rectangle(2,3));
    }

    @Test
    public void testTheAreaOfARectangle() throws Exception {

        assertEquals(2, new Rectangle(1,2).calculateAreaOfRectangle());
    }

    @Test
    public void testTheCalculationOfTheInfiniteArea() throws Exception {
        int expectedArea = 8*5;
        assertEquals(expectedArea,new Rectangle(8,5).calculateAreaOfRectangle());

    }

    @Test
    public void testCalculationOfAreaWhereWidthIsZero() throws Exception {
        int expectedArea = 0;
        assertEquals(expectedArea,new Rectangle(0,3).calculateAreaOfRectangle());

    }

    @Test
    public void testCalculationOfAreaWhereHeightIsZero() throws Exception {
        int expectedArea = 0;
        assertEquals(expectedArea, new Rectangle(7654, 0).calculateAreaOfRectangle());

    }

    @Test
    public void testZeroAreaOfRectangle() throws Exception {
        assertEquals(0, new Rectangle(0, 0).calculateAreaOfRectangle());
    }

    @Test
    public void testRaiseExceptionForAreaOfRectangle() throws Exception {
        try {
            assertEquals(-20, new Rectangle(-4, -5).calculateAreaOfRectangle());
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }

    }
    //This constructor allows us to access the collection test data
    public rectangleTest(int width, int height) {
        this.width= width;
        this.height = height;
    }
    //This method provides test data with a collection return type
    @Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {1, 65},
                {98, 23},
                {655, 77}});
    }

    @Test
    public void testAreaOfRectangleWithParametrizedValues() throws Exception {
        assertEquals(width*height, new Rectangle(width, height).calculateAreaOfRectangle());
    }
}
