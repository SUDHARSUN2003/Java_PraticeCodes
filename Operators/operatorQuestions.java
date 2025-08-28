package Operators;
public class operatorQuestions
{
    public static void main(String[] args) {
        int a= 10 ;
        int i=4;
        find_ithBit(a, i);
        set_ithBit(a, i);
        reset_ithBit(a, i);
       
    }

    public static void find_ithBit(int n , int i) 
    {
        System.out.println(n & (1<<(i-1)));
    }

    public static void set_ithBit(int n , int i) 
    {
        System.out.println(n | (1<<(i-1)));
    }
    
    public static void reset_ithBit(int n , int i) 
    {
        System.out.println(n & ~(1<<(i-1)));
    }
}
