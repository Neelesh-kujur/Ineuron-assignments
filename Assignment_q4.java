public class Assignment_q4 {

    public static void main(String[] args) {
        int n=8;
        int k=n*2-2;
        for (int i=0;i<n;i++ )
        {
            for(int j=0;j<k;j++)
            {
                if( j==0 || i==n-1 || j==k-1 || i-j>=0 || i+j>=k-1 )
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
