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
class LinkedListSearch
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
        int target=sc.nextInt();
        Node current=head;
        while(current!=null)
        {
            if(current.data==target)
            {
                System.out.println("Found");
                return;
            }
            current=current.next;
        }
        System.out.println("Not found");
    }
}