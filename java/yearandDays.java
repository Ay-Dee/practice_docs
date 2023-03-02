import java.util.Scanner;

public class yearandDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double minutesInYear = 60*24*365;
        System.out.println("Input the number of minutes :");
        double min = input.nextDouble();

        long years =(long) (min/minutesInYear);
        int days = (int) (min/60/24)%365;

        System.out.println((int) min+" minutes is approx. "+years+" years and "+days+" days");
    }
}
