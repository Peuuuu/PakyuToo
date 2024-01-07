public class Dog extends Animals { //animals yon main mo
      
          String pet;
          String name;
          String breed;
          String address;
          int age = 0;
          
      public void deets(){
          System.out.println(("My name is ")+(name));
          System.out.println(("I am a ")+(pet));
          System.out.println(("A ")+(breed));
          System.out.println(("I live in ")+(address));
      }
  
      public void Chia()  {
          name = "Chia";
          pet = "dog";
          breed = "Husky";
          age = 16;
          address = "San Roque Tarlac City";
          deets();
      }    
          
      public void Labby()  {
          name = "Labby";
          pet = "dog";
          breed = "Labrador";
          age = 19;
          address = "San Vicente Tarlac City";
          deets();
          
      }   
  }

