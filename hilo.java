import java.util.Scanner;

public class hilo{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String playAgain = "";

        do {

            int theNumber = (int)(Math.random()*100 +1);

            int guess = 0;

            int tries = 0;

            System.out.println("Guess a number between 1 and 100");
            while ( guess != theNumber) {
                guess = scan.nextInt();
                if (guess < theNumber){
                    System.out.println(guess + " is too low. Try again. ");
                } 
                else if (guess > theNumber) {
                    System.out.println(guess + " is to high. Try again. ");
                } else {
                    System.out.println(guess + " is correct! you win! it took you "+tries+" tries");
                }
                tries++;
            } //end of while loop
        
            System.out.print("Would you like to play agian? (y or n)");
            playAgain = scan.next();
        
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing. goodbye");
        scan.close();
    }
}