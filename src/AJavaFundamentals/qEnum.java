package AJavaFundamentals;

public class qEnum {
    public static void main(String[] args) {
    whichseason(Month.JANUARY); // Month refers to enum definition.
    //whichseason(Month.NOVEBER); - Enum will throw compiler error
    }

    public static void whichseason(Month month)  /// Month is the enum definition.
    {
        switch (month)
        {
            case JANUARY:
            case FEBRUARY:
            case MARCH:
                System.out.printf("%s is winter month\n",month);

        }
    }

}
