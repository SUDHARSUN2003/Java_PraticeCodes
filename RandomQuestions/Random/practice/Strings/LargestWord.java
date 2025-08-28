package RandomQuestions.Random.practice.Strings;
public class LargestWord {
    public static void main(String[] args) {
        String str = "hi iam sudharsun";

        int max = Integer.MIN_VALUE , index = 0;
       
        String s[] = str.split(" ");

        for(int i = 0 ; i < s.length ; i++)
        {
            if(max < s[i].length())
            {
              max = s[i].length();
              index  = i ; 
            }
        }

        System.out.println(s[index]);
    }
}
