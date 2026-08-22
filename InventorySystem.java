import java.util.*;
class Product
{
    String prodCode;
    String prodName;
    double price;
    public Product(String prodCode,String prodName,double price)
    {
        this.prodCode=prodCode;
        this.prodName=prodName;
        this.price=price;
    }
     public String toString()
    {
        return prodCode + " " + prodName + " " + price;
    }
}
class InventorySystem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,ArrayList<Product>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String category=sc.next();
            int m=sc.nextInt();
            for(int j=0;j<m;j++)
            {
                String prodCode=sc.next();
                String prodName=sc.next();
                double price=sc.nextDouble();
                Product p=new Product(prodCode,prodName,price);
                map.putIfAbsent(category,new ArrayList<Product>());
                map.get(category).add(p);
            }
           
        }

        String cat=sc.next();
        ArrayList<Product> list=map.get(cat);
        System.out.print(cat+" "+list);
        int count=list.size();
        System.out.println(count);
        double max=list.get(0).price;
        String maxProd=list.get(0).prodName;
        for(Product prod:list)
        {
            if(prod.price>max)
            {
                max=prod.price;
                maxProd=prod.prodName;
            }
        }
        System.out.println(maxProd);
    }
}