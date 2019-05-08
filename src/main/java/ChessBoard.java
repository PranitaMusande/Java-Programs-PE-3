//5. Write a program to create a ChessBoard pattern with the help of multidimensional array, where
//        WWrepresents white color and BB represents Black color.
//        Output:
//        My Chess Board
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|
//        WW|BB|WW|BB|WW|BB|WW|BB|
//        BB|WW|BB|WW|BB|WW|BB|WW|

public class ChessBoard
{
    public void display()
    {
        int rows=8;
        int columns=8;

        String output[][] = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
            {
                if (((i + j) % 2) == 0)
                {
                    System.out.print(output[i][j] = "WW");
                }
                else {
                    System.out.print(output[i][j] = "BB");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        ChessBoard chessBoard=new ChessBoard();
        chessBoard.display();
    }
}
