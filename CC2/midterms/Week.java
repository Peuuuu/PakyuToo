import java.util.Scanner;
        
public class Week {
    public static void main(String[] args) {
        //scanner
        Scanner pey = new Scanner (System.in);
        
        boolean condition = true;
        
        while (condition){
            System.out.print("Instructions: Enter a number 1-7 representing a day! \n Enter your choice:");
            String choice = pey.nextLine();
        switch (choice){
            case "1": 
                System.out.println("Using Switch: It's Sunday!");
                break;
            case "2":
                System.out.println("Using Switch : It's Monday!");
                break;
            case "3":
                System.out.println("Using Switch : It's Tuesday!");
                break;
            case "4":
                System.out.println("Using Switch : It's Wednesday!");
                break;
            case "5":
                System.out.println("Using Switch : It's Thursday!");
                break;
            case "6":
                System.out.println("Using Switch : It's Friday!");
                break;
            case "7":
                System.out.println("Using Switch : It's Saturday");
               break;
               
            default:
                System.out.println("Invalid number!");
                break;
        }
            System.out.println("Enter y/Y if you want to enter again:");
            String decision = pey.nextLine();
            
                if (!decision.equalsIgnoreCase("y"))
                    System.out.println("Thank You");
                    condition = false;

            
     
        }
    
    }
    
}
