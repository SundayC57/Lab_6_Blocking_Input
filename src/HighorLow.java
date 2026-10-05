import java.util.Scanner;
import java.util.Random;
public class HighorLow {
    void main() {
        Scanner in = new Scanner(System.in);
        int userGuess = 0;
        String trash = " ";
        boolean done = false;
        Random rand = new Random();
        int randNum = rand.nextInt(10)+1;

       do{
           IO.print("Enter your guess [1-10]: ");

           if(in.hasNextInt())
           {
               userGuess = in.nextInt();
               if(userGuess >= 1 && userGuess <= 10){
                   if(userGuess == randNum){
                       IO.println("You guessed it!");
                       done = true;
                   }
                   else if(userGuess <= randNum){
                       IO.println("Your guess is lower! Try again!");
                   }
                   else {
                       IO.println("Your guess is higher! Try again!");
                   }
               }
               else{
                   IO.println("You guessed a number out of range: " + userGuess + " Try again!");
               }

           }
           else
           {
               trash = in.nextLine();
               IO.println("You entered an invalid input: " + trash + " Please try again and enter a number [1-10]");
           }


       }while(!done);


    }
}
