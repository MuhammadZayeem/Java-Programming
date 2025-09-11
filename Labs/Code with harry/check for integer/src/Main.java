import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number..:");
        double number = sc.nextDouble();
        if (number== (int) number) {
            System.out.println("Entered number is an integer!");
        } else {
            System.out.println("Eneterd number is not an integer.");
        }
    }
}