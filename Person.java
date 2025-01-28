//Theoden Melgar
//CS1400
//Assignment 7
//11/26/2024
public class Person{
    private String name = "";
    private int age = 0;
    private String food = "";

    public Person(String name, int age, String food){
        this.name = name;
        this.age = age;
        this.food = food;
    }
    public Person(Person other){
        this(other.getName(), other.getAge(), other.getFood());
    }

    public boolean equals(Person other){
        if
            (
            this.name.equals(other.getName())
            && this.age == other.getAge() 
            && this.food.equals(other.getFood())
            )
        {
            return true;
        }
        return false;
    }

    public String toString(){
        String nameString = "Name: " + this.name + ", ";
        String ageString = "Age: " + this.age + ", ";
        String foodString = "Food: " + this.food;
        return '[' + nameString + ageString + foodString + ']';
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setFood(String food){
        this.food = food;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getFood(){
        return food;
    }
}