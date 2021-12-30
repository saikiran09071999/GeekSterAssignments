import java.util.*;
class ShopDisCount29Dec{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter quantity:");
   int qty=sc.nextInt();
  int price=qty*100;
   if(price>1000)
     System.out.println(price-(10*price/100));
   else
    System.out.println(price);
  }
}