import java.util.*;
class ArrayPalin{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int a[]=new int[5];
   System.out.println("enter array elements:");
   for(int i=0;i<5;i++)
     a[i]=sc.nextInt();
  int flag=1;
   for(int i=0;i<2;i++)
   {
     if(a[i]==a[5-i-1])
      continue;
     else{
       flag=0;
       break;
    }   
   }
   if(flag==1)
    System.out.println("YES");
   else
    System.out.println("NO");
  } 
}