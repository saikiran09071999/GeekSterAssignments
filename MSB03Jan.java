import java.util.*;
class MSB03Jan{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int msb=1;
     while(n>0)
     {
       n>>=1;
       msb<<=1;
     }
   System.out.println(msb>>1);
  }
}