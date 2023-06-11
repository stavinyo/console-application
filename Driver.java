package Q2;
import java.util.*;
public class Driver {
	String id;
	String name;
	ArrayList <Car> cars; 
	
	public Driver(String id, String name) throws InvalidID, InvalidName{
		setId(id);
		setName(name);

		cars = new ArrayList <Car> ();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) throws InvalidID {
		if(id.length() != 9 || !id.matches("[0-9]+"))
			throw new InvalidID("ID must be with only 9 numbers");
		else
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws InvalidName{
		if((name.charAt(0) >= 'a' && name.charAt(0) <= 'z') || (name.charAt(0) >= 'A' && name.charAt(0) <= 'Z'))
			this.name = name;
		else
			throw new InvalidName("First char must start with a letter");
		
	}

	public ArrayList<Car> getCars() {
		return cars;
	}

	public void setCars(ArrayList<Car> cars) {
		this.cars = cars;
	}

	public void addCar(Car c1) {
		cars.add(c1);
	}
	
	public double calculateAvarage(ArrayList<Car> cars) {
		double totalKm =0;
		int i=0;
		for(i=0; i < cars.size(); i++)
		{
			totalKm += cars.get(i).getKm();
		}
		if(i>0)
			return totalKm/cars.size();
		else
			return 0;
	}
} 
