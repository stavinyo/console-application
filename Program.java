// Stav Cohen 209024249
// Reouven Nakache 328574652
 
//The program asks the user to enter types of boxes and displays them and their details

package q02;
import java.util.*;

public class Program {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int enter;
		int i =0;
		ArrayList <Box> boxes = new ArrayList <Box>(); //Create new Array List (type Box)
		
		do {
			System.out.println("Enter 1 for Card Box / Enter 2 for Plastic box / Enter 0 for Exit:");
			enter = input.nextInt();
			
			if(enter == 0) {
				System.out.println("Thank You! THIS IS YOUR DATA: ");
			}
			
			if(enter == 1){
				System.out.println("Please enter the volume");
				float volume = input.nextFloat();
				System.out.println("Please enter the max gram");
				int maxGrams = input.nextInt();
				
				CardBox n1 = new CardBox(Box.getTheSN1(),volume, maxGrams);
				boxes.add(n1);
				i++;
			}
			
			if(enter == 2) {
				System.out.println("Please enter the volume");
				float volume = input.nextFloat();
				System.out.println("Please enter if the box is liquid proof");
				boolean liquidProof = input.nextBoolean();
				
				PlasticBox n2 = new PlasticBox(Box.getTheSN2() ,volume, liquidProof);
				boxes.add(n2);
				i++;
			}
			
		}while(enter == 1 || enter == 2);
		
		System.out.println("Number of Card Box: " + (Box.getTheSN1()-1));
		System.out.println("Number of Plastic Box: " + (Box.getTheSN2()-1));
		System.out.println("Number of total boxes: " + (Box.getTheSN1() + Box.getTheSN2() -2));
		
		for(int j=0; j< i; j++){
			System.out.println(boxes.get(j).toString());
		}
	}

}
