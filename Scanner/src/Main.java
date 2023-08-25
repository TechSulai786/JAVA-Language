import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the two number:");
        int num=scan.nextInt();
        int nums=scan.nextInt();
         scan.nextLine();
        String userName = scan.nextLine();

        System.out.println("this is a number:"+num);
        System.out.println("this is a number:"+nums);

        System.out.println("This is String:"+userName);
    }
}