//1. Create a class called StudentMarks, which prompts user for the number of students, reads it
//   from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
//   grades of each of the students and saves them in an int array called stuGrades. Your program shall
//   check that the grade is between 0 and 100 else has to trow an error message.

import java.util.Scanner;

public class StudentMarks
{
    int numOfStudent;
    int grade[];
    private final int LOWEST_GRADE  = 0;
    private final int HIGHEST_GRADE = 100;

    public void display()
    {
        System.out.println("Enter the number of Student");
        Scanner scanner = new Scanner(System.in);
        numOfStudent = scanner.nextInt();
        grade = new int[numOfStudent];

        for(int i = 0; i < this.numOfStudent; ++i)
        {
            int j = i + 1;
            System.out.println("Enter the Grade for student " + j);
            grade[i] = scanner.nextInt();

            if((grade[i] <= LOWEST_GRADE) || (grade[i] >= HIGHEST_GRADE))
            {
                 System.out.println("Invalid grade, try again...");
            }
        }
    }

    public static void main(String[] args)
    {
        StudentMarks studentMarks=new StudentMarks();
        studentMarks.display();
    }
}


