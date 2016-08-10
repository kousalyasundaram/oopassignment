
public class Datedisp {
private int month;
private int day;
private int year;
public
	Datedisp()
	{month=0;
	day=0;
	year=0;
	}
void setDetails(int mon,int dat,int yr)
{
	month=mon;
	day=dat;
	year=yr;
}
int getMonth()
{
	return month;
}
int getDay()
{
	return day;
}
int getYear()
{
	return year;
}
void displayDate()
{
	System.out.println("the date is ");
	System.out.print(month);
	System.out.print("/" +day);
	System.out.print("/" +year);
	
	
}
}
