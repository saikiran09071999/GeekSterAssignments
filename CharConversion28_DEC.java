import java.util.*;
class CharConversion28_DEC{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   char ch=sc.next().charAt(0);
   if(ch>='a' && ch<='z')
     System.out.println((char) (ch-'a'+'A')); 
   else if(ch>='A' && ch<='Z')
    System.out.println((char) (ch-'A'+'a'));
   else
    System.out.println("invalid input enetr alphabets small or capitals"); 
 }
}