import java.util.*;
class ExtractingFirstTwoDigits{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int count,temp;
  while(n!=-1)
  {
   temp=n;
  count=0;
   while(n!=0){
    count++;
    n=n/10;
    } 
    if(count>1)
       System.out.println(temp/((int) (Math.pow(10,count))/100));
     else
       System.out.println(temp);
     n=sc.nextInt();
  }
 }
}