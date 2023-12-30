import java.util.Scanner;
public class ScenarioTwo {
    public static void main(String[] args) {
        
        Scanner pey = new Scanner (System.in);
        StringBuilder pao = new StringBuilder ();

        System.out.print("Enter first string:");
        String first = pey.nextLine();
        pao.append(first);
        pao.append(" ");
        System.out.print("Enter second string:");
        String second = pey.nextLine();
        pao.append(second);

         System.out.println(pao);

     }
 }
