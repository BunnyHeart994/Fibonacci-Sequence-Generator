import java.util.Scanner;

public class Main
{
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int prev, next, result, limit;
        System.out.print("THIS PROGRAM WILL GENERATE THE FIBONACCI " +
                "SEQUENCE THAT WILL GO UP TO THE NUMBER YOU CHOSE (\"limit\").\n" +
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

    }
}