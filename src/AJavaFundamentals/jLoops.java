package AJavaFundamentals;

public class jLoops {
    public static void main(String[] args) {
        //Print 1 to 5
        for (int i = 1; i<=5; i++)
        {
            System.out.println(i);
        }
        // Break - exit from the loop.
        for (int x=1; x <=5; x++)
        {
            System.out.println(x);
            if(x==3)
                break;
        }
        // Continue - skip & continue.
        for (int y=1; y <=5; y++)
        {
            if(y==3)      //3 will not get printed.
                continue;
            System.out.println(y);
        }
        int z = 0;
        // do while loop
        do {
            z++;
            System.out.println(z);
        } while (z<5);
    }
}
