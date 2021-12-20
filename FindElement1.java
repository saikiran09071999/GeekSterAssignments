import java.util.*;
class FindElement1{
 public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
   Arrays.sort(a);
    int key=sc.nextInt();
   int l=0;
   int h=n-1;
   
   if(checkElement(a,key,l,h)){
    System.out.println("element found");  
   }
   else{
     System.out.println("element not found");
   }
  }
 public static boolean checkElement(int a[],int key,int l,int h){
   int mid=(l+h)/2; 
  if(l>h)
    return false;
   else if(a[mid]==key)
     return true;
   else if(key<a[mid])
    return checkElement(a,key,l,mid-1);
   else
    return checkElement(a,key,mid+1,h);
 }
}