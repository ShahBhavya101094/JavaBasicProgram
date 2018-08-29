/*
	Prog: Interface Example
	Date :29 Aug 2018 
	Developed by : Rushali Patel
			       Krishna Patel
*/
interface Car //interface created 
{
void type(); // abstract method Created
}
interface BMW extends Car //interface created 
{
void model(); // abstract method Created
}
class CarClass implements BMW
{
	int id=100;
	String type="manual";
	String name="X4";
	int speed=250;
	public void type() // Override Method type
	{
	System.out.println("id:"+id);
	System.out.println("type:"+type);
	}
	public void model() // Override Method model
	{
	System.out.println("name:"+name);
	System.out.println("speed:"+speed);
	}
}
public class Classmain // main class
{
	public static void main(String args[])
	{
		CarClass c;//reference created
		c=new CarClass(); //Assign Memory to Reference
		c.type(); // Call override method
		c.model();// Call override method
	}
}
 	
		
