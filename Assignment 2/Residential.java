
public class Residential extends Property {
	private int householdSize;

	public Residential(String street, int number, int apt, int size, String name, String id, int phoneNumber,
			int householdSize) {
		super(street, number, apt, size, name, id, phoneNumber);
		this.householdSize = householdSize;
	}

	public int getHouseholdSize() {
		return householdSize;
	}

	public void setHouseholdSize(int householdSize) {
		if (householdSize > 0 )
			this.householdSize = householdSize;
		else
			System.out.println("invallid number");
	}

	public double calcPropertyTax()
	{
		if(getHouseholdSize() >= 6)
			return getSize() * basePrice * 0.85;
		else
			return getSize() * basePrice;
	}
	
	@Override
	public String toString() {
		return "Residential: " + super.toString() + " | House hold size:"+ householdSize;
	}	
}
