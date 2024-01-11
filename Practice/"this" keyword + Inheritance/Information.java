public class Information extends Students{
    String name, address;
    int age, birthYear;
    
 
    Information (String name, String address, int age, int birthYear){
        this.name = name;
        this.address = address;
        this.age = age;
        this.birthYear = birthYear;
   
    }  
    public void print(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
        System.out.println(birthYear);
    }
}
    

