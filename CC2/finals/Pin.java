import java.util.Scanner;
class Pin {
    public static void main(String[] args) {
          
          Scanner pey = new Scanner (System.in);
          String pin = "0024";
          String username = "admin";
          boolean condition = true;
          int tries = 0;
  
          while (condition){
              System.out.print("Enter username:");
              String inputName = pey.nextLine();
              System.out.print("Enter passcode:");
              String passcode = pey.nextLine();
              
          if((inputName.equalsIgnoreCase(username))&&(passcode.equals(pin))){
              System.out.println("Hello mf!");
              condition = false;
              break;
          } else if (tries==3){
                 System.out.println("Locked.");
                 condition = false;
          }else {
                  tries ++;
                  System.out.println("Input does not match.Try again!");
              } 
          }
      }
  }
