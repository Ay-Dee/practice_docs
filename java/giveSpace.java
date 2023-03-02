import java.util.Scanner;

public class giveSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter six non-negative digits:");
        int inputNumber = input.nextInt();

        int n1 = inputNumber/100000%10;
        int n2 = inputNumber/10000%10;
        int n3 = inputNumber/1000%10;
        int n4 = inputNumber/100%10;
        int n5 = inputNumber/10%10;
        int n6 = inputNumber%10;

        System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
    }
}
