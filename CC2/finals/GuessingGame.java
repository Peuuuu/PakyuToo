import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        
       Random output = new Random();
       Scanner pey = new Scanner (System.in);
        
        int randomNumber = output.nextInt(50)+1;
        int guess;
        int times = 0;
        boolean correctGuess = false;

         while (!correctGuess){
             System.out.println("-----Hula Hula-----");
             System.out.print("Input your guess:");
             guess = pey.nextInt();pey.nextLine();
             times++;

             if (guess==randomNumber){
                 System.out.println(("Galing mo manghula ng " )+(times)+ (" beses"));
                 times = 0;
                 System.out.print("Gusto mo pa ba?");
                 String answer = pey.nextLine();
                 if(answer.equalsIgnoreCase("no")){
                     System.out.println("gegegege");          
                     pey.close(); 
                     break;
                 }
             }else if(guess>randomNumber){
                 System.out.println("Babaan mo pa!");
             }else{
             System.out.println("Higher!");
            }
        }        
    }
}

