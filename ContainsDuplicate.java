import java.util.*;
class ContainsDuplicate
{
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int arr[]=new int[n];
    //     HashSet<Integer>set=new HashSet<>();
    //     for(int i=0;i<n;i++)
    //     {
    //         arr[i]=sc.nextInt();
    //     }
    //     boolean duplicate=false;
    //     for(int i=0;i<n;i++)
    //     {
    //         if(set.contains(arr[i]))
    //         {
    //             duplicate=true;break;
    //         }
    //         else
    //         {
    //             set.add(arr[i]);
    //         }
    //     }
    //     if(duplicate)
    //         System.out.println("True");
    //     else
    //         System.out.println("False");
    // }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        if(arr.length==set.size())
            System.out.println("False");
        else
            System.out.println("True");
    }
}