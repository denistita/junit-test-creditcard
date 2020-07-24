package creditinheritance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testToString() {
		Person person = new Person("John", "Doe");
		assertEquals(person.toString(), "Doe, John");
		// fail("Not yet implemented");
	}

	@Test
	void testPerson() {
		Person person = new Person("John", "Doe");
		assertEquals(person.toString(), "Doe, John");
		// fail("Not yet implemented");
	}

	@Test
	void testGetLast() {
		Person person = new Person("John", "Doe");
		assertEquals(person.getLast(), "Doe");
		// fail("Not yet implemented");
	}

	@Test
	void testGetFirst() {
		Person person = new Person("John", "Doe");
		// System.out.println(person.getFirst().length());
		assertEquals(person.getFirst(), "John");
		// System.out.println(person.getFirst().length());
		// fail("Not yet implemented");
	}

	@Test
	void testaddWallet() {
		Person person = new Person("John", "Doe");
		// System.out.println(person.getFirst().length());
		Wallet wallet1 = new Wallet(person, "wallet1");
		Wallet wallet2 = new Wallet(person, "wallet2");
		wallet1.putCreditCard(new Visa(person, 100));
		wallet1.putCreditCard(new MC(person, 50));
		wallet1.putCreditCard(new Discover(person, 300));
		wallet2.putCreditCard(new Visa(person, 150));
		wallet2.putCreditCard(new MC(person, 250));
		person.addWallet(wallet1);
		person.addWallet(wallet2);
		// System.out.println(person.display());

		assertEquals(person.display(), "Doe, John\n" + "wallet1\n" + " Visa 0.1 0.0 100.0\n" + " MC 0.05 0.0 50.0\n"
				+ " Discover 0.01 0.0 300.0\n" + "wallet2\n" + " Visa 0.1 0.0 150.0\n" + " MC 0.05 0.0 250.0" + "");

	}

	// TEST CASES

	// 1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover)
	// Each Card has a balance of $100
	// calculate the total interest (simple interest) for this person and per card.

	@Test
	public void test1person1Wallet() {
		Person person = new Person("John", "Doe");
		// System.out.println(person.getFirst().length());
		Wallet wallet1 = new Wallet(person, "wallet1");

		wallet1.putCreditCard(new Visa(person, 100));
		wallet1.putCreditCard(new MC(person, 100));
		wallet1.putCreditCard(new Discover(person, 100));
		// wallet1.calculateInterest();
		person.addWallet(wallet1);

		person.calculateInterest();
		// System.out.println(person.display());

		assertEquals(person.display(), "Doe, John\n" + "wallet1\n" + " Visa 0.1 0.0 110.0\n" + " MC 0.05 0.0 105.0\n"
				+ " Discover 0.01 0.0 101.0");
	}

	// 1 person has 2 wallets Wallet 1 has a Visa and Discover ,
	// wallet 2 a MC - each card has $100 balance
	// calculate the total interest(simple interest) for this person and interest
	// per wallet

	@Test
	public void test1Person2Wallets() {
		Person person = new Person("John", "Doe");
		// System.out.println(person.getFirst().length());
		Wallet wallet1 = new Wallet(person, "wallet1");
		Wallet wallet2 = new Wallet(person, "wallet2");
		wallet1.putCreditCard(new Visa(person, 100));
		wallet1.putCreditCard(new Discover(person, 100));

		wallet2.putCreditCard(new MC(person, 100));
		person.addWallet(wallet1);
		person.addWallet(wallet2);
		person.calculateInterest();
		// System.out.println(person.display());

		assertEquals(person.display(), "Doe, John\n" + "wallet1\n" + " Visa 0.1 0.0 110.0\n"
				+ " Discover 0.01 0.0 101.0\n" + "wallet2\n" + " MC 0.05 0.0 105.0" + "");

	}

	// 2 people have 1 wallet each, person 1 has 1 wallet,
	// with 2 cards MC and visa person 2 has 1 wallet
	// 1 visa and 1 MC - each card has $100 balance
	// calculate the total interest(simple interest) for each person and interest
	// per wallet

	@Test
	public void addTest2People() {
		Person person1 = new Person("John", "Doe");
		Person person2 = new Person("Mary", "Smith");
		// System.out.println(person.getFirst().length());
		Wallet wallet1 = new Wallet(person1, "wallet1");
		Wallet wallet2 = new Wallet(person2, "wallet2");
		wallet1.putCreditCard(new Visa(person1, 100));
		wallet1.putCreditCard(new MC(person1, 100));

		wallet2.putCreditCard(new Visa(person2, 100));
		wallet2.putCreditCard(new MC(person2, 100));
		person1.addWallet(wallet1);
		person2.addWallet(wallet2);
		person1.calculateInterest();
		person2.calculateInterest();
		// System.out.println(person1.display());

		assertEquals(person1.display(), "Doe, John\n" + "wallet1\n" + " Visa 0.1 0.0 110.0\n" + " MC 0.05 0.0 105.0");

	}
}
