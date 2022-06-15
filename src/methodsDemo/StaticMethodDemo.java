package methodsDemo;

public class StaticMethodDemo {

	static void test()
	{
		System.out.println("static methods - test");
	}
	
	void demo()
	{
		System.out.println("non-static methods - demo");
	}
	public static void main(String[] args) {
		
		StaticMethodDemo.test(); //to call static methods
		
		StaticMethodDemo obj=new StaticMethodDemo(); 
		obj.demo(); // call non static methods
		
	}
}



