package Inheritance;

class Animal
{
    void walk()
    {
        System.out.println("Animal can Walk");
    }
}

class Dogs extends Animal
{
    void bark()
    {
        System.out.println("Dog can Bark");
    }
}
public class single {

    public static void main(String[] args) {
        
        Dogs pet = new Dogs();

        pet.bark();
        pet.walk();
    }
}