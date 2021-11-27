import java.util.*;
class NoOfDigits{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    int mul=1;
    int tmp=n;
    while(tmp!=0)
    {
     count++;
     mul=mul*10;
     tmp=tmp/10; 
    }
   System.out.println(count);
  }
}