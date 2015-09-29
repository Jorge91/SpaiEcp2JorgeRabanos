package miw.upm.es.SpaiEcp2JorgeRabanos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PointTest {

private Point point;
	
	@Before
	public void setUp() {
		this.point = new Point(5,10);
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
		Point point2 = new Point(1,1);
		this.point.translateOrigin(point2);
		
		assertEquals(this.point.getX(), 4, 0);
		assertEquals(this.point.getY(), 9, 0);
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
	
	
	

}
