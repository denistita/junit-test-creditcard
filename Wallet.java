package creditinheritance;

import java.util.ArrayList;

public class Wallet {

	// data

	ArrayList<CreditCard> cards;
	Person owner;
	String walletName;

	// constructor
	public Wallet(Person owner, String name) {
		this.owner = owner;
		this.walletName = name;
		cards = new ArrayList<CreditCard>();
	}

	// methods
	public String getWalletName() {
		return walletName;
	}

	public Person getOwner() {
		return owner;
	}

	public void putCreditCard(CreditCard aCard) {
		cards.add(aCard);
	}

	public CreditCard removeCreditCard(String cardName) {
		for (CreditCard aCard : cards) {
			if (aCard.getCompany().equals(cardName)) {
				cards.remove(aCard);
				return aCard;
			}
		}
		return null;

	}

	@Override
	public String toString() {
		String r = walletName;
		for (CreditCard aCard : cards) {
			r += "\n" + aCard;
		}
		return r;
	}

	public void calculateInterest() {
		for (CreditCard aCard : cards) {
			aCard.calculateInterest();
		}
	}
}
