package Generics;
class GenericsMethod{

    public static <T> void display(T element)
    {
        System.out.println(element);
    }
    public static void main(String[] args) {
       
        
        display(10);
        display("Sun");

    }
}