package RandomQuestions.Random.RandomQuestions;
import java.util.HashMap;
public class PairWithGivenSum {    public static void main(String[] args) {      
  int[] array = {10, 2, 3, 7, 5, 8};        
  int targetSum = 10;
        HashMap<Integer, Integer> complementMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {          
          int currentElement = array[i];            
        int complement = targetSum - currentElement;
                
             if (complementMap.containsKey(complement)) {              
               System.out.println("Pair found: (" + complement + ", " + currentElement + ")");            }
              
               complementMap.put(currentElement, i);        }    }}