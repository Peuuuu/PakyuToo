import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        
        Scanner pey = new Scanner (System.in);
        Factors total = new Factors();
         
        System.out.print("Enter num One:");
        int a = pey.nextInt();
        System.out.print("Enter num Two:");
        int b = pey.nextInt();
        
        total.add(a,b);
        total.subtract(a, b);
        total.multiply(a, b);
        total.divide(a, b);
        total.square(a);
        
       
    }
}
