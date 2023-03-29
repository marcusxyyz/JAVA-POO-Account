package entities;

public class Account {
	
	private final double TAX = 5.00;
	
	private int number;
	private String holder;
	private double deposit;
	
	public Account() {
	}

	public Account(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		this.deposit = initialDeposit;
	}
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getDeposit() {
		return deposit;
	}

	public void depositValue(double deposit) {
		this.deposit += deposit;
	}
	
	public void withdrawValue(double deposit) {
		this.deposit -= deposit + TAX;
	}

	@Override
	public String toString() {
		return "Account " 
				+ number + 
				", Holder: " 
				+ holder 
				+ ", Balance: $ " 
				+ String.format("%.2f%n", deposit);
	}
	
	
	
	
	

}
