//Theoden Melgar
//CS1400
//Assignment 7
//11/26/2024 

public class Demo {
    public static void main(String[] args){
        Person alice = new Person("Alice", 20, "Ice Cream");
        Person bob = new Person("Bob", 65, "Burgers");
    
        SuperHero awesomeGirl = new SuperHero(alice, "Awesome Girl", "Super speed", "I am speed!");
        SuperHero surge = new SuperHero("Rob", 15, "Energy drinks", "Surge", "Super strength", "Power surge!");
    
        //use copy constructor
        Person bobClone = new Person(bob);
        //use equals
        if(bob.equals(bobClone)){
            System.out.println("Bob equals bobClone!");
        }
        else{
            System.out.println("Bob does not equal bobClone!");
        }
    
        if(bob.equals(alice)){
            System.out.println("Bob equals Alice!");
        }
        else{
            System.out.println("Bob does not equal Alice!");
        }
        //use toString
        System.out.println(alice.toString());
        System.out.println(bob.toString());
        //use speak
        surge.speak();
        //use toString
        System.out.println(awesomeGirl.toString());
        System.out.println(surge.toString());
        //use catchVillain
        SuperHero.catchVillain();
        //use villainsCaught
        System.out.println("Villains caught: " + SuperHero.villainsCaught());
    }
}
