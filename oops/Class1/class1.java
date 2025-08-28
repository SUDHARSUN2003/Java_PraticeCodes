package Class1;

 class Example {
    static int count =0; //static initilization
    String name;
    int age;
    
    static  //static block
    {
        System.out.println("Static Block firt executed");
    }
    Example()  //default constructor
    {
        this("unknown" , 20); //call parameterized constructor within default constructor
       
    }

    Example(String name , int age)  //para constructor
    {
        this.name = name;
        this.age = age;
        count++;
    }
    
    void display()  //instance method
    {
        System.out.println("Name : "+this.name+ " | Age : " + this.age);
    }

    static void fun() //static method
    {
        System.out.println("Static method is executed");
    }
}

public class class1
{
    public static void main(String[] args) {
        
     Example student1 = new Example();
     Example student2 = new Example("sudha", 28);

  //   display() - can't access non static method from static method

     student1.display(); // creating obj we can access non static method from static method
     student2.display();

     Example.fun(); //call static method 

     System.out.println("count : " + Example.count); //print static variable

}
}
