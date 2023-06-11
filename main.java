import java.util.*;
public class main {

	public static void main(String[] args) {
		
		ArrayList <Property> ProList = new ArrayList <Property> ();
		ArrayList <PropertyTax> ProTaxList = new ArrayList <PropertyTax> ();
		ArrayList <Insurance> ProInsList = new ArrayList <Insurance> ();

		Residential R1 = new Residential("Alenbi", 19, 1, 80, "Stav", "209024249", 526909629, 5);
		Residential R2 = new Residential("Begin", 44, 4, 55, "Reuoven", "435667674", 525454555, 7);
		Residential R3 = new Residential("Rabin", 5, 12, 50, "Inbar", "209232239", 525456555, 2);
		
		Commercial C1 = new Commercial("Dizengoff",20, 10, 70, "Bar", "318515335", 534565345, "L");
		Commercial C2 = new Commercial("Frishman",12, 15, 100, "Rotem", "318756535", 534345345, "M");
		Commercial C3 = new Commercial("Yarkon",33, 17, 90, "Amit", "318456535", 534512345, "L");
		
		Public P1 = new Public("Ben Yehoda",320, 11, 85, "Itay", "432515335", 523465345, "Food");
		Public P2 = new Public("King David",65, 1, 150, "Ben", "234324335", 523432434, "Mall");
		Public P3 = new Public("Weizmann",30, 1, 34, "Moshe", "345345443", 554354355, "Hospital");

		ProList.add(R1);
		ProList.add(R2);
		ProList.add(R3);
		ProList.add(C1);
		ProList.add(C2);
		ProList.add(C3);
		ProList.add(P1);
		ProList.add(P2);
		ProList.add(P3);
		
		ProTaxList.add(R1);
		ProTaxList.add(R2);
		ProTaxList.add(R3);
		ProTaxList.add(C1);
		ProTaxList.add(C2);
		ProTaxList.add(C3);
		ProTaxList.add(P1);
		ProTaxList.add(P2);
		ProTaxList.add(P3);
		
		ProInsList.add(C1);
		ProInsList.add(C2);
		ProInsList.add(C3);
		ProInsList.add(P1);
		ProInsList.add(P2);
		ProInsList.add(P3);
		
		for(int i = 0; i< ProList.size(); i++) {
			System.out.println(ProList.get(i).toString()); 
			ProList.get(i).ownershipDetails();
			System.out.println("Tax Payment: " + (int) ProTaxList.get(i).calcPropertyTax() + " NIS");
			System.out.println("");
		}
		totlalClaims(ProInsList);
	}
	
	public static void totlalClaims(ArrayList <Insurance> ProInsList)
	{
        Random rand = new Random();
        int max = 100000;
        int min = 1000;
        int randInt = rand.nextInt((max - min)+1) + min;
        
		for(int i = 0; i< ProInsList.size(); i++){
			System.out.println("Insurance price: " + ProInsList.get(i).insuranceClaim(randInt) + " NIS");
		}
	}
}