import java.util.*;
class NonRepeating1st
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        boolean found=false;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.get(ch)==1){
                System.out.println(ch);
                found = true;
                break;
            }
        }
        if(found==false)
          System.out.println("No non repeating characters");
    }
    
}