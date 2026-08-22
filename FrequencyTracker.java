import java.util.*;
class FrequencyTracker{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        String arr[]=sentence.split(" ");
        HashMap<String,Integer> map=new HashMap<>();
       // LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            String s=arr[i];
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}