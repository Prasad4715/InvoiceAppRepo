import java.util.*;

public class Flight
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int flightChoice =-1;

		while(flightChoice<=0)
		{
			System.out.println("Enter a Flight Number : ");
			 int c= sc.nextInt();

			if(c>=0)
			{
				System.out.println("valid Choice");
				break;
			}
			else
			{
			System.out.println("InValid Choice");
			}
		}

	}
}