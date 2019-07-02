public class Task3 {
    public static void main(String[] args){
        String input="1,2,4-7,18-21";

        String[] arr=input.split(",");

        for (String number:arr){
            try
            {
                int i=Integer.parseInt(number);
                System.out.print(i+",");
            }
            catch (NumberFormatException nfe)
            {
                String[] numberDividedByMinus=number.split("-");
                int left=Integer.parseInt(numberDividedByMinus[0]);
                int right=Integer.parseInt(numberDividedByMinus[1]);
                int currentNumber=left;
                for (int i=0;i<=right-left;i++)
                {
                    System.out.print(currentNumber+++",");
                }

            }

        }


    }


}