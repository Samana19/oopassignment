import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        int n;
        int rem;
        int result = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();
        n = number;
        while (n > 0) {
            rem = n % 10;
            result += Math.pow(rem, n);
            n = n / 10;
        }
        if (number == result) {
            System.out.println(number + "is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }

    }

}