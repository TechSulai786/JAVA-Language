
 class inheritance {
	 protected String s="Im sulai";
	 public void honk() 
	 {                   
		    System.out.println("Tuut, tuut!");
	  }
	
}
class cars extends inheritance
{
	private String modelName ="The Legend";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cars obj=new cars();
		obj.honk();
		System.out.println(obj.s+" "+obj.modelName);
		

	}

}
