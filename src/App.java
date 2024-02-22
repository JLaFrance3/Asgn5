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

        if(animal.equals("cat")) {
            System.out.println("CAT ASCII ART HERE");
        }
        else if(animal.equals("dog")) {
            System.out.println("DOG ASCII ART HERE");
        }
        else {
            System.out.println("That is not a 'cat' or a 'dog'");
        }

        scan.close();
    }
}
