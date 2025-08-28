package Generics;

class Test<T> {
    T obj;
    Test(T obj)
    {
        this.obj = obj;
    }
    
    public T  display()
    {
        return this.obj;
    }
    
}

public class GenericsClass
{
    public static void main(String[] args) {
        
        Test<Integer> obj1 = new Test<>(10);
        System.out.println(obj1.display());

        Test<String> obj2 = new Test<>("Sun");
        System.out.println(obj2.display());
    }
}