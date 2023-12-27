import java.util.Scanner;
public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner pey = new Scanner (System.in);
        boolean condition = true;
        
        do{
            System.out.println("--------------------\nTemperature Conversion\n--------------------");
            System.out.print("Enter Temperature in Celsius:");
            double Celsius = pey.nextDouble();pey.nextLine();
            double Farenheit = ((Celsius) * 9/5 + 32); 
            System.out.println(("Fahrenheit:") + Farenheit);
             
        
     
            System.out.println("Do you want to convert again?");
            String choice = pey.nextLine();  
            if(!choice.equalsIgnoreCase("Yes")){
                System.out.println("Thank you!");
                condition = false;
            }
            }
                 while(condition);
            
        }
        
    }

