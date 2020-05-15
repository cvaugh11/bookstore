import java.util.*;

public class Bookstore {
   
        static String name = "Read em and Weep"; 
        static String address = "34 East 34th st, Tre-Fo, NC 27101";
        static Integer size = 5000;
        static Boolean usedBooks = true;
        static Boolean open = true;
        static Boolean openWeekends = false;
        static Boolean openSundays = false;
        static String openingTimes = "8am";
        static String closingTimes = "9pm";
   
    public static void main(final String[]args) {
    //Scanner userInput = new Scanner(System.in);

    System.out.println("What is the address?");
    getAddress();
    System.out.println("Is the store open today?");
    getOpen();
    System.out.println("What time does it close?");
    getClosing();
    System.out.println("Does the store have used books?");
    getUsed();

}

public static void getAddress() {
    System.out.println(address);
}

public static void getOpen() {
    System.out.println(open);
}

public static void getClosing() {
    System.out.println(closingTimes);
}

public static void getUsed() {
        System.out.println(usedBooks);
    }      
        
}


