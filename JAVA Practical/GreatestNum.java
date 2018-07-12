/*
Prog : Find Greatest of Three Number Program
Date : 05/7/18
Dev : Bhavya
*/

class GreatestNum
{
	public static void main(String arg[])
	{
		int num1=100;
		int num2=210;
		int num3=129;
		if(num1>num2 && num1>num3)
		{
			System.out.println("The Greatest Number is : "+num1);
		}	
		else if(num2>num3)
		{
			System.out.println("The Greatest Number is : "+num2);
		}
		else
		{
			System.out.println("The Greatest Number is : "+num3);
		}
	}
}