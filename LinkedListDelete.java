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
class LinkedListDelete
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
        // Delete at beginning...
        // Node current=head;
        // head=current.next;
        // current.next=null;
        // Node temp=head;
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" -> ");
        //     temp=temp.next;
        // }
        // System.out.print("null");
        // Delete at end...
        // Node current=head;
        // Node t=current.next;
        // while(t.next!=null)
        // {
        //     t=t.next;
        //     current=current.next;
        // }
        // current.next=null;
        // Node temp=head;
        // while(temp!=null)
        // {
        //     System.out.print(temp.data+" -> ");
        //     temp=temp.next;
        // }
        // System.out.print("null");
        // Delet at asked position
        Node current=head;
        int pos=sc.nextInt();
        if(pos==0)
        {
            head=current.next;
            current.next=null;
        }
        else
        {
            Node t=current.next;
            int i=0;
            while(i<pos-1)
            {
                t=t.next;
                current=current.next;
                i++;
            }
            current.next=t.next;
            t.next=null;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
}