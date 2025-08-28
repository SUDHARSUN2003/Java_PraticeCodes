//Input : 7 1 3 4 1 7
//Output : 3
//(1,1)-(1,3,4,1)=3distance 
package RandomQuestions.Random.RandomQuestions;
import java.util.HashMap;
public class mindis
{
    public static void main(String[] args) {

        int a[] = {7,1,3,4,1,7};
        int min = Integer.MAX_VALUE;
        HashMap <Integer , Integer> pair = new HashMap<>();

        for(int i = 0 ; i<a.length ; i++)
        {
            if(pair.containsKey(a[i]))
            {
                pair.put(a[i],pair.get(a[i]));

                if(min > i - pair.get(a[i]))
                  min =  i - pair.get(a[i]);
                  
            }
            else
            {
                pair.put(a[i] , i);
            }
        }

        if(min == Integer.MAX_VALUE)
             System.out.println(-1);
        else
             System.out.println(min);
        
        
    }
}