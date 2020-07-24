package creditinheritance;

import java.util.ArrayList;

public class Person {
	// data
	private String first;
	private String last;
	ArrayList<Wallet> wallets;

	// constructor
	public Person(String First, String Last) {
		first = First;
		last = Last;
		wallets = new ArrayList<Wallet>();
	}

	// methods
	public String getLast() {
		return last;
	}

	public String getFirst() {
		return first;
	}

	public void addWallet(Wallet wallet) {
		wallets.add(wallet);

	}

	@Override
	public String toString() {
		return last + ", " + first;
	}

	public String display() {
		String r = this.toString();
		for (Wallet wallet : wallets) {
			r += "\n" + wallet.toString();
		}
		return r;
	}

	public void calculateInterest() {

		for (Wallet wallet : wallets) {
			wallet.calculateInterest();
		}
	}
}
