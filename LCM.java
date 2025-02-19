import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int lcm = findLCM(num1, num2);

        System.out.println("The Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close();
    }

    public static int findLCM(int num1, int num2) {
        
        int gcd = findGCD(num1, num2);

        return (num1 * num2) / gcd;
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
