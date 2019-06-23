public class Int_Str {
    public static void int_str(String input) {
        String[] buffer = input.split(",");
        int[] arr = new int[buffer.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(buffer[i]);
        }

        int i;
        for (i = 0; i < arr.length - 3; i++) {
            System.out.print(arr[i]);
            if (arr[i] == arr[i + 1] - 1 && arr[i + 1] == arr[i + 2] - 1) {
                while (i < arr.length - 1 && arr[i] == arr[i + 1] - 1) {
                    i++;
                }
                System.out.print("-" + arr[i]);
                if (i < arr.length - 1) {
                    System.out.print(",");
                }
            } else {
                System.out.print(",");
            }

        }
        if (i < arr.length) {
            System.out.print(arr[i]);
            if (arr[i] == arr[i + 1] - 1 && arr[i + 1] == arr[i + 2] - 1) {
                System.out.print("-" + arr[i + 2]);
            } else {
                for (; i < arr.length; i++) {
                    System.out.print("," + arr[i]);
                }

            }

        }
    }
}