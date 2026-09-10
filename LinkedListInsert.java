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
class LinkedListInsert
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
        Node ele=new Node(sc.nextInt());
        // Insert at beginning...
        // ele.next=head;
        // head=ele;
        // Insert at end....
        //  Node current=head;

        // while(current.next!=null)
        // {
        //     current=current.next;
        // }
        // current.next=ele;
        //Insert at asked position
        int pos=sc.nextInt();
        int i=0;
        Node current=head;
        while(i<pos-1)
        {
            current=current.next;
            i++;
        }
        ele.next=current.next;
        current.next=ele;
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
}