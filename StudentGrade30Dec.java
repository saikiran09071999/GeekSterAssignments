import java.util.*;
class StudentGrade30Dec{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
   System.out.println("enter gender:");
   char gender=sc.next().charAt(0);
   System.out.println("enter marks:");
  int marks=sc.nextInt();
  String result=(gender=='m')?(marks>=75)?"Intelligent Boy" : (marks>=35)? "Average Boy" : "Dull Boy" : (marks>=75)? "Intelligent Girl" : (marks>=35)?  "Average Girl" :  "Dull Girl";
  System.out.println(result);
 }
}