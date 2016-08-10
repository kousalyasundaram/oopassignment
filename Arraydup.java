
import java.util.Scanner;
public class Arraydup{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k,l;
		int j=0;
		int flag;
		System.out.println("enter n");
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int []a=new int[n];
		System.out.println("enter the array elements");
		for(i=0;i<n;i++)
		{	flag=0;
			System.out.println("enter elements");
			int c=input.nextInt();
			if(i==0)
			{
				a[j]=c;
				j++;
			}
			else
			{
				for(k=0;k<i;k++)
				{
					if(c==a[k])
					{
						flag=-1;
						break;			
					}
				}
				if(flag==0)
				{
					a[j]=c;
					j++;
				}
				
			}
			System.out.println("the elements are");
			for(l=0;l<j;l++)
			{
	System.out.println(a[l]);
			}
		}
	}
}

