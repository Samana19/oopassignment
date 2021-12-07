import java.util.Scanner;
public class StarFour {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num of rows : ");
        int n=sc.nextInt();

        for(int i=n;i>0 ;i--)
        {
            for(int j=0;j<n-i;j++)

            {
                System.out.print(" ");
            }
            for(int j=0;j<(i*2)-1;j++)

            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}