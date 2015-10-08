package miw.upm.es.SpaiEcp2JorgeRabanos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

private User user;
	
	@Before
	public void setUp() {
		this.user = new User(1, "Homer", "Simpson");
	}

	@Test
	public void fullnameTest() {
		assertEquals(this.user.fullName(), "Homer Simpson");
	}
	
	@Test
	public void initialsTest() {
		assertEquals(this.user.initials(), "H.");
	}
	
	@Test
	public void numberTest() {
		assertEquals(this.user.getNumber(), 1, 0);
	}
	
	@Test
	public void nameTest() {
		assertEquals(this.user.getName(), "Homer");
	}
	
	@Test
	public void familyNameTest() {
		assertEquals(this.user.getFamilyName(), "Simpson");
	}
	
	@Test
	public void setNumberTest() {
		this.user.setNumber(2);
		assertEquals(this.user.getNumber(), 2, 0);
	}
	
	@Test
	public void setNameTest() {
		this.user.setName("Peter");
		assertEquals(this.user.getName(), "Peter");
	}
	
	@Test
	public void setFamilyNameTest() {
		this.user.setFamilyName("Griffin");
		assertEquals(this.user.getFamilyName(), "Griffin");
	}
	
	@Test
	public void upperCaseTest() {
		assertEquals(this.user.upperCase(), "HOMER SIMPSON");
	}

}
