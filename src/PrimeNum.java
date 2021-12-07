import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int k;
        int i;

        System.out.println("Enter an integer value :");
        num = sc.nextInt();

        for (i = 2; i <= num; i++) {
            k = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    k = k + 1;
                }
            }

            if (k <= 2) {
                System.out.println("Prime number :" +i);
            }

        }


    }
}