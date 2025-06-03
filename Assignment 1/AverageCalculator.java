import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: First input is not a valid double.");
            sc.close();
            return;
        }
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Error: Second input is not a valid double.");
            sc.close();
            return;
        }
        double num2 = sc.nextDouble();

        double average = (num1 + num2) / 2;
        System.out.println("Average: " + average);

        sc.close();
    }
}
