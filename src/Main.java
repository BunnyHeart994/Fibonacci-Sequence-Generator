import java.util.Scanner;

public class Main
{
    public static final Scanner scan = new Scanner(System.in);
    private static int limit;
    private static long prev = 1, next = 2, result;

    public static void main(String[] args)
    {
        System.out.print("THIS PROGRAM WILL GENERATE THE FIBONACCI " +
                "SEQUENCE THAT WILL GO UP TO THE NUMBER YOU CHOSE (\"limit\").\n\n" +
                "Input the limit: ");
        while(true)
        {
            try
            {
                limit = scan.nextInt();
                break;
            }
            catch (Exception e)
            {
                System.out.print("Only integers are accepted.\nTry again: ");
            }
        }
        simple();
    }
    private static void simple()
    {
        while (limit <= 0)
        {
            limit = scan.nextInt();
        }
        switch (limit)
        {
            case 1: System.out.print("Sequence: 1.\nEND"); return;
            case 2: System.out.print("Sequence: 1, 2.\nEND"); return;
            default: System.out.print("Sequence: 1, 2") ;break;
        }
        long[] str = new long[limit - 2];

        for(int i = 0; i < str.length; i++)
        {
            if (prev + next < 0)
            {
                System.out.println("... (MAXIMUM LONG VALUE EXCEEDED, ENDING PROCESS...)\nEND");
                break;
            }
            else
                result = prev + next;
            str[i] = result;
            if (i <= str.length - 2)
                System.out.print(", " + str[i]);
            else System.out.print(", " + str[i] + ".\nEND");
            prev = next;
            next = result;
        }
    }
}