package RandomQuestions.Random.practice.Strings;

public class Reverse {
    public static void main(String[] args) {
        
        String s= "sudharsun";
        StringBuilder rev = new StringBuilder();
        for(int i = s.length()-1 ; i >= 0 ; i--)
        {
            rev.append(s.charAt(i));
        }

        System.out.println(rev);   
    }
}
