import java.util.*;
class FindElementLastPosition{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
    int key=sc.nextInt();
    int flag=0,pos=0;
    for(int i=0;i<n;i++)
    {
      if(a[i]==key)
      {
        pos=i;
        flag=1;
      }
    }
  if(flag==1)
   System.out.println("element found at position "+pos);
  else
    System.out.println("element not found");
  }
}