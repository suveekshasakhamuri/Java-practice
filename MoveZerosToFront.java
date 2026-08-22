import java.util.*;
class MoveZerosToFront{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index=n-1;
        int i=n-1;
        while(i>=0)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index--;
            }
            i--;
        }
        while(index>=0)
        {
            arr[index]=0;
            index--;
        }
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+" ");
    }
}