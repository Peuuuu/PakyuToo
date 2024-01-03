package com.mycompany.finals;
import java.util.Scanner;
public class Twitter {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int tries = 1;
        boolean condition = true;
        boolean match = false;
        String givenName[] = { "Paolo", "Faye", "Ishmael", "Allen", "Cedrick"};
        String lastName[] = { "Franco", "Samson", "Lapus", "Torres", "Austria"};
        String users[] = { "Pao", "Pey", "Ish", "Len", "Ced"};
        String password[] = {"ciupaoo", "peuuuu", "josee", "starryyy", "mfaustria111"};

        while (condition){
            System.out.println("----------------Twitter Log in System----------------");
            System.out.print("Enter username:");
            String userName = sc.nextLine();
            System.out.print("Enter password:");
            String pass = sc.nextLine();
            for (int i = 0; i < users.length;i++){
                if ((userName.equalsIgnoreCase(users[i]))&& pass.equals(password[i])){
                    match = true;
                    System.out.println("------Account Profile------");
                    System.out.println(("First name:")+ givenName[i].toUpperCase());
                    System.out.println(("Last name:")+ lastName[i].toLowerCase());
                    condition = false;
                    break;
                }
            } if (!match) {
                tries++;
                if (tries == 3){
                    System.out.println("Account locked.");
                    condition = false;
                } else {
                    System.out.println("Invalid input.Try again.");
                }
            } 
        }
    }

}
