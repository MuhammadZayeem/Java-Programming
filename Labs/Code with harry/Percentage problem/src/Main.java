import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Getting numbers of all subjects.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks for subject 1 :");
        double a=sc.nextDouble();
        System.out.println("Enter marks for subject 2 :");
        double b=sc.nextDouble();
        System.out.println("Enter marks for subject 3 :");
        double c=sc.nextDouble();
        System.out.println("Enter marks for subject 4 :");
        double d=sc.nextDouble();
        System.out.println("Enter marks for subject 5 :");
        double e=sc.nextDouble();
        double f=a+b+c+d+e;
        double g= f/500 ;
        double h= g*100 ;
        System.out.println("total percentage is:");
        System.out.println(h);
    }
}