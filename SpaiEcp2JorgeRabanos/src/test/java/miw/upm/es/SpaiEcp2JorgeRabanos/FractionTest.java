package miw.upm.es.SpaiEcp2JorgeRabanos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
	private Fraction fraction;
	
	@Before
	public void setUp() {
		this.fraction = new Fraction(3,4);
	}

	@Test
	public void decimalTest() {
		assertEquals(this.fraction.decimal(), 0.75, 0);
	}
	
	@Test
	public void numeratorTest() {
		assertEquals(this.fraction.getNumerator(), 3, 0);
	}
	
	@Test
	public void denominatorTest() {
		assertEquals(this.fraction.getDenominator(), 4, 0);
	}
	
	@Test
	public void constructorTest() {
		Fraction fraction2 = new Fraction();
		
		assertEquals(fraction2.getNumerator(), 1, 0);
		assertEquals(fraction2.getDenominator(), 1, 0);
	}

}
