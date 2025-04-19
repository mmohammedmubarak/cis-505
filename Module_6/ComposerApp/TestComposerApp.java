/**
 * Mohammed A. (2025). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */
package Module_6.ComposerApp;

import java.util.List;
import java.util.Scanner;

public class TestComposerApp {

    public static void displayMenu() {
        System.out.print(
                "  MENU OPTIONS\n    1. View Composers\n    2. Find Composer\n    3. Add Composer\n    4. Exit\n\n  Please choose an option: ");
    } // end displayMenu

    public static void main(String[] args) {
        System.out.println("  Welcome to the Composer App");
        System.out.print("\n");
        MemComposerDAO composerDAO = new MemComposerDAO();
        Scanner sc = new Scanner(System.in);
        do {
            displayMenu();
            int input = 0;
            if (sc.hasNextInt())
                input = sc.nextInt();
            else {
                System.out.println("\n  Invalid Input Entered!\n");
                sc.close();
                return;
            }
            if (input == 1) { // display composers using find all method
                List<Composer> composers = composerDAO.findAll();
                System.out.print("\n\n");
                System.out.println("  --DISPLAYING COMPOSERS--");
                for (Composer composer : composers) {
                    System.out.print(composer.toString());
                    System.out.print("\n");
                }
            } else if (input == 2) { // display composer using find by method with id input
                System.out.print("\n");
                System.out.print("  Enter an id: ");
                int id = 0;
                if (sc.hasNextInt())
                    id = sc.nextInt();
                else {
                    System.out.println("\n  Invalid Input Entered\n");
                    sc.close();
                    return;
                }
                System.out.print("\n");
                System.out.println("  --DISPLAYING COMPOSER--");
                System.out.print(composerDAO.findBy(id).toString());
            } else if (input == 3) { // insert new composer
                System.out.print("\n");
                System.out.print("  Enter an id: ");
                int id = 0;
                if (sc.hasNextInt())
                    id = sc.nextInt();
                else {
                    System.out.println("\n  Invalid Input Entered!\n");
                    sc.close();
                    return;
                }
                System.out.print("  Enter a name: ");
                Scanner scName = new Scanner(System.in);
                String name = scName.nextLine();
                System.out.print("  Enter a genre: ");
                String genre = scName.nextLine();
                System.out.println("\n");
                composerDAO.insert(new Composer(id, name, genre));

            } else if (input == 4) { // Exit program
                System.out.print("\n  Program terminated by the user");
                sc.close();
                return;
            } else {
                System.out.println("\n  Invalid input Entered!");
            }

            System.out.print("\n");
        } while (true);
    } // end main
    
}
