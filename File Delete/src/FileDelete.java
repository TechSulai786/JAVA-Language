import java.io.File;
public class FileDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("G:\\JAVA Language\\File Handling\\test.txt");
		if(file.delete())
		{
			System.out.println("Deleted the file: " + file.getName());
		}
		else {
			System.out.println("Failed to delete the file.");
		}

	}

}
