import java.util.*;
class ArrayEvenOdd{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int epos=0,opos=1;
   int a[]=new int[8];
    int val=0;
   for(int i=0;i<8;i++){
     if(opos>=8 || epos>=8)
       break;
     val=sc.nextInt();
     if(val%2==0)
      {
        a[epos]=val;
        epos+=2;
      }
     else
      {
       a[opos]=val;
       opos+=2;
       }
    }
  System.out.println("array elements are:");
  for(int i=0;i<8;i++)
    System.out.print(a[i]+" ");
 }
}