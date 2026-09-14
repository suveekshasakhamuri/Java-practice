import java.util.*;
class MaxSumKConsecutive
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
        int k=sc.nextInt();
        int max=Integer.MIN_VALUE;
        // for(int i=0;i<=n-k;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<i+k;j++)
        //     {
        //         sum+=arr[j];
        //     }
        //     if(sum>max)
        //      max=sum;
        // }

        // Sliding window...
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<n;i++)
        {
            sum=sum-arr[i-k]+arr[i];
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.println(max);
    }
}