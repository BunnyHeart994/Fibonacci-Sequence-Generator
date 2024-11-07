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
        System.out.print("Sequence: 1, 2");
        makeResult();
    }
    /*private static int chain()
    {
        int i;
        for(i = 0; result <= limit; i++)
        {
            result = prev + next;
            prev = next;
            next = result;
        }
        return i;
    }*/
    private static void makeResult()
    {
        int[] str = new int[limit];
        while (limit < 1)
        {
            limit = Integer.parseInt(scan.nextLine());
        }
        if (limit == 1)
        {
            System.out.print("Sequence: 1.\nEND");
            return;
        }
        if (limit == 2)
        {
            System.out.print("Sequence: 2.\nEND");
            return;
        }
        for(int i = 0; i < str.length; i++)
        {
            if (limit == 1)
            {
                System.out.print("Sequence: 1");
            }
            else if (limit == 2)
            {
                System.out.print("Sequence: 2.\nEND");
                break;
            }
            else
            {
                //str = new int[limit - 2];
                result = prev + next;
                str[i] = result;
                if (i <= (str.length - 2))
                    System.out.print(", " + str[i]);
                else System.out.print(str[i] + ".");
                prev = next;
                next = result;
            }
        }
        /*for (int i = 0; i <= str.length; i++)
        {
            //IMPORTANT
            if (i <= (str.length - 1))
                System.out.print(", " + str[i]);
            else System.out.print(str[i] + ".");
        }*/
    }
}