import java.util.*;
class CheckAscOrder{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int i;
        for(i=1;i<n;i++)
        {
            if(arr[i]<arr[i-1]){
                System.out.println("No");
                break;
            }  
        }
        if(i==n)
            System.out.println("Yes");
    }
}