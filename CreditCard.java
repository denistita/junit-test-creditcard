package creditinheritance;

public class CreditCard {

	// This is the super/parent class because the subclasses such a Master and Visa
	// can inherit its features

	// attributes -- data -- fields
	// protected means fields can be seen within the class and subclasses
	protected String company; // name of credit card company
	protected double interest;
	protected double balance;
	protected double payment;

	// constructor(s)
	public CreditCard() {
		company = "";
		interest = 0.0;
		balance = 0.0;
		payment = 0.0;
	}

	public CreditCard(String name, double Interest, double balance) {
		company = name;
		interest = Interest;
		this.balance = balance;
		payment = 0.0;
	}

	// method(s) -- getters/setters
	public String getCompany() {
		return company;
	}

	public double getInterest() {
		return interest;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double calculateInterest() {
		double monthlyInterest = 0;
		if (balance > 0)
			monthlyInterest = interest * balance;
		balance += monthlyInterest;
		return monthlyInterest;
	}

	public void makePayment(double payment) {
		this.payment = payment;
		balance -= payment;
	}

	@Override
	public String toString() {
		return " " + this.company + " " + this.interest + " " + this.payment + " " + this.balance;
	}
}
