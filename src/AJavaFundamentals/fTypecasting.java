package AJavaFundamentals;

public class fTypecasting {
    public static void  main(String[] args)
    {
        int a = 6;
        double b = 5.5;
    //    a = b;              - it will throw compilation error
    //    b=a;    // it will print and convert the integer to decimal (conversion)
    //    System.out.println(b);
        int c = (int) b;   // this is called type casting
        System.out.println(c);
        a = (int)b;        // this is called type casting
        System.out.println(a);
    }
}
