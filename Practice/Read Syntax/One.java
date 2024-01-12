import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Handling3000 {

    public static void main(String[] args) throws FileNotFoundException{
        
      //http://textfiles.com/100/captmidn.txt
      
      File pey = new File ("/Users/jazzm/Onedrive/Desktop/samson.txt");
      Scanner kiki = new Scanner (pey);
      
      while (kiki.hasNextLine()){
        System.out.println(kiki.nextLine());
      
      }
      
    }
    
}
