import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Sulai");
        System.out.println("Enter the Number:");

        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        String s="Tech Sulai Legend";
        for(int i=0;i<=x;i++)
        {
            System.out.println(s+" "+i+" Times");
        }
    }
}