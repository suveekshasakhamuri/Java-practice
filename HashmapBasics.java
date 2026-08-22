import java.util.*;
class HashmapBasics
{
    public static void main(String args[])
    {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',12);
        map.put('b',45);
        map.put('c',23);
        System.out.println(map);
        map.put('a',56);  //overwrites the value
        System.out.println(map);
        System.out.println(map.get('c'));
        System.out.println(map.getOrDefault('d',0));
        System.out.println(map.containsKey('a'));
    }
}