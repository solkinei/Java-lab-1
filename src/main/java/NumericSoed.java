public class NumericSoed {

    public static void main(String args[]) {


        String input = "1,2,4,5,6,7,10,11,18,19,20,21";
        soed(input);
    }

    public static void soed(String input) {
        String[] arr = input.split(",");
        int[] numbers;
        numbers = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            numbers[i] = Integer.parseInt(arr[i]);
        for (int i = 0; i < numbers.length - 3; i++) {
            System.out.print(numbers[i]);
            if (numbers[i] == numbers[i + 1] - 1 && numbers[i + 1] == numbers[i + 2] - 1) {
                while (i < numbers.length - 1 && numbers[i] == numbers[i + 1] - 1)
                    i++;
                System.out.print("-" + numbers[i]);
                if (i < numbers.length - 1)
                    System.out.print(",");
            } else
                System.out.print(",");
        }

    }
}