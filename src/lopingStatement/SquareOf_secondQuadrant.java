package lopingStatement;
//wap to print a star pattern second quadrant triangle
public class SquareOf_secondQuadrant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int x=5;
for(int i=1; i<=x; i++)
{
	for(int k=i; k<x; k++)
	{
		System.out.print(" ");
	}
	for(int j=1; j<=i; j++)
	{
		System.out.print("*");
	}
	System.out.println();
}
		
	}

}
