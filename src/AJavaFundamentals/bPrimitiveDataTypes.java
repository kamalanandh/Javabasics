package AJavaFundamentals;

public class bPrimitiveDataTypes
{
    public static void main(String[] args)
    {
        //integers or full numbers
        byte    num1 = 7;   //1 byte  value range - 128 to 127
        short   num2 = 8;   //2 bytes value range  -32768 to 32767
        int     num3 = 10;  //4 bytes
        long    num4 = 12;  //8 bytes
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

        //Decimal numbers
        float num5 = 5.6f; //4 bytes - we will have to prefix "f" at the last for float.
        double num6 = 20.555; //8 bytes
        System.out.println(num5);
        System.out.println(num6);

        //Character
        char str1 = 'A'; //2 bytes   // note single quotes
        String str2 = "Kamal";       // note double quotes
        System.out.println(str1);
        System.out.println(str2);

        //Boolean
        Boolean flag1 = true;     //note small caps
        Boolean flag2 = false;
        System.out.println(flag1);
        System.out.println(flag2);
    }
}