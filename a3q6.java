package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class a3q6 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String ans="";

        for (int i = 0; i <ch.length ; i++) {
            ans=ans+ch[i];
        }
        System.out.println(ans);
    }
}
