package methodsDemo;

public class ReturnTypeWithArguments {
int addition(int a, int b)
{
int c=a*b;
System.out.println("addition is"+c);
return c;
}	

public static void main(String[] args) {
		// TODO Auto-generated method stub
	ReturnTypeWithArguments obj=new ReturnTypeWithArguments();
	int x=obj.addition(10, 20);
	int y=obj.addition(2, 3);
	System.out.println("Addition given to main methos" +x);
	}

}
