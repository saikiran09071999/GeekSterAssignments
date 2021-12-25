import java.util.*;
class TripletSumArray{
 public static void main(String args[]){
  int a[]=new int[10];
  Scanner sc=new Scanner(System.in);
  for(int i=0;i<10;i++)
   a[i]=sc.nextInt();
  int target=sc.nextInt();
  Arrays.sort(a);
  int temp1,temp2;
  for(int i=0;i<10;i++)
  {
    if(a[i]>=target)
     break;
    temp1=target-a[i];
   for(int j=i+1;j<10;j++)
    {
      if(a[j]>temp1)
        break;
      temp2=temp1-a[j];
      for(int k=j+1;k<10;k++)
      {
        if(a[k]>temp2)
         break;
         if(a[k]==temp2)
          {
            System.out.println(a[i]+" "+a[j]+" "+a[k]);
            System.out.println("there indexes are: "+i+" "+j+" "+k);
          }
      }
    }
  }
 }
}