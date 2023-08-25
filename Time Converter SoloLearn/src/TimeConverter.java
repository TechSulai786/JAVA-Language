import java.util.Scanner;
public class TimeConverter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Days:");
		int days = scanner.nextInt();
		int hours=days*24;
		int minutes=hours*60;
		int seconds=minutes*60;
		
		System.out.println( days +" Days of Hours is :" +hours);
		System.out.println( days +" Days of Minutes is :" +minutes);
		System.out.println( days +" Days of Seconds is :" +seconds);

	}

}
