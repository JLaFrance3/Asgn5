import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        String animal;      //User selected animal

        Scanner scan = new Scanner(System.in);
        
        //Welcome message and prompt
        System.out.println("Welcome to Animal Picker");
        System.out.println("Please pick either a 'cat' or a 'dog':");

        //User selection
        animal = scan.nextLine();

        //Reformat
        animal = animal.toLowerCase();
        System.out.println();

        //Continually ask user for input until valid
        while (!(animal.equals("cat") || animal.equals("dog"))) {
            System.out.println("Please try again: ");
            animal = scan.nextLine();
        }

        if(animal.equals("cat")) {
            System.out.println(" _._     _,-\'\"\"`-._\n(,-.`._,\'(       |\\`-/|\n    `-.-\' \\ )-`( , o o)\n          `-    \\`_`\"\'-");
        }
        else if(animal.equals("dog")) {
            System.out.println("(\\,--------\'()\'--o\n (_    ___    /~\"\n  (_)_)  (_)_)");
        }
        else {
            //This is an error message
            System.out.println("That is not a 'cat' or a 'dog'");
        }

        scan.close();
    }
}
