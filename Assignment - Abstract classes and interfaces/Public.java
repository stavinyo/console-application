
public class Public extends Property implements Insurance{
	private String type;
	private static final int baseInsurance = 22;

	public Public(String street, int number, int apt, int size, String name, String id, int phoneNumber, String type) {
		super(street, number, apt, size, name, id, phoneNumber);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double calcPropertyTax(){
		return  (basePrice +10) * getSize();	
	}
	
	public double calcInsurance()
	{
		return baseInsurance * getSize();
	}
	
	public double insuranceClaim(int demagePrice)
	{
		if(calcInsurance() >= demagePrice)
			return calcInsurance() *0.6;
		else
			return demagePrice*0.6;
	}
	
	@Override
	public String toString() {
		return "Public: " + super.toString() + " | type: " + type;
	}
}
