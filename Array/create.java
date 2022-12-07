import java.util.Scanner;
class create
{
    public static void main(String[] arg)
    {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        int i = 0;

        for(i = 0;i<a.lenght;i++)
        {
            a[i] = sc.nextInt();
        }

        for(i = 0;i<a.lenght;i++)
        {
            System.out.print("\t"+a[i]);
        }
        
    }
}