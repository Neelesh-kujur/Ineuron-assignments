package Assignment_3;

public class a3q2 {
    public static void main(String[] args)
    {
        String k="Think Twice";
        String s=k.toLowerCase();

        String[] arr=s.split(" ");
        String[] ans=new String[arr.length];
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<arr.length;i++)
        {
            sb.append(arr[i]);
            sb.reverse();
            ans[i]=sb.toString();
            sb.setLength(0);
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
