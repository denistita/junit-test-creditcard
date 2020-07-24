package creditinheritance;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MCTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMC() {
		MC card = new MC(new Person("John", "Doe"), 100);
		// System.out.println(card);
		assertEquals(card.toString(), " MC 0.05 0.0 100.0");
		// fail("Not yet implemented");
	}

	@Test
	void testGetOwner() {
		MC card = new MC(new Person("John", "Doe"), 100);
		// System.out.println(card);
		assertEquals(card.getOwner(), "Doe, John");
		// fail("Not yet implemented");
	}

}
