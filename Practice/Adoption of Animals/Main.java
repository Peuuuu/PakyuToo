import java.util.Scanner;
//main 
  
    public class Main {
   
        static void print(String word){
            System.out.println(word);
        }
        static void menu(){
            print("=========Menu=========");
            print(" 1.Husky");
            print(" 2.Labrador");
            print(" 3.Black cat");
            print(" 4.Orange cat");
            print("======================");
        }
   
    public static void main(String[] args) {
        
            Scanner pey = new Scanner (System.in);
            Dog Husky = new Dog (); 
            Dog Labrador = new Dog();
            Cat Black = new Cat ();
            Cat Orange = new Cat();
            menu();//show menu
            System.out.print("Choose your pet:");
            int choice = pey.nextInt();pey.nextLine();

            switch (choice){
                case 1: Husky.Chia();
                break;
                case 2: Labrador.Labby();
                break;
                case 3: Black.kiki();
                break;
                case 4: Orange.tangerine();
                break;
                default:
                    print("Invalid choice.");
                break;
            }

        }

    }
