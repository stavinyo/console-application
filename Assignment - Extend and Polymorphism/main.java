
// The program displays a list of computer files including their details

import java.util.*;
public class main {

	public static void main(String[] args) {
		
		ArrayList <File> files = new ArrayList <File>(); // Create new Array List (type File) 
		File F1 = new File ("A", 100);
		File F2 = new File ("B", 200);
		ImageFile F3 = new ImageFile ("C", 300, 300, 100);	
		ImageFile F4 = new ImageFile ("D", 400, 200, 200);
		VideoFile F5 = new VideoFile ("E", 500, true);
		VideoFile F6 = new VideoFile  ("F", 600, false);
		
		files.add(F1);
		files.add(F2);
		files.add(F3);
		files.add(F4);
		files.add(F5);
		files.add(F6);
		
		System.out.println(F1.toString());
		System.out.println(F2.toString());
		System.out.println(F3.toString());
		System.out.println(F4.toString());
		System.out.println(F5.toString());
		System.out.println(F6.toString());
	}

}
