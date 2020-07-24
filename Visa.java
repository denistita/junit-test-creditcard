package creditinheritance;

public class Visa extends CreditCard {

	// data. The interest is a constant that can only be accessed in the Visa class
	private static final double INTEREST = 0.10;
	private Person owner;

	// constructor
	public Visa(Person aPerson, double balance) {
		super("Visa", INTEREST, balance);
		owner = aPerson;
	}

	// methods
	// Method returns a string represenation of the owner.
	public String getOwner() {
		return owner.toString();
	}

//	@Override
//	public String toString() {
//		String r = super.toString();
//		return getOwner() + " " + r;
//	}
}
