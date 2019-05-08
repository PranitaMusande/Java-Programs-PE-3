//2. Write a program to compute the addition of two matrix, Read the number of rows and columns
//        as input, also the values of each matrix
//        Output:
//        Input number of rows of matrix: 3
//        Input number of columns of matrix: 2
//        Input elements of first matrix: 1 2 3 4 5 6
//        Input the elements of second matrix: 9 8 7 6 5 4
//        Sum of the matrices:-
//        10 10
//        10 10
//        10 10
import java.util.Scanner;

public class MatrixAddition
{
    int row1, column1, row2, column2;

    public void add()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        row1 = s.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        column1 = s.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        row2 = s.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        column2 = s.nextInt();
        if (row1 == row2 && column1 == column2)
        {
            int a[][] = new int[row1][column1];
            int b[][] = new int[row2][column2];
            int c[][] = new int[row2][column2];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < row1; i++)
            {
                for (int j = 0; j < column1; j++)
                {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < row2; i++)
            {
                for (int j = 0; j < column2; j++)
                {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for (int i = 0; i < row1; i++)
            {
                for (int j = 0; j < column1; j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < row2; i++)
            {
                for (int j = 0; j < column2; j++)
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            for (int i = 0; i < row1; i++)
            {
                for (int j = 0; j < column2; j++)
                {
                    for (int k = 0; k < column1; k++)
                    {
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            }
            System.out.println("Matrix after addition:");
            for (int i = 0; i < row1; i++)
            {
                for (int j = 0; j < column2; j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition would not be possible");
        }
    }


    public static void main(String[] args)
    {
        MatrixAddition matrixAddition=new MatrixAddition();
        matrixAddition.add();
    }
}
