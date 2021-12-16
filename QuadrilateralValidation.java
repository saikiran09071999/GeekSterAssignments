import java.util.*;
class QuadrilateralValidation{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
    if((a+b+c+d)==360)
     System.out.println("valid quadrilateral");
    else
      System.out.println("not a quadrilateral");
  }
}