import java.util.Scanner;

class EvenOddCounter{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int colomn1,row1,i,j,flag = 0;
        int even = 0,odd = 0,zero = 0;

        System.out.println("Enter Dimension (row colomn) of first  Matrics");
        row1 = sc.nextInt();
        colomn1 = sc.nextInt();

        int[][] A = new int[row1][colomn1];
         for(i = 0;i < row1;i++)
         {
             for(j = 0;j < colomn1;j++)
             {
                 System.out.print("a["+i+"]"+"["+j+"] ");
                 A[i][j] = sc.nextInt();
             }
         }

         for(i = 0;i < row1;i++)
         {
            for(j = 0;j<colomn1;j++)
            {
                if(A[i][j] == 0)
                {
                    zero = zero + 1;
                }
                else if(A[i][j]%2 == 0)
                {
                    even = even + 1;
                }
                else
                {
                    odd = odd + 1;
                }
            }
         }

        for(i = 0;i < row1;i++)
                {
                    for(j = 0;j < colomn1;j++)
                    {
                        System.out.print(A[i][j]+" ");
                    }
                    System.out.println();
                }
        
        System.out.println("Even Number Are : "+even);
        System.out.println("Odd Number Are : "+odd);
        System.out.println("Total Zero Are : "+zero);
    }
}