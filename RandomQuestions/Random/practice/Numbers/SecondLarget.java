package RandomQuestions.Random.practice.Numbers;
import java.util.HashSet;
public class SecondLarget {
    public static void main(String[] args) {
        int a[] = {1,5,8,8,5,5};
                
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i=0;i<a.length;i++)
        {
            set.add(a[i]);
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i : set)
        {
            if(i>max1)
            {
                max2 = max1;
                max1 = i;
            }
        }
        System.out.println(max2);
}
}
