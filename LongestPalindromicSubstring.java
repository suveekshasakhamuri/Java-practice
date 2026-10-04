import java.util.*;
class LongestPalindromicSubstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        int maxLength=0;
        String res="";
        for(int i=0;i<s.length();i++)
        {
            int left=i;
            int right=i;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }
            int olength=right-left-1;
            if(olength>maxLength)
            {
                maxLength=olength;
                res=s.substring(left+1,right);
            }
            left=i;
            right=i+1;
            while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
            {
                left--;
                right++;
            }
            int elength=right-left-1;
            if(elength>maxLength)
            {
                maxLength=elength;
                res=s.substring(left+1,right);
            }
        }
        System.out.println(res);
    }
}