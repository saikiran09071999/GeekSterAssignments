class ReverseArray{
 public static void main(String arsgs[]){
   int a[]={8,4,5,6,3,2,9,1};
   System.out.println("elements before reversing:");
   for(int i=0;i<a.length;i++)
    System.out.print(a[i]+" ");
   System.out.println("elements after reversing:");
    for(int i=a.length-1;i>=0;i--)
    System.out.print(a[i]+" ");
 }
}