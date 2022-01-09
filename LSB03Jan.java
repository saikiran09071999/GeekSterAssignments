import java.util.*;
class LSB03Jan{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int lsb=1;
     while(n>0)
     {
       if((n&1)==1){
         break;
       }
       n>>=1;
       lsb<<=1;
     }
   System.out.println(lsb);
  }
}