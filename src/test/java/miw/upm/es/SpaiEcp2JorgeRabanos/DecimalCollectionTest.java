package miw.upm.es.SpaiEcp2JorgeRabanos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
	private DecimalCollection decimalCollection;
	
	@Before
	public void setUp() {
		this.decimalCollection = new DecimalCollection();
		
		this.decimalCollection.add(2.0);
		this.decimalCollection.add(1.2);
	}

	@Test
	public void addTest() {
		assertEquals(this.decimalCollection.size(), 2);
	}
	
	@Test
	public void sumTest() {
		assertEquals(this.decimalCollection.sum(), 3.2, 0);
	}
	
	@Test
	public void higherTest() {
		assertEquals(this.decimalCollection.higher(), 2.0, 0);
	}
	
	@Test
    public void lowerTest() {
        assertEquals(this.decimalCollection.lower(), 1.2, 0);
    }

    @Test
    public void mediaTest() {
        assertEquals(this.decimalCollection.media(), 1.6, 0);
    }
    
}
