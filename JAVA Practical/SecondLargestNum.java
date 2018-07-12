/*
Prog : Find Second Largest of Three Number Program
Date : 05/7/18
Dev : Bhavya
*/

class SecondLargestNum
{
	public static void main(String arg[])
	{
		int num1=100;
		int num2=210;
		int num3=129;
		if(num1>num2 )
		{
			if(num1<num3)
			{
				System.out.println("The Second Largest Number is : "+num1);
			}
			else
			{
				System.out.println("The Second Largest Number is : "+num3);
			}
		}
		else 
		{
			if(num2<num3)
			{
				System.out.println("The Second Largest Number is : "+num2);
			}
			else
			{
				System.out.println("The Second Largest Number is : "+num3);
			}
		}
	}
}