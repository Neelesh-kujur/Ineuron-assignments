package Assignment_3;

import java.util.Scanner;

public class a3q8 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if((ch>=32 && ch<=47) || (ch>=58 && ch<=65) || (ch>=91 && ch<=96) || (ch>=123 && ch<=126))
                  count++;
        }
        System.out.println("No of special characters ="+count);
    }
}
