package AbstractClass;

abstract class Animal {
          
    abstract void sound();
    
}

class Dog extends Animal
{
    @Override
     void sound()
    {
        System.out.println("Dog");
    }
}

public class abstractclass {
    public static void main(String []args)
    {
        Animal obj = new Dog();
        obj.sound();
    }
}
