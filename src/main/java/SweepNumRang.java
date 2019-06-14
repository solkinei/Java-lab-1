public class SweepNumRang {

    static String sweep(String str) {
        String nums = " ";
        String arr[] = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("-")) {
                String buf[] = arr[i].split("-");
                int number1 = Integer.parseInt(buf[0]);
                int number2 = Integer.parseInt(buf[1]);
                while (number1 <= number2) {
                    nums += Integer.toString(number1) + " ";
                    number1++;
                }
            } else {
                nums += arr[i] + " ";
            }
        }
        nums = nums.trim();
        nums = nums.replace(" ", ",");
        return nums;
    }
}
