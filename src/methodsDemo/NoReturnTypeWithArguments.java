package methodsDemo;

public class NoReturnTypeWithArguments {

	void addition(int a, int b)
	{
		int c=a+b;
		System.out.println("addition is " +c);
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 NoReturnTypeWithArguments obj=new  NoReturnTypeWithArguments(); //object cration
				 obj.addition(15, 20);
		 obj.addition(50, 100);
		 obj.addition(120, 75);
	}
	

}
