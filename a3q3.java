package Assignment_3;
import java.util.*;
public class a3q3 {

     public static void main(String[] args)
     {
          Scanner sc=new Scanner(System.in);
          String s1=sc.nextLine();
          String s2=sc.nextLine();

          s1.toLowerCase();
          s2.toLowerCase();

          char[] c1=s1.toCharArray();
          char[] c2=s2.toCharArray();

          Arrays.sort(c1);
          Arrays.sort(c2);
          boolean ans=Arrays.equals(c1,c2);
          if(ans)
               System.out.println("They are Anagrams");

          else
              System.out.println("They are not Anagrams");
     }
}
