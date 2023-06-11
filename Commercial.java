
public class Commercial extends Property implements Insurance {
	private String smb;
	private static final int baseInsurance = 8;

	public Commercial(String street, int number, int apt, int size, String name, String id, int phoneNumber,
			String smb) {
		super(street, number, apt, size, name, id, phoneNumber);
		this.smb = smb;
	}

	public String getSmb() {
		return smb;
	}

	public void setSmb(String smb) {
		if(smb == "S" || smb == "M" || smb == "L")
			this.smb = smb;
		else
			System.out.println("invallid size");
	}

	public double calcPropertyTax ()
	{
		if(getSmb() == "S")
			return (1.6 * basePrice) * getSize(); 
		else if(getSmb() == "M")
			return (2 * basePrice) * getSize(); 
		else if(getSmb() == "L") 
			return (2.4 * basePrice) * getSize(); 
		else
			return (2.4 * basePrice) * getSize();
	}
	
	public double calcInsurance()
	{
		if(smb == "S")
			return (baseInsurance + 10) * getSize();
		else if(smb == "M")
			return (baseInsurance + 15) * getSize();
		else if(smb == "L")
			return (baseInsurance + 20) * getSize();
		else
			return -1;
	}
	
	public double insuranceClaim(int demagePrice)
	{
		if(demagePrice <= calcInsurance())
			return 0;
		else
			return demagePrice - calcInsurance();
	}
		
	@Override
	public String toString() {
		return "Commercial: " + super.toString() + " | smb: " + smb;
	}
	
	
}
