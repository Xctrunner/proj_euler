import java.math.BigInteger;

public class Euler29
{
   static String[] string=new String[10000];
   static int counter=0;
   
   public static void main(String Arg[])
   {
      for (int a=2; a<=100; a++)
         for (int b=2; b<=100; b++) {
        	 BigInteger temp = new BigInteger(new Integer(a).toString()).pow(b);
             add(temp.toString());
         }
      System.out.println(counter);
   }
   
   private static void add(String s)
   {
      for (int i=0; i<counter; i++)
         if (s.equals(string[i])) return;
      string[counter++]=s;
   }
}
