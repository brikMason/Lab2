package lab2;
/** 
 * @author Wes Maxwell
 *2017-9-7
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SeatMap {

	public int readFile(String name) throws FileNotFoundException {    //reads in file
		File filename = new File("names.dat");
		Scanner inputFile = new Scanner (filename);
		while (inputFile.hasNext()) {
			System.out.println(inputFile.next());
		}
		inputFile.close();
		
		return 0;
		
	}
	public static void main(String[] args) {				
		System.out.println("Foo. It wasn't ready!");		//Me accepting the fact it wasn't ready...
	}
}
	 
	 //30 people in file