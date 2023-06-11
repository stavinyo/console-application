package Q2;

public class Car {
	String numCar;
	int km;
	
	public Car(String numCar, int km) throws InvalidCarNumber, InvalidNegativeValue {
		setNumCar(numCar);
		setKm(km);
	}

	public String getNumCar() {
		return numCar;
	}

	public void setNumCar(String numCar) throws InvalidCarNumber{
		if(numCar.length() != 7 || !numCar.matches("[0-9]+"))
			throw new InvalidCarNumber("ID must be with only 7 numbers");
		else
			this.numCar = numCar;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) throws InvalidNegativeValue {
		if(km < 0)
			throw new InvalidNegativeValue("KM number must be positive number");
		else
			this.km = km;
	}
}
