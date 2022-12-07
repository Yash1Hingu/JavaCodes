import java.util.Scanner;

class MatricsCreate
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int colomn1,row1,colomn2,row2,i,j;

        System.out.println("Enter Dimension (row colomn) of first  Matrics");
        row1 = sc.nextInt();
        colomn1 = sc.nextInt();

        int[][] A = new int[row1][colomn1];

        System.out.println("Enter Dimension (row colomn) of secound  Matrics");
        row2 = sc.nextInt();
        colomn2 = sc.nextInt();

        int[][] B = new int[row2][colomn2];


        if((row1 == row2) && (colomn1 == colomn2)){

                for(i = 0;i < row1;i++)
                {
                    for(j = 0;j < colomn1;j++)
                    {
                        System.out.print("a["+i+"]"+"["+j+"] ");
                        A[i][j] = sc.nextInt();
                    }
                }

                for(i = 0;i < row2;i++)
                {
                    for(j = 0;j < colomn2;j++)
                    {
                        System.out.print("b["+i+"]"+"["+j+"] ");
                        B[i][j] = sc.nextInt();
                    }
                }

                for(i = 0;i < row1;i++)
                {
                    for(j = 0;j < colomn1;j++)
                    {
                        System.out.print((A[i][j] + B[i][j])+" ");
                    }
                    System.out.println();
                }

        }
        else
        {
            System.out.println("Not Possible to Add diferent dimension array!!!");
        }


    }
}