package com.mycompany.animals;
public class Cat extends Animals{
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
    public void kiki()  {
        name = "kiki";
        pet = "cat";
        breed = "black";
        age = 5;
        address = "Tarlac City";
        deets();
    }
      public void tangerine()  {
        name = "Tangerine";
        pet = "cat";
        breed = "orange";
        age = 8;
        address = "To be adopted";
        
        deets();
    }    
    
}
