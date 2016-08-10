import java.util.Arrays;
import java.util.Scanner;
public class Salescom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		int i,k,j;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of persons");
		int n=input.nextInt();
		double []gross=new double[n];
		int []counter=new int[9];
		Arrays.fill(counter, 0);
		System.out.println("enter the gross pay for the sales employees");
		for(i=0;i<n;i++)
		{
			System.out.println("enter the gross pay");
			gross[i]=input.nextDouble();
		}
		for(i=0;i<n;i++)
		{
			gross[i]=200+(0.09*gross[i]);
		}
		System.out.println("the gross pay of the employees are");
		for(i=0;i<n;i++)
		{
			
			j=i+1;
			System.out.println("employee" +j);
			
			System.out.println(gross[i]);
		}
		for(i=0;i<n;i++)
		{
			if(gross[i]>=200&&gross[i]<=299)
			{
				k=0;
				counter[k]++;
				
			}
			else if(gross[i]>=300&&gross[i]<=399)
			{
				k=1;
				counter[k]++;
				
			}

			else if(gross[i]>=400&&gross[i]<=499)
			{
				k=2;
				counter[k]++;
				
			}

			else if(gross[i]>=500&&gross[i]<=599)
			{
				k=3;
				counter[k]++;
				
			}
			else if(gross[i]>=600&&gross[i]<=699)
			{
				k=4;
				counter[k]++;
				
			}
			else if(gross[i]>=700&&gross[i]<=799)
			{
				k=5;
				counter[k]++;
				
			}
		
		else if(gross[i]>=800&&gross[i]<=899)
		{
			k=6;
			counter[k]++;
			
		}
		else if(gross[i]>=900&&gross[i]<=999)
		{
			k=7;
			counter[k]++;
			
		}
		else
		{
			k=8;
			counter[k]++;
			
		}
		
			
			}
		System.out.println("number of employees whose pay is between$200-$299 is"+counter[0]);
		System.out.println("number of employees whose pay is between$300-$399 is"+counter[1]);
		System.out.println("number of employees whose pay is between$400-$499 is"+counter[2]);
		System.out.println("number of employees whose pay is between$500-$599 is"+counter[3]);
		System.out.println("number of employees whose pay is between$600-$699 is"+counter[4]);
		System.out.println("number of employees whose pay is between$700-$799 is"+counter[5]);
		System.out.println("number of employees whose pay is between$800-$899 is"+counter[6]);
		System.out.println("number of employees whose pay is between$900-$999 is"+counter[7]);

	}
}
