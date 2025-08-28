package RandomQuestions.Random.RandomQuestions;
import java.util.Arrays;

public class MaxElementOfSubArray {
    public static void main(String[] args) {
        
        int a[] = {2 , 3, 6 , 1 , 5 , 1};
        
        int k = 3;

        int b [] = new int[a.length-k+1];

        for(int i = 0 ;  i <= a.length - k ; i++)
        {
            int max = Integer.MIN_VALUE;

            for(int j = i ; j < i+3 ; j++)
            {
                if(max < a[j])
                  max = a[j];
            }
            b[i] = max;
        }
        System.out.println(Arrays.toString(b));
    }
}
