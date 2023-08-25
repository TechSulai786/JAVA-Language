interface first
{
    public void first();
}
interface second
{
    public void second();
}
class c implements first,second
{
    public void first() {
        System.out.println("This is first Interface method");
    }
    public void second() {
        System.out.println("This is second Interface method");
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("This is Multiple Interfaces");
        c o=new c();
        o.first();
        o.second();

    }
}