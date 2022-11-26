import java.util.Scanner;
class palidromeNumber
{
    public static void main(String arg[])
    {
        int digit,num,rev = 0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        num = sc.nextInt();
        n = num;
        digit = num;
        do
        {
            digit = num % 10;
            rev = (rev*10) + digit;
            num = num/10;
        }while(num != 0);

        if(n == rev)
        {
            System.out.println("It is Palidrome Number");
        }
        else
        {
            System.out.println("It is Not Palidrome Number");
        }
    }
}