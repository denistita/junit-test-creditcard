package creditinheritance;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WalletTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testWallet() {
		Person owner = new Person("John", "Doe");
		Wallet wallet = new Wallet(owner, "wallet1");
		// System.out.println("abc" + wallet);
		assertEquals(wallet.toString(), "wallet1");
		// fail("Not yet implemented");
	}

	@Test
	void testPutCreditCard() {
		Person owner = new Person("John", "Doe");
		Wallet wallet = new Wallet(owner, "wallet1");
		wallet.putCreditCard(new Discover(owner, 100));
		// System.out.println(wallet);
		assertEquals(wallet.toString(), "wallet1\n Discover 0.01 0.0 100.0");

		// fail("Not yet implemented");
	}

	@Test
	void testRemoveCreditCard() {
		Person owner = new Person("John", "Doe");
		Wallet wallet = new Wallet(owner, "wallet1");
		wallet.putCreditCard(new Discover(owner, 200));
		wallet.putCreditCard(new Visa(owner, 100));
		wallet.removeCreditCard("Visa");
		System.out.println(wallet);
		assertEquals(wallet.toString(), "wallet1\n Discover 0.01 0.0 200.0");
		// fail("Not yet implemented");
	}

}
