import java.util.Scanner;

public class Main
{
    public static final Scanner scan = new Scanner(System.in);
    public static int prev = 1, next = 2, result, limit;
    public static void main(String[] args)
    {
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
        makeResult();
    }
    private static int chain()
    {
        int i;
        for(i = 0; i <= limit; i++)
        {
            result = prev + next;
            prev = next;
            next = result;
        }
        return i;
    }
    private static void makeResult()
    {
        int[] str = new int[chain()];
        for(int i = 0; i <= limit; i++)
        {
            result = prev + next;
            str[i] = result;
            prev = next;
            next = result;
        }
        for (int i = 0; i <= str.length; i++)
        {
            if (i <= (str.length - 2))
                System.out.print(str[i] + ", ");
            else System.out.print(str[i] + ".");
        }
    }
}