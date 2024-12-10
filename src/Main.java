import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Steg 1
        if (6 >= 3) {
            System.out.println("Hello, World!");
        }

        // Steg 2
        System.out.println("What is your name?");
        System.out.print(">>> ");
        String name = sc.nextLine();
        if (name.equalsIgnoreCase("noname")) {
            System.out.println("Welcome!");
        }

        // Steg 3
        System.out.println("What is your password?");
        System.out.print(">>> ");
        String password = sc.nextLine();
        if (name.equalsIgnoreCase("noname") && password.equalsIgnoreCase("nopass")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Wrong username or password");
            System.out.println();
        }

        // Steg 4
        for (int i = 0; i < 32; i++) {
            System.out.println("Hello, World");
        }

        // Steg 5
        boolean correctPassword = false;
        while (!correctPassword) {
            System.out.println("Enter the password:");
            System.out.print(">>> ");
            String enteredPassword = sc.nextLine();
            if (enteredPassword.equalsIgnoreCase("nopass")) {
                System.out.println("Correct Password!");
                correctPassword = true;
            } else {
                System.out.println("Wrong password, try again.");
            }
        }

        // Steg 6
        for (int i = 0; i < 5; i++) {
            boolean validInput = false;
            int number = 0;
            while (!validInput) {
                System.out.println("Enter a number:");
                System.out.print(">>> ");
                String input = sc.nextLine();
                try {
                    number = Integer.parseInt(input);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("Det du skrev in kunde inte konverteras till ett tal, Försök igen.");

                    throw new RuntimeException(e);
                }
            }
            if (number > 5) {
                System.out.println("Högre än 5!");
            }
        }

        //Steg 7
        for (int i = 10; i > 0; i--) {

            System.out.println("Number of guesses left: " + i );
            System.out.println("Guess a number between 1-10");
            System.out.println(">>> ");
            int guessNumber = sc.nextInt();
            int randomNumber = rand.nextInt(1, 10);
            if (guessNumber == randomNumber) {
                System.out.println("You guessed right");
                break;
            } else if (i == 0) {
                System.out.println("You have no guesses left");
            } else {
                System.out.println("You guessed wrong, try again");
            }
        }


    }
}
