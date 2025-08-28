package RandomQuestions.Random.practice.Strings;

public class ReverseEachWord {
    
    public static void main(String[] args) {
        
        String s = "Hi Iam Sudharsun";
        String a[] = s.split(" ");

        StringBuilder rev = new StringBuilder();

        for(String i : a)
        {
           
            for(int j = i.length()-1 ; j >= 0 ; j--)
        {
            rev.append(i.charAt(j));
        }
            
            rev.append(" ");
        }

        System.out.print(rev);
    }
}


