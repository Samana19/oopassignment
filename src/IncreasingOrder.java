import java.util.Scanner;
public class IncreasingOrder {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = sc.nextInt();
        System.out.print("Enter second number: ");
        int second = sc.nextInt();
        System.out.print("Enter third number: ");
        int third = sc.nextInt();
        if (first < second && second < third)
        {
            System.out.println("Increasing order");
        }
        else if (first > second && second > third)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}