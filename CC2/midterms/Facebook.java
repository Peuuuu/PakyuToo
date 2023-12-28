import java.util.Scanner;
public class Facebook {
    public static void main(String[] args) {
        Scanner pey = new Scanner(System.in);

                System.out.println("---------------\nWelcome to Facebook\n---------------");
                final String username = "admin";
                final String password = "123456";
                System.out.println("Enter A or a: For log-in\nEnter B or b: For Signup");
                System.out.print("input here:");
                String choice = pey.nextLine();
            if (choice.equalsIgnoreCase("A")){
                    System.out.print("Enter username:");
                    String inputOne = pey.nextLine();
                    System.out.print("Enter Password:");
                    String inputTwo = pey.nextLine();

            if ((inputOne.equals(username))&& (inputTwo.equals(password))){
                        System.out.println("Welcome to Facebook!");
                } else{
                        System.out.println("Invalid Input!");
                }
            }
            if (choice.equalsIgnoreCase("B")){
                    System.out.println("Sign-up to Facebook!");
                    System.out.print("Enter Name:");
                    String name = pey.nextLine();
                    System.out.print("Enter Email:");
                    String email = pey.nextLine();
                    System.out.print("Enter Password:");
                    String pass = pey.nextLine();
                    System.out.println("Enter Email and Password to Log-In:");
                    System.out.print("Email:");
                    String enterOne = pey.nextLine();
                    System.out.print("Enter Password:");
                    String enterTwo = pey.nextLine();

                if((enterOne.equals(email))&&(enterTwo.equals(pass))){
                        System.out.println(("Welcome to Facebook ")+ (name));

                }else{
                        System.out.println("Pakyu.");
                }
            }
        }
     }
