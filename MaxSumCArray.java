import java.util.*;
class MaxSumCArray
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
        // int maxSum=Integer.MIN_VALUE;
        // for(int i=0;i<n;i++)
        // {
        //     int sum=0;
        //     for(int j=i;j<n;j++)
        //     {
        //         sum+=arr[j];
        //         if(sum>maxSum)
        //         {
        //             maxSum=sum;
        //         }
        //     }
        // }
        // System.out.println(maxSum);
        int currentSum=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<n;i++)
        {
            currentSum=Math.max(arr[i],currentSum+arr[i]);
            if(currentSum>maxSum)
                maxSum=currentSum;
        }
        System.out.println(maxSum);
    }
}