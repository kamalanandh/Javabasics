package AJavaFundamentals;
import java.util.Scanner;

public class gScanner {
    public static void main(String[] args)
    {
    System.out.println("What is your name");
    Scanner scanner = new Scanner(System.in);
    String Name = scanner.next();
    System.out.println(Name);

    System.out.println("Enter your age");
    int age = scanner.nextInt();
    System.out.println("Your Age is "+age);

        System.out.println("Enter your height in feet");
        float height = scanner.nextFloat();
        System.out.println("Your height is "+height);

    }
}
