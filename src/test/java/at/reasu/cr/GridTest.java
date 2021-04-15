package at.reasu.cr;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import org.testng.annotations.Test;

public class GridTest {

    @Test
    public void canCreateGrid_test() {
        Grid grid = new Grid();
        assertNotNull(grid);
    }

    @Test
    public void setupGridSize5_test() {
        Integer x = 5;
        Integer y = 5;

        Grid g = new Grid(x, y);
        assertEquals(g.getSizeX(), x);
        assertEquals(g.getSizeY(), y);
    }

    @Test
    public void changeGridSize7_test() {
        Integer x = 7;
        Integer y = 7;

        Grid g = new Grid(x, y);
        assertEquals(g.getSizeX(), x);
        assertEquals(g.getSizeY(), y);
    }

    @Test
    public void isAlive1_1_test() {
        Grid g = new Grid();
        assertEquals(g.isAlive(1, 1), 1);
    }


}