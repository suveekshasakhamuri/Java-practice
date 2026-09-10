import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class LinkedListCycle
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
        int pos = sc.nextInt();
        if(pos != -1)
        {
            Node target = head;
            for(int i = 0; i < pos; i++)
            {
                target = target.next;
            }
            curr.next = target;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                System.out.println("Cycle found");
                return;
            }
        }
        System.out.println("No cycle");
    }
}