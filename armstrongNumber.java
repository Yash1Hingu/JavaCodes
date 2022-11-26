// V = r,n,temp,sum
// I => r,n = input,temp = n,sum = 0
// P => while(n > 0)
//       {
//           r = n % 10;
//           sum = sum + (r*r*r);
//           n = n/10;
//       }
// O => Armstron number yes/no


import java.util.Scanner;
class armstrongNumber
{
    public static void main(String arg[])
    {
        int r,n,temp,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = sc.nextInt();
        temp = n;

        while(n > 0)
        {
            r = n % 10;
            sum = sum + (r*r*r);
            n = n/10;
        }

        if(sum == temp)
        {
            System.out.println(temp+" is Armstrong Number!!!");
        }
        else
        {
            System.out.println(temp+" is not Armstrong Number!!!");
        }
    }
}