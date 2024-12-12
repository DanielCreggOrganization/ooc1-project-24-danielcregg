package ie.atu.watchmanager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create WatchManager object
        WatchManager watchManagerObject = new WatchManager();

        // Instantiate Scanner class so we can start reading user input
        Scanner userInput = new Scanner(System.in);
        int userSelection = 0; // Used to store user Menu option selection

        // Create infinite while loop to display Menu after every command
        while (true) {
            // Display Menu to console
            System.out.println("");
            System.out.println("##################################");
            System.out.println("#      Watch Manager v0.9  #");
            System.out.println("##################################");
            System.out.println("(1) Add a Watch.");
            System.out.println("(2) Delete a Watch.");
            System.out.println("(3) Show total Number of Watch.");
            System.out.println("(4) Search for a Watch by ID.");
            System.out.println("(5) Quit.");
            System.out.println("Select an option from 1 to 5 and press Enter>");

            // Store user Menu option selection
            userSelection = userInput.nextInt();

            // If user selects option 1
            if (userSelection == 1) {
                // Ask user to enter Watch details
                System.out.println("Enter Watch Serial Number:");
                int serialNumber = userInput.nextInt();
                System.out.println("Enter Watch Brand:");
                String brand = userInput.next();
                System.out.println("Enter Watch Price:");
                float price = userInput.nextFloat();
                System.out.println("Is Watch Sold? (true/false):");
                boolean isSold = userInput.nextBoolean();

                // Create Watch object
                Watch myWatch = new Watch(serialNumber, brand, price, isSold);
                watchManagerObject.addWatch(myWatch);
            } // end if

            if (userSelection == 5) { // Quit

                System.out.println("Watch Application Closing - Goodbye!");
                // Close the User Input Scanner
                userInput.close();
                break; // Break out of display Menu infinite loop
            } // end if
        } // end while
    } // end main method
} // end Main class
