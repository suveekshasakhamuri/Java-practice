import java.util.ArrayList;
import java.util.*;
class ArrayListBasics{
    public static void main(String args[])
    {
        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(50);
        // System.out.println(list);
        // System.out.println(list.get(0));
        // System.out.println(list.get(3));
        // System.out.println(list.size());
        // for(int i=0;i<list.size();i++)
        // {
        //     System.out.print(list.get(i)+" ");
        // }

        // ArrayList<Integer> list=new ArrayList<>();
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++)
        // {
        //     list.add(sc.nextInt());
        // }
        // System.out.println(list);
        // System.out.println(list.size());
        // list.set(3,100);
        // System.out.println(list);


        ArrayList<String> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(sc.next());
        }
        System.out.println(list);
        list.set(1,"ChatGPT");
        list.remove(3);
        System.out.println(list);
    }
}