package RandomQuestions.Random.practice.Numbers;

public class singleDigit {
    
    public static void main(String[] args) {
        int n= 999;
        System.out.println(isSingle(n));
        }
    public static int isSingle(int n)
    {
        int sum=0;
        while(n > 0)
        {
            sum += n%10;
            n/=10;
        }

        if(sum > 9)
          return isSingle(sum);
        
        return sum;
    }
}
