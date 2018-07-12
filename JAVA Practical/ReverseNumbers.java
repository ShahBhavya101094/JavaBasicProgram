/*
Prog : Find Reverse Number of Given Number
Date : 05/7/18
Dev : Bhavya
*/

class ReverseNumbers
{
	public static void main(String arg[])
	{
		int num=1932;
		int rev=0;

		System.out.println("Original Number is : "+num);
		while(num>0)
		{
			int d=num%10;
			num=(num-d)/10;
			rev=(rev*10)+d;
		}
		System.out.println("Reverse Number is : "+rev);
	}
}