import java.util.Scanner;
class Add
{
	public static void main(String arg[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = a+b;
		System.out.println("Sum : "+c);
	}	
}