package creditinheritance;

public class Discover extends CreditCard {

	// data
	private static final double INTEREST = 0.01;
	private Person owner;

	// constructor
	public Discover(Person aPerson, double balance) {
		super("Discover", INTEREST, balance);
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
