
import java.util.Scanner;

public class ProjectOne {

    public static void main(String[] args) {
        Scanner pey = new Scanner(System.in);
        boolean condition = true;
        String choice = "yes";
        
 while (condition){
                   
        if (choice.equalsIgnoreCase("yes")) {    
        System.out.print("Do you love dogs? ");
                choice = pey.nextLine();
            
            if (choice.equalsIgnoreCase("yes")) {
                        System.out.print("Do you want to donate 100 to save one dog? y/n: ");
                        choice = pey.nextLine();
                       
        } else {
                System.out.print("Would you like to donate instead??!");
                choice = pey.nextLine();
           
            }
                    if   (choice.equalsIgnoreCase("no")) {
                System.out.print("Are you sure you don't want to donate? ");
                choice = pey.nextLine();
             } else {
                System.out.println("Thank You for donating!");
                condition = false;
            }
        
 }
 }
    }
}
