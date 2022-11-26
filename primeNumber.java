//    V => i,n,flag,sc
//    I => n = input,flag = 0
//    P =>  for(i = 2;i < n;i++)
//            {
//                if(n%i == 0)
//                {
//                    System.out.println("It is Not prime Number!!");
//                    flag = 1;
//                    break;
//                }
//            }
//            if(flag == 0)
//            {
//                System.out.println("It is Prime Number");
//            }
//    O => yes/no

import java.util.Scanner;
class primeNumber
{
    public static void main(String arg[])
    {
        int i,n,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = sc.nextInt();

        for(i = 2;i < n;i++)
        {
            if(n%i == 0)
            {
                System.out.println("It is Not prime Number!!");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("It is Prime Number");
        }
    }
}