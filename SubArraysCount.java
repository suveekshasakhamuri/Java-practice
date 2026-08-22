import java.util.*;
class SubArraysCount
{
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i]=sc.nextInt();
    //     }
    //     int k=sc.nextInt();
    //     int count=0;
    //     for(int i=0;i<n;i++)
    //     {
    //         int sum=0;
    //         for(int j=i;j<n;j++)
    //         {
    //             sum+=arr[j];
    //             if(sum==k)
    //             {
    //                 count++;
    //             }
    //         }
    //     }
    //     System.out.println(count);
    // }
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
        int count=0;
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
  
         map.put(0,1);
        for(int i=0;i<n;i++)
        {
                sum+=arr[i];
              
                if(map.containsKey(sum-k))
                {
                    count+=map.get(sum-k);
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
            
        }
        System.out.println(count);
    }
}