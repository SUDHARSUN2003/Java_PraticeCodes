package RandomQuestions.Random.practice.Numbers;

public class palindrome {
    
    public static void main(String[] args) {
        {
            int n = 129876;
            int temp = 0 ;
            int t1=n;

            while(n>0)
            {
                temp += 10 * n%10;
                n/=10;
            }

            if(temp==t1)
            {
                System.out.println("palindrome");
            }
            else
            {
                System.out.println("not a palindrome");
            }

        }
    }
}
