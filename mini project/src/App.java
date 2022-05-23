//Guess the random number in 10 time

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int random = (int)(Math.random()*100);
        int guess = -1;
        int i = 10;
        do 
        {
            System.out.println("You have " + i + " chance");
            System.out.print("Guess the no from 1-100: ");
            guess = sc.nextInt();
            if ( random > guess)
            {
                System.out.println("Wrong! Your guess is too small\n");
            }
            else if(random <guess)
            {
                System.out.println("Wrong! Your guess is too high\n");
            }
            else
            {
                System.out.println("Correct answer\n");
                break;
            }  
            i--;            
        } while (guess >=0 && i>0);
        if (i == 0 )
        {
            System.out.println("You lost! The correct answer is: " + random);
        }
    }
}
