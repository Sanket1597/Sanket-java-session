package ArrayDemo;

public class AdditionofnoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,30,40,50};
int x=a.length;
int add=0;
for(int i=0; i<x; i++)
{
	add=a[i]+add;
	
}
System.out.println("addtion of all array is "+add);
	}

}
