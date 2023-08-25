interface animal
{
	public void sound();
	public void sleep();
}
class Cat implements animal
{
	 public void Sound() {
		    // The body of Sound() is provided here
		    System.out.println("The pig says: wee wee");
		  }
		  public void sleep() {
		    // The body of sleep() is provided here
		    System.out.println("Zzz");
		  }
		@Override
		public void sound() {
			// TODO Auto-generated method stub
			
		}
}
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj=new Cat();
		obj.Sound();
		obj.sleep();
		

	}

}
