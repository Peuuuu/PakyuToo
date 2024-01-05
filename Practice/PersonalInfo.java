import java.util.Scanner;
public class PersonalInfo {

    public static void main(String[] args) {
          Scanner pey = new Scanner (System.in);
          Information p = new Information();
          print("Input your first name:");
          p.firstName= pey.nextLine();
          print("Input your last name:");
          p.lastName = pey.nextLine();
          print("Input your age:");
          p.age = pey.nextInt();pey.nextLine();  
          print("Input your sex:");
          p.sex = pey.nextLine();
          p.enrolled = true;
        
          println(("Hello ")+(p.lastName)+(",")+("you are ")+(p.age)+(" and your status in enrollment is ")+(p.enrolled));
      }
       static void println(String word){
          System.out.println(word);
       }  
       static void print(String word){
          System.out.print(word);
       }
  
  }
