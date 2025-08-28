package Interface;

interface animal
{
    void sound();
}

class Dog implements animal
{
    @Override
    public void sound()
    {
       System.out.println("Dog");
    }
}

public class Main
{
    public static void main(String[] args) {
        
        animal obj = new Dog();
        obj.sound();
       
    }
}