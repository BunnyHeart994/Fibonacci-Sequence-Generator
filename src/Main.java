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

        System.out.print(String.join(", ", chain()));
    }
    private static String[] chain()
    {
        int i;
        String[] tempArr = new String[1];
        for(i = 0; i <= limit; i++)
        {
            result = prev + next;
                if (result <= limit)
                {
                    tempArr = (String[]) manualAddArrSlot(tempArr);
                    tempArr[i] = Integer.toString(result);
                }
            prev = next;
            next = result;
        }
        return tempArr;
    }/*
    private static String makeResult(String... str)
    {
        return str;
    }*/

    public static Object[] changeArrType(Object[] target, String type) //NEW IMPORTANT
    {
        return switch (type)
        {
            case "short": yield target = new Short[target.length];
            case "int": yield target = new Integer[target.length];
            case "long": yield target = new Long[target.length];
            case "string": yield target = new String[target.length];
            case "char": yield target = new Character[target.length];
            case "bool": yield target = new Boolean[target.length];
            default: System.out.println("\nARRAY TYPE CONVERSION ERROR\nRETURNING null"); yield null;
        };
    }
    public static Object[] manualAddArrSlot(Object[] mainArr)
    {
        Object[] tempArr = new Object[mainArr.length + 1];
        for (int i = 0; i < mainArr.length; i++)
        {
            tempArr[i] = mainArr[i];
        }
        mainArr = tempArr;
        return mainArr;
    }
}