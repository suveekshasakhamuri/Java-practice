import java.util.*;
class HashSetBasics
{
    public static void main(String args[])
    {
      
        HashSet<Integer>set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        System.out.println(set);
        System.out.println(set.size());  
        System.out.println(set.contains(10)+" "+set.contains(77));
        set.remove(20);
        System.out.println(set.size()+"  "+set);
        System.out.println(set.isEmpty());
        System.out.println(set[2]);
    }
}