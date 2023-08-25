class Animal
{
    public void animalsound()
    {
        System.out.println("The animal makes a sound");
    }
}
class pig extends Animal
{
    public void animalsound()
    {
        System.out.println("Wee wee");
    }
}
class cat extends Animal
{
    public void animalsound()
    {
        System.out.println("Meow Meow");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("This is polymorphism");
        Animal obj1=new Animal();
        Animal obj2=new pig();
        Animal obj3=new cat();
        obj1.animalsound();
        obj2.animalsound();
        obj3.animalsound();

    }
}