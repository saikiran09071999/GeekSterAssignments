import java.util.*;
class CountVowels7Jan{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   String str=sc.nextLine();
   str=str.toLowerCase();
   int n=str.length();
   int count=0;
   for(int i=0;i<n;i++)
   {
     if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
       count++; 
   }
  System.out.println(count);
 }
}