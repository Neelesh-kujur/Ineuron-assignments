package Assignment_3;

import java.util.Scanner;

public class a3q7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int vowel=0;
        int cons=0;

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u' || ch=='O' || ch=='A' || ch=='E' || ch=='I' || ch=='U')
                vowel++;

            else
                cons++;
        }

        System.out.println("Vowels="+vowel);
        System.out.println("Consonant="+cons);
    }
}
