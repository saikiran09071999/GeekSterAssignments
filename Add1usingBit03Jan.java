import java.util.*;
class Add1usingBit03Jan{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp=1;
    while((n&temp)>=1){
     n=n^temp;
     temp=temp<<1;
   }
  System.out.println(n^temp);
  }
}