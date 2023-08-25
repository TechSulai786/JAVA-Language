public class Arrayloops
{
    public static void main(String[] args)
    {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(int i=0;i<cars.length;i++)
        {
            System.out.println(cars[i]);
        }
        String[] car = {"Volvo", "BMW", "Ford", "Mazda","Sulai the legend"};
        for(String i:car)
        {
            System.out.println(i);
        }
    }
}
