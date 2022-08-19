package Assignment_3;
import java.util.*;
public class a3q4 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s=str.toLowerCase();
        HashMap<Character,Integer> hm=new HashMap<>();
        int count=0;

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
            if(hm.get(key)>=1)
                count++;

            else
                break;
        }

        if(count==26)
            System.out.println("Its a panagram");

        else
            System.out.println("Not a panagram");
    }
}
