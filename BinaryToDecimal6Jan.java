import java.util.*;
class BinaryToDecimal6Jan{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int result=0,i=0;
   while(n!=0)
   {
     int temp=n%10;
     result+=(temp*(int) Math.pow(2,i));
     n=n/10;
    i++; 
   }
  System.out.println(result);
 }
}