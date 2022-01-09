import java.util.*;
class SetkthBit03Jan{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int temp=1;
   for(int i=1;i<k;i++){
     temp=temp<<1;
   }
   System.out.println(n|temp);
  }
}