import java.util.Scanner;
public class StarThree {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows;
        int k = 0;
        int i;
        int j;
        System.out.println("Enter num of rows: ");
        rows=sc.nextInt();

        for (i = 1; i < rows; ++i, k = 0) {
            for (j = 1; j <= rows - i; ++j) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}