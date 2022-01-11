import java.util.*;
class Alphacount7Jan{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int n=str.length();
    int count=0;
    for(int i=0;i<n;i++)
    {
      if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))
       count++;
    } 
   System.out.println(count);
 }
}