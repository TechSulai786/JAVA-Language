public class Main {
    public static void main(String[] args) {
        System.out.println("This is Try Catch Method");
        try
        {
         int[] arr={10,20,30};
         System.out.println(arr[10]);
         throw new ArrayIndexOutOfBoundsException("Access denied");
        }
        catch (Exception e)
        {
            System.out.println("Something Went Worng:");
            System.err.println(e.getMessage());

        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}