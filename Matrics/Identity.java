import java.util.Scanner;

class Identity
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int colomn1,row1,i,j,flag = 0;

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
                if(((i != j) && (A[i][j] == 0)) || ((i == j) && (A[i][j] == 1)))
                {
                    flag = 1;
                    break;
                }
            }
         }

         if(flag == 1)
         {
            System.out.println("It is a identity");
         }
         else
         {
            System.out.println("It is not a Indentity");
         }
    }
}