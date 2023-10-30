package AJavaFundamentals;

import java.util.Scanner;

public class iNextline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*  System.out.println("Enter your full name");
        String firstname = scanner.next(); // captures one word at a time
        String lastname  = scanner.next();
        System.out.println("Your full name is "+firstname + "  "+ lastname);
     */

        System.out.println("Enter your full name");
        String fullname = scanner.nextLine(); // captures the entire line.
        System.out.println("Your full name is "+ fullname);

    }
}
