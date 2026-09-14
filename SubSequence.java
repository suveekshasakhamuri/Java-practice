import java.util.*;
class SubSequence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int sequence[]=new int[m];
        for(int i=0;i<m;i++)
        {
            sequence[i]=sc.nextInt();
        }
        
        int i=0,j=0;
        while(i<n && j<m)
        {
            if(arr[i]==sequence[j])
            {
                j++;
            }
            i++;
        }
        if(j==m)
        {
            System.out.println("True");
        }
        else
         System.out.println("False");
    }
}