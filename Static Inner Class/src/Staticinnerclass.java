class outterclass{
	int x=10;
	
static class innerclass {
	int y=10;
}
}
public class Staticinnerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outterclass.innerclass i=new outterclass.innerclass();
		System.out.println(i.y);

	}

}
