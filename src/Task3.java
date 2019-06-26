public class Task3 {

    public static int[] expand(String interval) {
        int[] numbers;
        String limits[] = interval.split("-");
        if (limits.length == 1) {
            numbers = new int[1];
            numbers[0] = Integer.parseInt(limits[0]);
        } else {
            int start = Integer.parseInt(limits[0]);
            int end = Integer.parseInt(limits[1]);
            numbers = new int[end - start + 1];
            for (int i = start; i <= end; i++)
                numbers[i - start] = i;
        }
        return numbers;
    }

    public static void main(String[] args) {
        //String input = args[0];
        String input = "1,2,4-7,18-21";
        String arr[] = input.split(",");
        for (int i = 0; i < arr.length; i++) {
            int[] numbers = expand(arr[i]);
            for (int j = 0; j < numbers.length; j++) {
                if (i == arr.length - 1 && j == numbers.length - 1)
                    System.out.print(numbers[j]);
                else
                    System.out.print(numbers[j] + ",");
            }
        }
    }
}