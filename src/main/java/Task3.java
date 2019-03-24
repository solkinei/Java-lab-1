public class Task3 {
public static void main(String[] args){
    String input="1,2,4-7,18-21";                      // input string (from CMD =))

    String[] arr=input.split(",");              // split it by ","

    for (String number:arr){
        try                                                 // if this is number - print it
        {
            int i=Integer.parseInt(number);
            System.out.print(i+",");
        }
        catch (NumberFormatException nfe)                   // if it is not a number:
        {
            String[] numberDividedByMinus=number.split("-");      // split it
            int left=Integer.parseInt(numberDividedByMinus[0]);         // first number
            int right=Integer.parseInt(numberDividedByMinus[1]);        // second number
            int currentNumber=left;                                     // number for print
            for (int i=0;i<=right-left;i++)
            {
                System.out.print(currentNumber+++",");
            }

        }

    }


}


}

