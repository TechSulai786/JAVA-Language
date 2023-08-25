abstract class animal
{
    public abstract void sound();
    public void sleepy()
    {
System.out.println("all animal is sleeping");
    }
}
class cat extends animal
{
    public void sound()
    {
        System.out.println("Meow Meow");
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println("this is Abstraction");
        cat obj=new cat();
        obj.sleepy();
        obj.sound();

    }
}