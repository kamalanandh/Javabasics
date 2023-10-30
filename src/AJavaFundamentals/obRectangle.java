package AJavaFundamentals;

//CONSTRUCTOR  has same name as class name
// Constructor don't have return type - that differentiates them from methods.
// whenever an object is created - constructor by default gets executed.
public class obRectangle {
     public obRectangle(int h, int w)
    {
        int area = h * w;
        System.out.println("The area is =" + area);
    }

}

