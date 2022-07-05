package coreJava;

public class Static_var 

{
	static int count=0;
	// int count=0;
	
	public Static_var()
	{
	
		count ++;
		System.out.println(count);
	}
	
	public static void main(String[] args) 
	{
		Static_var obj1=new Static_var();
		Static_var obj2=new Static_var();
		Static_var obj3=new Static_var();
		
	}

}
