import java.util.*;
class MaxDistinctSubarray
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
        int maxLength=0;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> set=new HashSet<>();
            for(int j=i;j<n;j++)
            {
                if(set.contains(arr[j]))
                {
                    break;
                }
                set.add(arr[j]);
                if(set.size()>maxLength)
                {
                    maxLength=set.size();
                }
            }
        }
        System.out.println(maxLength);
    }
}