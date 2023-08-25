public class Main {
    static void staticmethod()
    {
        System.out.println("Static methods can be called without creating objects");
    }
    public void publicmethod()
    {
        System.out.println("Public methods must be called by creating objects");

    }

    public static void main(String[] args) {
        System.out.println("this is difference:");
        staticmethod();
        Main obj=new Main();
        obj.publicmethod();
    }
}