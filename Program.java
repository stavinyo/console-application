//Reouven Nakache 328574652
//Stav Cohen 209024249

public class Program {
public static void main(String[] args) {
		
		//Ex 1.	
		System.out.println("b1:");
		Subscriber b1 = new Subscriber(200, 5);
		System.out.println("The annual payment is: " + b1.calcCost());
		System.out.println("The annual refund is: " + b1.calcRefund(2));
		b1.print();
		
		//Ex 2.
		Service pool = new Service("pool", 50, false);
		Service locker = new Service("locker", 10, true);
		Service playroom = new Service("playroom", 25, true);
		System.out.println("------------------------------------------------------------");
		System.out.println("ad1:");
		
		//Ex 3.
		Advanced ad1 = new Advanced(160, 2); 
		ad1.addService(pool);
		ad1.addService(locker);
		System.out.println("The annual payment is: " + ad1.calcCost());
		ad1.print();
		System.out.println("------------------------------------------------------------");
		System.out.println("ad2:");
		
		//Ex 4.
		Advanced ad2 = new Advanced(180, 2);
		ad2.addService(pool);
		System.out.println("The annual payment is: " + ad2.calcCost());
		String nameService = "spinning";
		if(ad2.serviceExist(nameService))
			System.out.println( nameService + " already exists");
		else
			System.out.println( nameService + " doesn't exist");
		ad2.addService(pool);
		System.out.println("------------------------------------------------------------");
		System.out.println("fam1:");

		//Ex 5.
		Family fam1 = new Family(3, 2, 190, 11);
		fam1.addService(pool);
		fam1.addService(playroom);
		System.out.println("The family's annual payment is: " + fam1.calcCost());
		System.out.println("The family's annual refund is: " + fam1.calcRefund(3));
		fam1.print();
	}

}
