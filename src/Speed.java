import java.util.Scanner;
public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance;
        double hour;
        double mins;
        double sec;
        System.out.println("Enter the distance in meters");
        distance = sc.nextDouble();

        System.out.println("Enter hours");
        hour = sc.nextDouble();

        System.out.println("Enter minutes");
        mins  = sc.nextDouble();

        System.out.println("Enter seconds");
        sec= sc.nextDouble();


        double time_seconds = (hour*3600) + (mins*60) + sec;

        double meter_per_sec = distance / time_seconds;
        System.out.println("Your speed in m/s is: " + meter_per_sec);

        double km_per_hr = ( distance/1000 ) / ( time_seconds/3600 );
        System.out.println("Your speed in km/h is: " + km_per_hr);

        double miles_per_hr = km_per_hr / 1.609;
        System.out.println("Your speed in miles/hr is:  " + miles_per_hr);

    }
}