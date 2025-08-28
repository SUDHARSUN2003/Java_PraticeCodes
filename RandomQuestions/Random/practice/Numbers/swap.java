package RandomQuestions.Random.practice.Numbers;
public class swap {
    public static void main(String[] args) {
        
        int a = 2 , b = 4 ;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        // a = a + b;
        // b = a - b;
        // a = a - b;

        System.out.println(a +" "+b);
    }
}
