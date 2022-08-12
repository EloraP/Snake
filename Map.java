import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.Scanner;

public class Map{
	
	public Map(String name) {
		readMap(name);
	}
	
	public void readMap(String name) {
		try {
			File map = new File (name);
			Scanner scanner = new Scanner (map);
			
			while(scanner.hasNextLine()) {
				String data = scanner.nextLine();
				System.out.println(data);
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("an error occurred.");
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
