import java.util.*;
class ConsecutiveNumCheck28Dec{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
    for(int i=0;i<n;i++)
       a[i]=sc.nextInt();
    int flag=0;
    for(int i=0;i<n-1;i++)
    {
     if(a[i]==a[i+1])
     {
       flag=1;
       break;
     }
    } 
    if(flag==1)
   System.out.println("True");
   else
     System.out.println("False");
 }
}