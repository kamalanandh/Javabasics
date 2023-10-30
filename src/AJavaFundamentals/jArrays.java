package AJavaFundamentals;

public class jArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
       //Printing array elements in order
        for(int i =0; i < array1.length; i++){
           System.out.println(array1[i]);
        }
       //Printing array elements in reverse order
        for(int i=(array1.length-1);i>=0;i--){
            System.out.println(array1[i]);
        }
        //Printing array elements in order using for each loop.
        for (int x: array1)
            System.out.println(x);
    }
}
