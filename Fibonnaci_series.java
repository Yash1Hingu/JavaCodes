import java.util.Scanner;
class Fibonnaci_series
{
	public static void main(String arg[])
	{
		int i,n,n1 = 0,n2 = 1,sum = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 0;i<n;i++)
		{
			System.out.println(sum);
			sum = n1 + n2;
			n1 = n2;	
			n2 = sum;
		}
	}
}