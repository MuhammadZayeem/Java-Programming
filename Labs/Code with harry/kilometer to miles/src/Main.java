import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length in kilometers..:");
        double kilometers = sc.nextDouble();
        double meters=kilometers*1000;
        double miles = meters/1600;
        System.out.println("Given length in miles is: "+miles+" miles");
    }
}