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
class LinkedListRemoveDuplicates
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
        // If sorted...
        // Node current = head;
        // while(current != null && current.next != null)
        // {
        //     if(current.data == current.next.data)
        //     {
        //         current.next = current.next.next;
        //     }
        //     else
        //     {
        //         current = current.next;
        //     }
        // }
        // if unsorted.....
        HashSet<Integer>set=new HashSet<>();
        Node current = head;
        Node prev = null;
        while(current != null)
        {
            if(set.contains(current.data))
            {
                prev.next = current.next;
            }
            else
            {
                set.add(current.data);
                prev = current;
            }

            current = current.next;
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