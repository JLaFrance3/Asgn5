/* Jean LaFrance
 * 02/22/2024
 * Animal Picker program used to test git branch functionality
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String animal;      //User selected animal

        Scanner scan = new Scanner(System.in);
        
        //Welcome message and prompt
        System.out.println("Welcome to Animal Picker");
        System.out.println("Please pick either a 'cat', 'dog', or a 'fish':");

        //User selection
        animal = scan.nextLine();

        //Reformat
        animal = animal.toLowerCase();
        System.out.println();

        //Continually ask user for input until valid
        while (!(animal.equals("cat") || animal.equals("dog") || animal.equals("fish"))) {
            System.out.println("Please try again: ");
            animal = scan.nextLine();
        }

        if(animal.equals("cat")) {
            System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
        }
        else if(animal.equals("dog")) {
            System.out.println("(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
        }
        else if (animal.equals("fish")) {
            System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");
        }

        scan.close();
    }
}
