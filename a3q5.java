package Assignment_3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class a3q5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        String ans=" ";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(hm.containsKey(ch))
            {
                hm.put(ch,hm.get(ch)+1);
            }
            else
                hm.put(ch,1);
        }

        Set<Character> keys=hm.keySet();

        for(Character key:keys)
        {
            if(hm.get(key)>1)
                ans=ans + key;

        }
      System.out.println(ans);
    }
}
