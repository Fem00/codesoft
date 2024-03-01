import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int limit = 5;
        int playerguess=0;
        int totalguess=0;
        int random_no = random.nextInt(100)+1;

        System.out.println("***************************");
        System.out.println(" WELCOME TO GUESSING GAME ");
        System.out.println("***************************");
        System.out.println("press 1 to start the game :");
        int choice = scan.nextInt();
        if (choice == 1){
            while (playerguess != random_no && limit >0 ){
                System.out.println("Enter your guess from 0-100");
                System.out.println(" you have " +limit+ " guesses " );
               // System.out.println("random number is : " +random_no);
                 playerguess = scan.nextInt();
                 limit--;
                if (playerguess == random_no){
                    System.out.println("Guess correct !!! YOU WIN");
                    break;
                } else if (random_no > playerguess) {
                    System.out.println(" guess is lower");
                }
                else if(random_no < playerguess) {
                    System.out.println(" is higher!!!");
                }
            }

        }

totalguess +=(5-limit);
        System.out.println("Total guesses made :" +totalguess);
        System.out.println("you have reached your maximum guess limit");
        System.out.println("THE number was " +random_no);




    }
}