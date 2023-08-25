import java.io.File;


public class Main {
    public static void main(String[] args) {
        System.out.println("This is File Information:");

        File file = new File("G:\\JAVA Language\\File Handling\\test.txt");
        if(file.exists())
        {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: "+file.canWrite());
            System.out.println("Readable: "+file.canRead());
            System.out.println("File size in bytes: "+file.length());
        }
        else {
            System.out.println("File Does not Exists");
        }
    }
}

