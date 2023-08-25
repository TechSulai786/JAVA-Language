
public class Threads extends Thread{
	public void run()
	{
		System.out.println("This is Running in Thread");
	}

	public static void main(String[] args) {
		
		Threads obj =new Threads();
		obj.start();
		System.out.println("This code is outside of the thread");

	}

}
