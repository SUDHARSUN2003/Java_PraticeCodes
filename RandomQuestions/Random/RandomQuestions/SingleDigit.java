package RandomQuestions.Random.RandomQuestions;
public class SingleDigit {
    public static void main(String[] args) {
        int n = 678;
        sum(n);
        System.out.println(sum(n));
    }
    public static int sum(int n)
    {
        int res =0;
        while(n>0)
        {
            res = res + n%10;
            n/=10;
        }

        if(res>9)
            return sum(res);
        return res;
    }
}
