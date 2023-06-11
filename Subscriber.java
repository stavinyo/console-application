//The basic subscription - a single user subscription that pays for use of the gym only.

public class Subscriber {
	protected int monthlyCost;
	protected int month;
	
	
	//Full contsructor
	public Subscriber(int monthlyCost, int month){ //full cons't
		this.setMonthlyCost(monthlyCost);
		this.month = month;
	}
	
	//Get
	public int getMonthlyCost(){
		return monthlyCost;
	}
	
	//Set
	public void setMonthlyCost(int monthlyCost){
		if (monthlyCost < 100)
		{
			System.out.println("invalid price");
			this.monthlyCost = 100;
		}
		else
			this.monthlyCost = monthlyCost;
	}
	
	//Get
	public int getMonth(){
		return month;
	}
	
	//Set
	public void setMonth(int month) {
		this.month = month;
	}
	
	//Function that returns the annual amount to pay.
	public float calcCost(){
		return (float)(monthlyCost * 12);
	}
	
	//Function that returns the annual refund to pay.
	public float calcRefund (int lastMonth){
		float refund = (12 - ((13 - month + lastMonth)%12)) * getMonthlyCost();
		return refund;
	}
	
	//Function that prints the values of the attributes
	public void print() {
		System.out.println("monthlyCost: " + monthlyCost + ", month: " + month);
	}
}
	
