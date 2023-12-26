import java.util.Scanner;
public class Payslip {
    public static void main(String[] args) {
    
        Scanner pey = new Scanner (System.in);               
    
        String name, month;
        int idNumber;
        final int SSS = 894;
        final int philHealth = 583;
        final int pagibig = 200;
        final double tax = 0.10;
        boolean condition = true;

         while(condition){ 

             System.out.print("Do you want to enter information? y/n:");
             String choice = pey.nextLine();

             if (choice.equalsIgnoreCase("yes")){
                //reading information
                 System.out.println("----- Employee Information -----");
                 System.out.print("Name:");
                 name = pey.nextLine();
                 System.out.print("Month:");
                 month = pey.nextLine();
                 System.out.print("ID number:");
                 idNumber = pey.nextInt();
                 System.out.print("Basic Salary:");
                 double basicSalary = pey.nextDouble();pey.nextLine();
                 
                 
                 //computation of Total deduction 
                 //computation of Total Net Pay

                 double totalDeduction = (basicSalary * tax) + SSS + philHealth + pagibig;
                 double netPay = (basicSalary - totalDeduction);

                 // Printing of information
                 System.out.println("----- Payslip Information -----");
                 System.out.println(("Name:")+ (name));
                 System.out.println(("Month:")+ (month));
                 System.out.println(("ID Number:")+ (idNumber));
                 System.out.println(("Basic Salary:")+ (basicSalary));
                 System.out.println(("Total Deduction:")+ (totalDeduction));
                 System.out.println(("Total Net Pay:")+ (netPay));


             }else if (choice.equalsIgnoreCase("no")){
                 System.out.println("Thank You!");
                 condition = false;

             }else{
                 System.out.println("Invalid Choice!");

             } 

            }
        }

    }
 


    



