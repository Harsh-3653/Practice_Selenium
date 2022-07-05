package coreJava;

public class Constructor_1 
{
	
	public Constructor_1(int i)
	{
		System.out.println("no is s	"+i);
	}
	
	 public Constructor_1() {

		System.out.println("constructor 1");
	}
	public static void main(String[] args) 
	{
		Constructor_1 obj=new Constructor_1();
		Constructor_1 obj1=new Constructor_1(4);
		
	}

}
