import java.util.Objects;

public abstract class Property implements PropertyTax {
	protected String street = "";
	protected int number, apt, size;
	protected static final int basePrice = 12;
	protected String name, id;
	protected int phoneNumber;
	
	public Property(String street, int number, int apt, int size, String name, String id, int phoneNumber) {
		this.street = street;
		this.number = number;
		this.apt = apt;
		this.size = size;
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
	}

	public String getStreet() {
		return street;
	}

//	public void setStreet(String street) {
//		this.street = street;
//	}

	public int getNumber() {
		return number;
	}

//	public void setNumber(int number) {
//		if (number > 0 )
//			this.number = number;
//		else
//			System.out.println("invallid number");
//	}

	public int getApt() {
		return apt;
	}

//	public void setApt(int apt) {
//		if(apt >=0)
//			this.apt = apt;
//		else
//			System.out.println("invallid number");
//	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size > 0)
			this.size = size;
		else
			System.out.println("invallid number");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void ownershipTransfer(String name, String id, int phoneNumber)
	{
		if(this.id != id)
		{
			this.id = id;
			this.name = name;
			this.phoneNumber = phoneNumber;
		}
	}
	
	public void ownershipDetails()
	{
		System.out.println("Details: ID: " + getId() +  " | Phone: " + getPhoneNumber() + " | Name: " + getName());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Property other = (Property) obj;
		return apt == other.apt && number == other.number && Objects.equals(street, other.street);
	}

	
	@Override
	public String toString() {
		return "Address: " + street + " "+ number + " apt " + apt + " | Size: " + size;
	}
}
