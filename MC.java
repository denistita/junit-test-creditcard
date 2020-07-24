package creditinheritance;

public class MC extends CreditCard {

	// data

	private static final double INTEREST = 0.05;
	private Person owner;

	// constructor
	public MC(Person aPerson, double balance) {
		super("MC", INTEREST, balance);
		owner = aPerson;
	}

	// methods
	public String getOwner() {
		return owner.toString();
	}

//	@Override
//	public String toString() {
//		String r = super.toString();
//		return getOwner() + " " + r;
//	}
}
