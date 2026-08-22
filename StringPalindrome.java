import java.util.*;
class StringPalindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i,j;
        for(i=0,j=s.length()-1;i<=j;i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                break;
            }
        }
        if(i>=j)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");

    }
}