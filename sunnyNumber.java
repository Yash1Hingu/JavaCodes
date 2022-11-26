// VIPO => variable,input,ProgramLogic,output
// V => n,nNext,sc
// I => n = userINput,nNext = n+1
// P => if(sqrt(nNext) - floor(sqrt(nNext)) == 0)
//         {
//             yes;
//         }
//     else
//         {
//             no;
//         }
// O => Sunny Number yes/no

import java.util.Scanner;
class sunnyNumber
{
    public static void main(String arg[])
    {
        int n,nNext;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = sc.nextInt();
        nNext = n+1;

        if(Math.sqrt(nNext) - Math.floor(Math.sqrt(nNext)) == 0)
        {
            System.out.println("Yes,It is Sunny Number");
        }
        else
        {
            System.out.println("It is Not Sunny Number");
        }
    }
}