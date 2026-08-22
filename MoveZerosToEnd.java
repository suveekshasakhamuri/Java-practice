import java.util.*;
class MoveZerosToEnd{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int index=0;
        int i=0;
        while(i<n)
        {
            if(arr[i]!=0)
            {
                arr[index]=arr[i];
                index++;
            }
            i++;
        }
        while(index<n)
        {
            arr[index]=0;
            index++;
        }
        for(int j=0;j<n;j++)
            System.out.print(arr[j]+" ");
    }
}