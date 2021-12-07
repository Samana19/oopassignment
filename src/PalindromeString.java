import java.util.Locale;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String palindrome;
        String rev="";
        int length;

        System.out.println("Enter a string val: ");
        palindrome=sc.nextLine();

        length=palindrome.length();
        for ( int i = length - 1; i >= 0; i-- )
            rev = rev + palindrome.charAt(i);

        if (palindrome.equals(rev))
            System.out.println(palindrome+" is a palindrome");
        else
            System.out.println(palindrome+" is not a palindrome");

    }
}
