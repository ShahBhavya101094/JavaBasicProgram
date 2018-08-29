/*
Program: Extending and implementing example of interface program by fruit example. 
Date: 29/08/2018
Dev: DAM 
*/
interface fruit
{
		void type();//member 
}
interface apple extends fruit// apple interfaces fruit 
{
		void test();//member
}
class fruitClass implements apple // apple implementing fruitclass
{
		int id=100;//id
		String type="jun-feb";//type
		String name="apple";//name
		String test="sweet";//test
		public void type()
		{
			System.out.println("id="+id);//print the  id
			System.out.println("type="+type);//print the type
		}
		public void test()
		{
			System.out.println("name="+name);//print name
			System.out.println("test="+test);//print test
		}
}
public class mainclass1 //main class
{//start of mainclass
		public static void main(String args[])
		{
			fruitClass F;//objects of fruit class
			F=new fruitClass();//fruit class object created 
			F.type();//call of method of void type
			F.test();//call of  method of void test
		}
}//end of main class		