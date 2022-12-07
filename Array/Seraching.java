import java.util.Scanner;
class Seraching
{
    public static void main(String[] arg)
    {
        int[] a = new int[5];
        Scanner sc = new Scanner(System.in);
        int i,num;

        System.out.println("Enter Elements In Array");
        for(i = 0;i < a.length;i++)
        {
            a[i] = sc.nextInt();
        }

        System.out.println("Which Number ?");
        num = sc.nextInt();

        for(i = 0;i < a.length;i++)
        {
            if(a[i] == num)
            {
                System.out.println("Position of "+num+" is "+(i+1));
                break; 
            }
        }

    }
}