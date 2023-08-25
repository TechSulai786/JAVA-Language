import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Filehandling {

		public static void main(String[] args) {
	
		File file=new File("test.txt");
		
		
	try
		{
		
		if(file.createNewFile()) {
			System.out.println("File created:");
		}
		else
		{
			System.out.println("File Exists:");
		}
		FileWriter writers=new FileWriter("test.txt");
		writers.write("This is my first writer in java");
		writers.write("\nIm Tech Sulai Legend");
		writers.close();
		 System.out.println("Successfully wrote to the file.");
		 Scanner scan=new Scanner(file);
		 while (scan.hasNextLine())
		 {
			 System.out.println(scan.nextLine());
		 }
		 scan.close();

	} catch(Exception e)
		{
		System.out.println("An error occurred.");
		
		}
		if(file.exists()) {
			System.out.println("File Exists "+file.getName());
		}
		else
		{
			System.out.println("File Does't exist:");
		}
	}

}
