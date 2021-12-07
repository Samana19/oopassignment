import java.util.*;

class IntegerSum {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by comma: ");
        String input = sc.next();
        StringTokenizer st = new StringTokenizer(input,",");

        int sum = 0;
        while(st.hasMoreTokens())

        {
            int n = Integer.parseInt(st.nextToken());
            System.out.println(n);
            sum += n;
        }

        System.out.println("Sum of the numbers is: "+sum);

    }

}