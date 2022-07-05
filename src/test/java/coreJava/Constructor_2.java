package coreJava;

public class Constructor_2 



{
	int id;
	String name;
	int id1;
	String name1;
  public Constructor_2(String i,int j)
  {
	  name=i;
	  id=j;
	  
  }
  public Constructor_2(Constructor_2 s)
  {
	  id1=s.id;
	  name1=s.name;
	  
  }
  void display()
  {
	  System.out.println(name1+" "+id1);
  }
  public static void main(String[] args) 
  {
	Constructor_2 obj=new Constructor_2 ("harsh",21);
	Constructor_2 obj1=new Constructor_2(obj);
	obj1.display();
	
  }
  

}
