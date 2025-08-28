package RandomQuestions.Random.practice.Strings;

public class StringMultipler1 {
    public static void main(String[] args) {
        
        String s = "aabbbbc";
        StringBuilder sb = new StringBuilder();
        int c = 1;

        for(int i = 0 ; i < s.length() ; i++)
        {
            if(i+1 < s.length() && s.charAt(i) == s.charAt(i+1))
            {
                c++;
            }
            else
            {
                sb.append(s.charAt(i)).append(c);
                c=1;
            }
           
        }
        System.out.println(sb);
    }
}
