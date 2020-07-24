package creditinheritance;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DiscoverTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testDiscover() {
		CreditCard card = new Discover(new Person("John", "Doe"), 100);
		// System.out.println(card);
		assertEquals(card.toString(), " Discover 0.01 0.0 100.0");
		// fail("Not yet implemented");
	}

	@Test
	void testGetOwner() {
		Discover card = new Discover(new Person("John", "Doe"), 100);
		// System.out.println(card);
		assertEquals(card.getOwner(), "Doe, John");
		// fail("Not yet implemented");
	}

}
