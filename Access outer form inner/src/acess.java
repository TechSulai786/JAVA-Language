//import outterclass.innerclass;

class outterclass
{
	int x=10;
	
class innerclass
{
	
	public int inner()
	{
		return x;
	}
}
}
public class acess
{


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			outterclass obj=new outterclass();
			outterclass.innerclass i=obj.new innerclass();
			System.out.println(i.inner());
		// TODO Auto-generated method stub

	}

}
