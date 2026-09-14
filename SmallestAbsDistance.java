import java.util.*;
class SmallestAbsDistance
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
        int target=sc.nextInt();
        int minele=arr[0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int currmin=Math.abs(target-arr[i]);
            if(currmin<=min)
            {
                min=currmin;
                minele=arr[i];
            }
        }
        System.out.println(minele);
    }
}