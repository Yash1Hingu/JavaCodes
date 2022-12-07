import java.util.Scanner;
class SameMatrics
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int row1,colomn1,row2,colomn2;
        System.out.println("Enter Dimension(Row Colomn) of Matrics A : ");

        row1 = sc.nextInt();
        colomn1 = sc.nextInt();

        int[][] A = new int[row1][colomn1]; 
        int i,j,flag = 0;

        System.out.println("Enter Dimension(Row Colomn) of Matrics B : ");

        row2 = sc.nextInt();
        colomn2 = sc.nextInt();

        int[][] B = new int[row2][colomn2];

        if(row1 == row2 && colomn1 == colomn2)
        {
            System.out.println("Enter MAtrics A Elemnets : ");
            for(i = 0;i < row1;i++)
            {
                for(j = 0;j < colomn1;j++)
                {
                    System.out.print("A["+i+"]"+"["+j+"] ");
                    A[i][j] = sc.nextInt();
                }   
            }

            System.out.println("Enter MAtrics B Elemnets : ");
            for(i = 0;i < row2;i++)
            {
                for(j = 0;j < colomn2;j++)
                {
                    System.out.print("B["+i+"]"+"["+j+"] ");
                    B[i][j] = sc.nextInt();
                }   
            }
            
            for(i = 0;i < row1;i++)
            {
                for(j = 0;j < colomn1;j++)
                {
                    if(A[i][j] != B[i][j])
                    {
                        flag = 1;
                        break;
                    }
                }
            }

            if(flag == 1)
            {
                System.out.println("Matrics A Not Equal To Matrics B");
            }
            else
            {
                System.out.println("Matrics Are Equal");
            }
        }
        else
        {
            System.out.println("Not Possible Comparison between two different dimension matrics!!!");
        }

      

    }
}