import java.util.Scanner;
class reverseNumber
{
    public static void main(String arg[])
    {
            int digit,num,rev = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter The Number : ");
            num = sc.nextInt();

            do
            {
                digit = num % 10;
                rev = (rev*10) + digit;
                num = num/10;
            }while(num != 0);

        System.out.println("Reverse Number : "+rev);
    }   
}