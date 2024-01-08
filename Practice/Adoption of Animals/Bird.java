
public class Bird extends Animals{
        String pet;
        String name;
        String breed;
        String address;
        
        
      public void deets(){
        System.out.println(("My name is ")+(name));
        System.out.println(("I am a ")+(pet));
        System.out.println(("A ")+(breed));
        System.out.println(("I live in ")+(address));
    }     
    public void birdie()  {
        name = "birdie";
        pet = "bird";
        breed = "parrot";
        address = "Tarlac City";
        deets();
    }
      public void tweetie()  {
        name = "Tweetie";
        pet = "bird";
        breed = "parrot";
        address = "To be adopted";
        
        deets();
}
