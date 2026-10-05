import java.util.*;
class LongestSubstringWithoutDuplicates
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int left=0;
        int right=0;
        HashSet<Character> set=new HashSet<>();
        int maxLength=0;
        String res=new String();
        while(right<s.length())
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            right++;
            int length=right-left;
            if(length>maxLength)
            {
                maxLength=length;
                res=s.substring(left,right);
            }
        }
        System.out.println(res);
    }   
}