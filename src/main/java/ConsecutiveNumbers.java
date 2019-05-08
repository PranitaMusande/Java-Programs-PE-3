//6. Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
//        assume the digits are a string and use split()
//        Input: 98,96,95,94,93
//        Output: 98,96,95,94,93 non consecutive numbers
//        Input: 54,53,52,51,50,49,48
//        Output : 54,53,52,51,50,49,48 are consecutive numbers
//        Input: 1,2,3,4,5,6,6
//        Output: 1,2,3,4,5,6,6 non consecutive numbers

import java.util.Arrays;
import java.util.Scanner;

public class ConsecutiveNumbers
{
    int number[];
    Scanner scanner = new Scanner(System.in);
    public void checkConsecutive()
    {
        number= new int[7];
        System.out.println("Enter seven numbers:");
        for(int i=0;i<7;i++)
        {
            number[i] = scanner.nextInt();
        }
        Arrays.sort(number);

        for(int i=1;i<7;i++)
        {
            if(number[i] - number[i-1] == 1)
            {
                System.out.println("Numbers are consecutive");
            }
            else {
                System.out.println("Numbers are not consecutive");
            }

        }
    }

    public static void main(String[] args)
    {
        ConsecutiveNumbers consecutiveNumbers=new ConsecutiveNumbers();
        consecutiveNumbers.checkConsecutive();
    }
}
