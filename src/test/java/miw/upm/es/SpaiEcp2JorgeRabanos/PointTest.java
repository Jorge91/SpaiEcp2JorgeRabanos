package miw.upm.es.SpaiEcp2JorgeRabanos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointTest {

    private Point point;

    @Before
    public void setUp() {
        this.point = new Point(5, 10);
    }

    @Test
    public void moduleTest() {
        assertEquals(this.point.module(), 11.18, 0.1);
    }

    @Test
    public void phaseTest() {
        assertEquals(this.point.phase(), 1.10, 0.1);
    }

    @Test
    public void translateTest() {
        Point point2 = new Point(1, 1);
        this.point.translateOrigin(point2);

        assertEquals(this.point.getX(), 4, 0);
        assertEquals(this.point.getY(), 9, 0);
    }

    @Test
    public void distanceTest() {
        Point point2 = new Point(8, 20);
        assertEquals(this.point.distancia(point2), 10.4403, 10e-5);
    }

    @Test
    public void distanceFromOriginEqualsModuleTest() {
        Point point2 = new Point();
        assertEquals(this.point.distancia(point2), this.point.module(), 0);
    }

    @Test
    public void distanceZeroTest() {
        Point point2 = new Point(point.getX(), point.getY());
        assertEquals(this.point.distancia(point2), 0, 0);
    }

    @Test
    public void distanceNegativeCoordinatesTest() {
        Point point2 = new Point(-5, -10);
        assertEquals(this.point.distancia(point2), 22.3606, 10e-5);
    }

    @Test
    public void constructorTest() {
        Point point2 = new Point();

        assertEquals(point2.getX(), 0, 0);
        assertEquals(point2.getY(), 0, 0);
    }

    @Test
    public void stringTest() {
        Point point2 = new Point();

        assertEquals(point2.toString(), "Point[0,0]");
    }

    public void updateCoordinateTest() {
        // before
        assertEquals(point.getX(), 5, 0);
        assertEquals(point.getY(), 10, 0);
        // update coordinate
        point.setX(10);
        point.setY(20);
        // after
        assertEquals(point.getX(), 10, 0);
        assertEquals(point.getY(), 20, 0);
    }
}
