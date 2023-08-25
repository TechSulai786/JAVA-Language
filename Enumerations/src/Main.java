import java.util.EnumSet;

public class Main {
    enum months
    {
        January,    // 0
        February,   // 1
        March,      // 2
        April,      // 3
        May,        // 4
        June,       // 5
        July
    }
    public static void main(String[] args) {
        System.out.println("This is Enum");
        for(months var: EnumSet.range(months.January,months.July))
        {

            System.out.println(var.ordinal());
        }

    }
}