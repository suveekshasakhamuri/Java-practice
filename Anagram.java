import java.util.*;
class Anagram
{
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     String s1=sc.next();
    //     String s2=sc.next();
        //    s1=s1.toLowerCase();
        //    s2=s2.toLowerCase();
    //     int count1[]=new int[26];
    //     int count2[]=new int[26];
    //     int n1=s1.length();
    //     int n2=s2.length();
    //     if(n1!=n2)
    //     {
    //         System.out.println("Not anagrams!");
    //         return;
    //     }
    //     
    //         for(int i=0;i<n1;i++)
    //         {
    //             count1[s1.charAt(i)-'a']++;
    //             count2[s2.charAt(i)-'a']++;
    //         }
    //         if(Arrays.equals(count1,count2))
    //         {
    //             System.out.println("Anagrams");   
    //         }
    //         else
    //             System.out.println("Not anagrams");
    //     
    // }
    // public static boolean isAllZeros(int count[])
    // {
    //     for(int i=0;i<count.length;i++)
    //     {
    //         if(count[i]!=0)
    //             return false;
    //     }
    //     return true;
    // }
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     String s1=sc.next();
    //     String s2=sc.next();
    //     s1=s1.toLowerCase();
    //     s2=s2.toLowerCase();
    //     int count[]=new int[26];
    //     int n1=s1.length();
    //     int n2=s2.length();
    //     if(n1!=n2)
    //     {
    //         System.out.println("Not anagrams!");
    //         return;
    //     }
    //     else
    //     {
    //         for(int i=0;i<n1;i++)
    //         {
    //             count[s1.charAt(i)-'a']++;
    //             count[s2.charAt(i)-'a']--;
    //         }
    //         if(isAllZeros(count))
    //         {
    //             System.out.println("Anagrams");   
    //         }
    //         else
    //             System.out.println("Not anagrams");
    //     }
    // }
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     String s1=sc.next();
    //     String s2=sc.next();
    //     if(s1.length()!=s2.length())
    //     {
    //         System.out.println("Not anagrams");return;
    //     }
    //     char arr1[]=s1.toCharArray();
    //     char arr2[]=s2.toCharArray();
    //     Arrays.sort(arr1);
    //     Arrays.sort(arr2);
    //     if(Arrays.equals(arr1,arr2))
    //     {
    //         System.out.println("Anagrams");
    //     }
    //     else
    //         System.out.println("Not anagrams");
    // }
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     String s1=sc.next();
    //     String s2=sc.next();
    //     s1=s1.toLowerCase();
    //     s2=s2.toLowerCase();
    //     int n1=s1.length();
    //     int n2=s2.length();
    //     if(n1!=n2)
    //     {
    //         System.out.println("Not anagrams!");
    //         return;
    //     }
    //     HashMap<Character,Integer> map1=new HashMap<>();
    //     HashMap<Character,Integer> map2=new HashMap<>();
    //     for(int i=0;i<n1;i++)
    //     {
    //         char ch1=s1.charAt(i);
    //         char ch2=s2.charAt(i);
    //         map1.put(ch1,map1.getOrDefault(ch1,0)+1);
    //         map2.put(ch2,map2.getOrDefault(ch2,0)+1);
    //     }
    //     if(map1.equals(map2))
    //     {
    //         System.out.println("Anagrams");
    //     }
    //     else
    //         System.out.println("Not anagrams");
    // }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2)
        {
            System.out.println("Not Anagrams");
            return;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n1;i++)
        {
            char ch=s1.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<n2;i++)
        {
            char ch=s2.charAt(i);
            if(!map.containsKey(ch))
            {
                System.out.println("Not anagrams");return;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            if(map.get(ch)==0)
             map.remove(ch);
        }
        if(map.isEmpty())
          System.out.println("Anagrams");
        else
          System.out.println("Not anagrams");
        
    }
}