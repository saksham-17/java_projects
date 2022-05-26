import java.util.Random;
import java.lang.String;
import java.util.Scanner;
public class App 
{
    public static void main(String[] args) throws Exception 
    {

        //Initialize
        Scanner sc = new Scanner(System.in);
        int limit = 10;
        Random rand = new Random();
        String  snake = "~";
        String fruit = "*";
        int a = rand.nextInt(limit);
        int b = rand.nextInt(limit);   
        a = rand.nextInt(limit);
        b = rand.nextInt(limit);
        
        //Position of Snake and fruit;
        for(int i=0; i<10; i++)   
        {     
            for(int j=0; j<=10; j++)   
            {   
                if (i==0 && j==0)
                { 
                    System.out.println(snake);
                }
                if (i == a && j == b)
                {
                    System.out.print(fruit);
                }  
                else
                {
                    System.out.print(" ");  
                }
            }
            System.out.print("\n");     
        }

        //Movement
        System.out.println("Where to go w a d s");
        String move = sc.next();
        switch(move)     
        {
            case "w":
            {
                System.out.println("Go forward");
                break;
            }
            case "d":
            {
                System.out.println("Go right"); 
                break;
            }
            case "a":
            {
                System.out.println("Go left");
                break;
            }
            default:
            {
                System.out.println("Go forward");
            }
        }            
    }
}

