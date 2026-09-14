import java.util.*;
class SumNumbersInString
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum=0;
        int number=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                int num=ch-'0';
                number=number*10+num;
            }
            else{
                sum+=number;
                number=0;
            }
        }
        sum+=number;
        System.out.println(sum);
    }
}