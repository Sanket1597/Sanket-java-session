package conditionalStatement;
//WAP to find the greater number among the 3 nos
public class DemoIfelseLadder1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12;
int b=35;
int c=40;

if(a>b)
{
	if(a>c)
	{
		System.out.println("A is greater");
	}
	else
	{
		System.out.println("C is grater");
	}
}
else
{
	if(b>c)
	{
		System.out.println("B is greater");
	}
	else
	{
		System.out.println("C is greater");
	}
}
	}

}
