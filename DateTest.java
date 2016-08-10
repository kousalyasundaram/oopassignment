import java.util.Scanner;
public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Datedisp d=new Datedisp();
Scanner input=new Scanner(System.in);
System.out.println("enter month, day and year");
int mon=input.nextInt();
int dat=input.nextInt();
int yr=input.nextInt();
d.setDetails(mon, dat,yr );
System.out.println("the given month is" + d.getMonth());
System.out.println("the given day is" + d.getDay());
System.out.println("the given year is" + d.getYear());
d.displayDate();
	}

}






