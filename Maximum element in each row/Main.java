
import java.util.*;
public class Main
{
    public static void display(int result[], int n)
    {
        int i;
        for(i = 0; i < n; i++)
        {
            System.out.print(result[i] + "\n");
        }
    }

    public static void maxi_row(int mat[][], int m, int n)
    {
        int i = 0, j;
        int max = 0;
        int[] result = new int[m];
        while (i < m)
        {
            for ( j = 0; j < n; j++)
            {
                if (mat[i][j] > max)
                {
                    max = mat[i][j];
                }
            }
            result[i] = max;
            max = 0;
            i++;

        }
        display(result, m);
    }

    public static void main(String[] args)
    {
        int n, m;
        Scanner sc = new Scanner(System.in);
        //System.out.print("\nEnter the order of the matrix : ");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat1 = new int[m][n];
        //System.out.print("\nInput the matrix 1 elements : ");
        int i, j;
        for(i = 0; i < m; i++)
        {
            for(j = 0; j < n; j++)
                mat1[i][j] = sc.nextInt();
        }

        maxi_row(mat1,m,n);
    }
}
