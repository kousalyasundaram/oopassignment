import java.util.Scanner;
public class EmpTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
Empsal e1=new Empsal();
Empsal e2=new Empsal();
Scanner input=new Scanner(System.in);
System.out.println("enter name and salary details of  employee 1");
String f=input.next();
String l=input.next();
double m=input.nextDouble();
e1.setDetails(f, l, m);
System.out.println("enter name and salary details of employee 2");
String f1=input.next();
String l1=input.next();
double m1=input.nextDouble();
e2.setDetails(f1,l1,m1);
System.out.println("the first name of employee 1 is  " + e1.getFirstNmae());
System.out.println("the last name of employee 1 is " + e1.getLastName());
System.out.println("the monthly salary of employee 1 is" +e1.getMonthlySalary());
System.out.println("the first name of employee 2 is  " + e2.getFirstNmae());
System.out.println("the last name of employee 2 is " + e2.getLastName());
System.out.println("the monthly salary of employee 2 is" +e2.getMonthlySalary());
System.out.println("the yearly salary of employee 1 is" +e1.calcyearlysalary());
System.out.println("the yearly salary of employee 2 is" +e2.calcyearlysalary());
System.out.println("yearly salary of employee 1 with bonus is" + e1.bonusYearlySalary());
System.out.println("yearly salary of employee 2 with bonus is" +e2.bonusYearlySalary());

	}

}
