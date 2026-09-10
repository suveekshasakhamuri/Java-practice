import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedListMaximum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=new Node(sc.nextInt());
        Node curr=head;
        for(int i=1;i<n;i++)
        {
            curr.next=new Node(sc.nextInt());
            curr=curr.next;
        }
        int max=Integer.MIN_VALUE;
        Node current=head;
        while(current!=null)
        {
            if(current.data>max)
            {
                max=current.data;
            }
            current=current.next;
        }
        System.out.println(max);
    }
}