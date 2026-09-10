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
class LinkedListBasics
{
    public static void main(String args[])
    {
        // Uisng LinkedList Collection.....
        // LinkedList<Integer>list=new LinkedList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // System.out.println(list);
        // list.addFirst(40);
        // list.addLast(50);
        // System.out.println(list);
        // System.out.println(list.get(0));
        // list.remove(0);
        // System.out.println(list);
        // list.removeFirst();
        // System.out.println(list);
        // list.removeLast();
        // System.out.println(list);
        // System.out.println(list.size());
        // System.out.println(list.contains(20));
        // Using Node...
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node head=new Node(sc.nextInt());
        Node curr=head;
        for(int i=1;i<n;i++)
        {
            curr.next=new Node(sc.nextInt());
            curr=curr.next;
        }
        
        Node current=head;
        int count=0;
        while(current!=null)
        {
            // System.out.print(current.data+" -> ");
            count++;
            current=current.next;
        }
        // System.out.print("null");
        System.out.println(count);
    }
}