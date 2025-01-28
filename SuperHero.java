//Theoden Melgar
//CS1400
//Assignment 7
//11/26/2024
public class SuperHero extends Person {
    private String superName = "";
    private String superPower = "";
    private String catchphrase = "";
    private static int totalNumberVillainsCaught = 0;

    public SuperHero(String name, int age, String food, String superName, String superPower, String catchphrase){
        super(name, age, food);
        this.superName = superName;
        this.superPower = superPower;
        this.catchphrase = catchphrase;
    }

    public SuperHero(Person person, String superName, String superPower, String catchphrase){
        super(person.getName(), person.getAge(), person.getFood());
        this.superName = superName;
        this.superPower = superPower;
        this.catchphrase = catchphrase;
    }

    public SuperHero(SuperHero otherHero){
        super(otherHero.getName(), otherHero.getAge(), otherHero.getFood());
        this.superName = otherHero.getSuperName();
        this.superPower = otherHero.getSuperPower();
        this.catchphrase = otherHero.getCatchphrase();
    }

    public void speak(){
        System.out.println(catchphrase);
    }
    public static void catchVillain(){
        totalNumberVillainsCaught += 1;
    }
    public static int villainsCaught(){
        return totalNumberVillainsCaught;
    }

    public void setSuperName(String superName){
        this.superName = superName;
    }
    public void setSuperPower(String superPower){
        this.superPower = superPower;
    }
    public void setCatchphrase(String catchphrase){
        this.catchphrase = catchphrase;
    }

    public String getSuperName(){
        return superName;
    }
    public String getSuperPower(){
        return superPower;
    }
    public String getCatchphrase(){
        return catchphrase;
    }

    public String getSuperHeroInfo(){
        return superName + ": " + superPower;
    }
    
    public String toString(){
        String nameString = "Name: " + this.getName() + ", ";
        String ageString = "Age: " + this.getAge() + ", ";
        String foodString = "Food: " + this.getFood() + ", ";
        String superNameString = "SuperName: " + this.getSuperName() + ", ";
        String superpowerString = "Superpower: " + this.getSuperPower() + ", ";
        String catchphraseString = "Catchphrase: " + this.getCatchphrase();
        return '[' + nameString + ageString + foodString + superNameString + superpowerString + catchphraseString + ']';
    }
}
