import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {

            Scanner pey = new Scanner (System.in);
            StringBuilder password = new StringBuilder ();

            System.out.println("--------------Password Generator-------------");
            System.out.print("Given Name:");
            String givenName = pey.nextLine();
            password.append(givenName.substring(0,2));
            System.out.print("Last Name:");
            String lastName = pey.nextLine();
            password.append(lastName.substring(0,1));
            System.out.print("Enter Month:");
            String month = pey.nextLine();
            password.append(month.substring(3,4));
            System.out.print("Favorite color:");
            String color = pey.nextLine();
            password.append(color.substring(2,3));
            System.out.print("Contact number:");
            String phone = pey.nextLine();
            password.append(phone.substring(9,10));

            System.out.println(("Your password:") + password);


        }
    }
