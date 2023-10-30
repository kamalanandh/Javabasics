package AJavaFundamentals;

import java.util.Scanner;

public class nHotelroomproject {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inserttestnames();
        do {
            displayguests();
            displaymenu();
            int option = getoption();
            if (option==1) {
                addGuest();
            }
            else if (option==3) break;
            else
                break;

        } while (true);
    }
        static void displayguests()
        {
            System.out.println("_________________________");
            System.out.println("    Guest list           ");
            System.out.println("_________________________");
            Boolean isEmpty = true;
            for (int i= 0; i <guests.length; i++)
            {
                if (guests[i] != null)
                {
                    System.out.println("\t" + (i+1) + ". " + guests[i]);
                    isEmpty = false;
                }
            }
                if (isEmpty)
                {
                    System.out.println("Guest List is empty");
                }
        }

        static void displaymenu()
        {
            System.out.println("____________________________________");
            System.out.println("1. Add Guest");
            System.out.println("2. Remove Guest");
            System.out.println("3. Exit");
            System.out.println("____________________________________");
        }


        static int getoption()
        {
            int option = 4;
            do
            {
                System.out.println("Enter option 1 through 3");
                System.out.println("Option:");
                option = scanner.nextInt();
            } while (option >3);
            return option;
        }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
    //            break;
            }
        }
    }
        /*
        static void addname()
        {
            for (int i = 0; i < guests.length; i++)
            {
                if (guests[i]==null)
                {
                    System.out.println("Enter the name: ");
                    guests[i] = scanner.nextLine();
                    break;
                }
            }
        }
*/
        static void removename()
        {
            System.out.println("Enter the guest number you wish to delete");
            int deleteopt = scanner.nextInt();
            if (deleteopt>=1 && deleteopt<=10 && guests[deleteopt-1]==null)
            guests[deleteopt- 1]= null;


        }
        static void inserttestnames ()
        {
            guests[0] = "Kamal Anandh";
            guests[1] = "Jothi Kamal";
            guests[2] = "Nandhini KJ";
            guests[3] = "Porkodi Arumugam";
            guests[4] = "Dhivya Arumugam";
            guests[5] = "Chandan V";
            guests[6] = "Theju VA";
            guests[7] = "Raju A";

        }

    }
