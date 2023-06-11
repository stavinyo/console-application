package Q2;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		
		//EX1
		boolean flag = false;
		while(flag == false)
		{
			try
			{
				System.out.println("Please enter driver name: ");
				String driverName = input.nextLine();
				System.out.println("Please enter driver ID name: ");
				String driverId = input.nextLine();
				
				
				Driver D1 = new Driver(driverId, driverName);
				
				flag = true;
				int count = 0;
				//EX2
				System.out.println("Avarage KM for " + count + " cars: " + D1.calculateAvarage(D1.getCars()));
				//EX3
				while((flag == true) && (count <4))
				{
					try
					{
						
						System.out.println("Please enter car number: ");
						String carNumber = input.nextLine();
						
						System.out.println("Please enter the number of KM: ");
						int km = input.nextInt();
						String space = input.nextLine();

						D1.addCar(new Car(carNumber, km));
						count++;
					}
					catch(InvalidCarNumber m) {
						System.out.println(m);
					}
					catch(InvalidNegativeValue e){
						System.out.println(e);
					}
				}
				//EX5
				System.out.println("Avarage KM for " + count + " cars: " + D1.calculateAvarage(D1.getCars()));
			}
			catch(InvalidName m) {
				System.out.println(m);
			}
			catch(InvalidID e){
				System.out.println(e);
			}
		}
	}
}
