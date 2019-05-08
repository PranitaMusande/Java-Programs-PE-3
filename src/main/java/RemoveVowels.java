//4. Write a program to set up an array of places, Loop round and remove the vowels. Display the new
//        words in console
//        Input:
//        India
//        United States
//        Germany
//        Egypt
//       czechoslovakia
//Output:
//        Place Name without Vowels:0 Ind
//        Place Name without Vowels:1 Untd Stts
//        Place Name without Vowels:2 Grmny
//        Place Name without Vowels:3 Egypt
//        Place Name without Vowels:4 czchslvk
import java.util.Scanner;

public class RemoveVowels
{
    public void remove()
    {
        String strOriginal, strNew;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        strOriginal = sc.nextLine();

        strNew = strOriginal.replaceAll("[aeiouAEIOU]", "");

        System.out.print("Place Name without Vowels :\n");

        System.out.print(strNew);
    }

    public static void main(String[] args)
    {
        RemoveVowels removeVowels=new RemoveVowels();
        removeVowels.remove();
    }
}
