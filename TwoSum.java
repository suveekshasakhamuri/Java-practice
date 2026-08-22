import java.util.*;
class TwoSum
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
    //     int target=sc.nextInt();
    //     boolean found=false;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(arr[i]+arr[j]==target)
    //             {
    //                 found=true;
    //                 System.out.println(i+" "+j);return;
    //             }
    //         }
    //     }
    //     if(!found)
    //         System.out.println("-1 -1");
    // }
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i]=sc.nextInt();
    //     }
    //     int target=sc.nextInt();
    //     int i=0,j=n-1;
    //     while(i < j)
    //     {
    //         if(arr[i] + arr[j] == target)
    //         {
    //             System.out.println(i + " " + j);
    //             return;
    //         }
    //         else if(arr[i] + arr[j] < target)
    //             i++;
    //         else
    //             j--;
    //     }   
    // }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-arr[i]))
            {
                System.out.println(map.get(target-arr[i])+" "+i);break;
            }
            else{
                map.put(arr[i],i);
            }
        }

    }
}