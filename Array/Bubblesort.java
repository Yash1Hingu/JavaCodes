import java.util.Scanner;
class Bubblesort
{
    public static void main(String[] arg)
    {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        int i,j,temp;

        System.out.println("Enter Elements in Array : ");
        for(i = 0;i < a.length;i++)
        {
            a[i] = sc.nextInt();
        }

        for(i = 0;i < a.length;i++)
        {
            for(j = i+1;j < a.length;j++)
            {
                if(a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Shorted Array : ");
        for(i = 0;i < a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}