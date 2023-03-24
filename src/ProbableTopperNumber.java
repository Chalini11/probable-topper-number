import java.util.Scanner;

public class ProbableTopperNumber
{

    public static String differenceOfSum(String rank)
    {
        int temporaryNumber, sumOfOddDigits = 0, sumOfEvenDigits = 0;
        for(int iterator = 0; iterator < rank.length(); iterator++)
        {
            temporaryNumber = Character.getNumericValue(rank.charAt(iterator));

            if(temporaryNumber%2 == 0)
            {
                sumOfEvenDigits += temporaryNumber;
            }
            else
            {
                sumOfOddDigits += temporaryNumber;

            }
        }
        if(sumOfEvenDigits==sumOfOddDigits)
            return "Yes";

        return "No";




    }
    public static void main(String[] args)
    {
        System.out.println("Enter a Rank");
        String rank;
        Scanner scan = new Scanner(System.in);
        rank = scan.next();
        System.out.println(differenceOfSum(rank));

    }
}