package newBegining;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		
		File f = new File("G:\\RENO\\Gokul\\Reno.txt");
		
		/*try {
			FileReader f1 = new FileReader(f);
			char[] ch = new char[20];
			f1.read(ch);
			System.out.println(ch);
			System.out.println(ch.length); 
				
			//for (int i = 0; i < ch.length; i++) {
				
				//System.out.println(ch);
			//}		
				
			*/	
			
		try {
		FileWriter f2 = new FileWriter(f);
		f2.write("Reno is a DASH");
		f2.close();
		}
			
			
		 catch (Exception e) {
		
			e.printStackTrace();
		}
	

	
		
		
		
		
	}

}
