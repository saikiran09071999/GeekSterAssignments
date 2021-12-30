import java.util.*;
public class StudClassification29Dec{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter gender");
		String gender=sc.next();
		System.out.println("enter marks:");
		int marks=sc.nextInt();
		if(gender.equals("male")) {
		  if(marks>=75)
			  System.out.println("Intelligent boy");
		  else if(marks>=35 && marks<75)
			  System.out.println("Average boy");
		  else
			  System.out.println("Dull boy");
		}
		else if(gender.equals("female")) {
			if(marks>=75)
				  System.out.println("Intelligent girl");
			  else if(marks>=35 && marks<75)
				  System.out.println("Average girl");
			  else
				  System.out.println("Dull girl");
		}
	}
}
