import java.util.*;
class MinutesToYears28_DEC{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   long min=sc.nextLong();
    int years=(int) min/(365*24*60);
    int days=(int) min/(24*60);
    System.out.println("Years: "+years);
   System.out.println("Days: "+days);
 }
}