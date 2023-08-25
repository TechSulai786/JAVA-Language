
public class Constructors 
{
	int modelYear;
	  String modelName;
	public Constructors(int year, String name)
	{
		modelYear = year;
	    modelName = name;
	}
	public static void main (String[] args)
	{
		Constructors obj=new Constructors(1998,"tech sulai");
		System.out.println(obj.modelYear + " " + obj.modelName);
	}

}
