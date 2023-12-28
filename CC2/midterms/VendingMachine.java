import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        Scanner pey = new Scanner(System.in);

            System.out.println("---------------Soda Vending Machine---------------");
            System.out.println("|                  a)Tite:20                       |");
            System.out.println("|                  b)Burat:25                      |");
            System.out.println("|                  c)Pakyu:30                      |");
            System.out.println("|                  d)Mwah:35                       |");
            System.out.println("____________________________________________________");
            System.out.println("____________________________________________________");  
            System.out.print("Enter your budget:");
            double budget = pey.nextDouble();pey.nextLine();
            System.out.print("Enter your order:");
            String choice = pey.nextLine();

            switch (choice){
                case "a":
                    if (budget>=20){
                    System.out.println("----------Receipt----------");
                    System.out.println("You ordered Tite!");
                        System.out.println(("Change:")+ (budget-20));
                    }else{
                        System.out.println("haha tite!");
                    }
                    break;
                 case "b":
                    if (budget>=25){
                    System.out.println("----------Receipt----------");
                    System.out.println("You ordered Burat!");
                        System.out.println(("Change:")+ (budget-25));
                    }else{
                        System.out.println("Puke!");
                    }
                    break;
                 case "c":
                    if (budget>=30){
                    System.out.println("----------Receipt----------");
                    System.out.println("You ordered Pakyu!");
                        System.out.println(("Change:")+ (budget-30));
                    }else{
                        System.out.println("Pakyutoo!"); 
                    }
                    break;
                 case "d":
                    if (budget>=35){
                    System.out.println("----------Receipt----------");
                    System.out.println("You ordered Mwah!");
                        System.out.println(("Change:")+ (budget-35));
                    }else{
                        System.out.println("Ah wala shang mwamwa!");
                    }
                    break;
                 default:
                     System.out.println("Invalid choice.");
                    break;

            }

        }
    }
