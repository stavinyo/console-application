//Family subscription - Subscription to several users together who pay for the gym and can purchase additional services.

public class Family extends Advanced {
	protected int adults;
	protected int kids;
	
	//Full contsructor
	public Family(int adults, int kids, int monthlyCost, int month) {
		super(monthlyCost, month);
		this.setKids(kids);
		this.setAdults(adults);
	}
	
	//Get
	public int getAdults() {
		return adults;
	}
	
	//Set
	public void setAdults(int adults) {
		if(adults >= 1)
			this.adults = adults;
		else
		{
			System.out.println("invalid number of adults");
			this.adults = 1;
		}
	}
	
	//Get
	public int getKids() {
		return kids;
	}
	
	//Set
	public void setKids(int kids) {
		if(kids >= 0)
			this.kids = kids;
		else
		{
			System.out.println("invalid number of kids");
			this.adults = 0;
		}
	}
	
	@Override
	//Function to return the payment for all services purchased by the subscription. 
	public float calcCost() {
		float sum1 = 0;
		if(getAdults() >= 1 ) {
			sum1 += super.calcCost()  + (((getAdults()-1)*getMonthlyCost())*0.8)*12;
		}
		if(getKids() > 0) {
			sum1 += ((getKids()*getMonthlyCost())*0.6)*12;
		}
		return sum1;
	}
	

	@Override
	//Function to return the refund for all services purchased by the subscription and can be refunded.
	public float calcRefund (int lastMonth) {
		float sum2=super.calcRefund(lastMonth);

		float refundForSubscriber = (12 - (13 - month + lastMonth)%12) * getMonthlyCost(); //refund for one adult without services
		
		for(int j=2; j<= getAdults(); j++){ //חישוב לפי אחוזים של המשתמשים
			if (j==2)
				sum2 += refundForSubscriber* 0.75;
			else if (j > 2)
				sum2 += refundForSubscriber* 0.5;
			}
		
		sum2 += (getKids() * refundForSubscriber) * 0.5;
		return sum2;
		}
	
	@Override
	//Function that prints the values of the attributes
	public void print(){
		super.print();
		System.out.println("adults: " + adults + ", kids: " + kids);
	}
}
	
