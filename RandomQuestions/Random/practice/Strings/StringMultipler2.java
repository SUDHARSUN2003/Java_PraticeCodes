package RandomQuestions.Random.practice.Strings;

public class StringMultipler2{
   public static void main(String[] var0) {
   
      String s1 = "a2d1r1";
      String s2= "qwed6r5";

      System.out.println(check(s1));
      System.out.println(check(s2));
   }
   public static String check(String s)
   {
      StringBuilder sb = new StringBuilder();

      for(int i=0;i<s.length()-1;i++)
      {
         char c = s.charAt(i);

         if(Character.isDigit(s.charAt(i+1)))
         {
            int count = s.charAt(i+1)-'0';
            for(int j =0 ; j < count ; j++)
               sb.append(c);
         }
      }
      return sb.toString();
   }
}
