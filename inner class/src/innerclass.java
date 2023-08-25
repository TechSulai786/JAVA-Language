class outterclass{
	int x=10;
	
class innerclass {
	int y=10;

}
}
public class innerclass
{
	public static void main(String[] args)
	
	{
		outterclass obj=new outterclass();
		
		outterclass.innerclass obj2=obj.new innerclass();
		System.out.println(obj.x+obj2.y);
	}
}
