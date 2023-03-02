import java.util.Scanner;

public class Celsiusconvert {

    public static void main(String[] args) {
        // c = (5(f-32))/9
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a temperature in Fah. :");
        double fah = sc.nextDouble();

        double celsius = ((5*(fah-32.0))/9.0);
        System.out.println(fah+" "+"degree Fahrenheit is equal to "+celsius+" in celsius");
    }
}