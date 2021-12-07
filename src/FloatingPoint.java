import java.util.Scanner;
public class FloatingPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first float number: ");
        double first = input.nextDouble();
        System.out.print("Input second float number: ");
        double second = input.nextDouble();
        input.close();

        if (Math.abs(first - second) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are different.");
        }
    }
}