package AJavaFundamentals;

public class mMethods {
    static int x = 5; // declaring global variable
    public static void main(String[] args)
    {
    System.out.println(x);
    int y= 10, z = 8;
    method1(y);
    method2(z);
    }
    public static void method1(int a)
    {
        System.out.println(x);
        System.out.println(a);
    }
    public static void method2(int b)
    {
        System.out.println(x);
        System.out.println(b);
    }
}
