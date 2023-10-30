package AJavaFundamentals;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class lConditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your height in cms");
        int height = scanner.nextInt();
        if (height<120) {
            System.out.println("You are not allowed");
        }
            else if (height > 120 && height <190) {
                System.out.println("You are allowed");
            }
            else
                    System.out.println("please check your height");
    }
}
