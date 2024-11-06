import java.util.Scanner;

public class Main
{
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int prev = 1, next = 2, result, limit;
        System.out.print("THIS PROGRAM WILL GENERATE THE FIBONACCI " +
                "SEQUENCE THAT WILL GO UP TO THE NUMBER YOU CHOSE (\"limit\").\n\n" +
                "Input the limit: ");
        while(true)
        {
            try
            {
                limit = Integer.parseInt(scan.nextLine());
                break;
            }
            catch (Exception e)
            {
                System.out.print("Only integers are accepted.\nTry again: ");
            }
        }
        System.out.print("Sequence: 1, 2, ");
        for (int i = 0; i <= limit; i++)
        {
            result = prev + next;
            if (result <= limit)
                System.out.print(String.join(", ", Integer.toString(result)));
            prev = next;
            next = result;
        }
    }
    private static String chain(String... str)
    {
        int prev, next, limit, result, i;
        for (i = 0; i <= limit; i++)
        {
            result = prev + next;
            if (result <= limit)
                System.out.print(String.join(", ", Integer.toString(result)));
            prev = next;
            next = result;
        }
        int[] resultArr = new int[i];
        str =
        return str;
    }
}