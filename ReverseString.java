import java.util.*;
class ReverseString
{
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     String s=sc.next();
    //     String ans="";
    //     for(int i=s.length()-1;i>=0;i--)
    //     {
    //         ans+=s.charAt(i);
    //     }
    //     System.out.println(ans);
    // }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}