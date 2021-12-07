import java.util.Scanner;
public class BodyMass {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter mass in kg: ");
        double mass= sc.nextDouble();

        System.out.println("Enter height in meter: ");
        double height= sc.nextDouble();

        double bmi=mass/(height*height);
        System.out.println("Your Body Mass Index is: "+bmi);
    }
}
