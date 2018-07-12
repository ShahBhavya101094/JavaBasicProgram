/*
Prog : Find N Prime Number Program
Date : 05/7/18
Dev : Bhavya
*/

class PrimeNumbers
{
	public static void main(String arg[])
	{
		int num=100;
		System.out.println("Prime Number between 1 to "+ num +"  is as following: " );
		for ( int no=1;no<=num;no++)
		{
			int flag=0;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(no+",");
			}
		}
	}
}