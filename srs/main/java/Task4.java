public class Task4 {
    public static void Fold(String args) {
        String[] arr = args.split(",");
        int[] number = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            number[i] = Integer.parseInt(arr[i]);
        for (int i = 0; i < number.length - 3; i++) {
            System.out.print(number[i]);
            if (number[i] == number[i + 1] - 1 && number[i + 1] == number[i + 2] - 1) {
                while (i < number.length - 1 && number[i] == number[i + 1] - 1)
                    i++;
                System.out.print("-" + number[i]);
                if (i < number.length - 1)
                    System.out.print(",");
            } else
                System.out.print(",");
        }
    }
}
