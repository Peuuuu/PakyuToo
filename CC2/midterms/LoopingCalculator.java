import java.util.Scanner;
public class LoopingCalculator {
    public static void main(String[] args) {
  Scanner pey = new Scanner (System.in);
  
  int inputOne , inputTwo; 
  int choice;
  int answer = 0;
  boolean condition = true;
  
 
     System.out.println("_______________________\n Calculator\n_______________________" );     
     System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
     
     while (condition){
    //scanners
       
        System.out.print("First Input:");
        inputOne = pey.nextInt();
        System.out.print("Second Input:");
        inputTwo = pey.nextInt();
        System.out.print("Choose your fighter:"); 
        choice = pey.nextInt();
     
     switch (choice){
         case 1: 
             answer = (inputOne) + (inputTwo);
             System.out.println(("Sum:") + (answer));
             break;
         case 2: 
             answer = (inputOne) - (inputTwo);
             System.out.println(("Difference:") + (answer));
             break;
         case 3: 
             answer = (inputOne) * (inputTwo);
             System.out.println(("Product:") + (answer));
             break;
         case 4: 
             answer = (inputOne) / (inputTwo);
             System.out.println(("Quotient:") + (answer));
             break;
         case 5: 
             System.out.println("Goodbye, Thank you!");
             condition = false;
             break;
         default:
             System.out.println("Invalid Choice!");
             
     }      
             
                
             
     }

    }
    
}
