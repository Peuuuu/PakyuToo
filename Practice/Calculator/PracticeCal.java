import java.util.Scanner;
public class PracticeCal {

    static void printNum (int word){ //To print number 
            System.out.print(word); 
    }
    static void print (String wordOne){ //To print String
            System.out.print(wordOne);
    }
    static void add (int numOne,int numTwo){  //asks a user for two inputs to add
        print ("Sum:");
        printNum((numOne)+(numTwo));    //formula
    }
    static void squared(int square){ //asks a user a user a number
        printNum((square)*(square)); // formula 
    }
  
  public static void main(String[] args) {
       Scanner pey = new Scanner (System.in);
       
        print("Enter number to be added to 20:");
        add(pey.nextInt(),20);
        
        print("\nEnter number to be added:");
        print ("\nInput one:");
        int One = pey.nextInt();
        print ("Input two:");
        int Two = pey.nextInt();
        add(One,Two);
        
        print("\nEnter a number to be multiplied to itself:");
        squared(pey.nextInt());
 }
  
}
