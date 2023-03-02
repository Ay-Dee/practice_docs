import java.util.Scanner;

public class centralTendency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the first digit:");
        int num1 = input.nextInt();

        System.out.println("Input the second digit:");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of the numbers is: " + sum);

        int diff = num1 - num2;
        System.out.println("The difference between the numbers is: " + diff);

        int prod = num1 * num2;
        System.out.println("The product of the numbers is: " + prod);

        int avg = sum/2; 
        System.out.println("The average of the numbers is: " + avg); 
    }
}