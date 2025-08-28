package Inheritance;

class one {

    void value1()
    {
        System.out.println("one");
    }
}

class two extends one{

    void value2()
    {
        System.out.println("two");
    }
}

class three extends two{

    void value3()
    {
        System.out.println("three");
    }
}

public class Multilevel
{
    public static void main(String[] args) {
        
        three number = new three();
        number.value1();
    }
}
