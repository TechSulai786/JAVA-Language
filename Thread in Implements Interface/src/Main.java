
public class Main implements Runnable{
	public void run()
	{
		System.out.println("This is running in Thread");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj=new Main();
		Thread obj1=new Thread(obj);
		obj1.start();
		System.out.println("this is in main Program");
		

	}

}
