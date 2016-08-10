

public class Empsal{
	private String firstName;
private String lastName;
private double monthlySalary;
private double yearlySalary;
	Empsal()
	{
		firstName=null;
		lastName=null;
		monthlySalary=0.0;
		yearlySalary=0.0;
		
	}
void setDetails(String fn,String ln,double ms)
{
	firstName=fn;
	lastName=ln;
	if(ms>=0)
		monthlySalary=ms;
}
		String getFirstNmae()
		{
			return firstName;
		}
String getLastName()
{
	return lastName;
}
double getMonthlySalary()
{
	return monthlySalary;
}
double calcyearlysalary()
{
	this.yearlySalary=this.monthlySalary*12;
	return yearlySalary;
}
double bonusYearlySalary()
{
	this.yearlySalary+=0.1*yearlySalary;
	return yearlySalary;
}
}






