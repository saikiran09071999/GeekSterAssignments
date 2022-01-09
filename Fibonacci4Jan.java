import java.util.*;
class Fibonacci4Jan{
  public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int prev=0;
  int prev1=1;
  int temp=0;
  if(n==0)
   System.out.println(prev);
  else if(n==1)
   System.out.println(prev1);
  else
   {
    System.out.print(prev+" "+prev1);
    for(int i=2;i<n;i++){
     System.out.print(" "+(prev+prev1));
      temp=prev1;
      prev1=prev+prev1;
      prev=temp; 
    }
   }
 }
}