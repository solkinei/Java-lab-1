class Str_Int {
    public static int[] str_int(String input) {
        int[] temp = new int[100];
        int t = 0;
        String buffer[] = input.split(",");

        for (String num : buffer) {
            String[] arr = num.split("-");

            if (arr.length == 1) {
                temp[t] = Integer.parseInt(arr[0]);
                t++;
            } else {
                int begin = Integer.parseInt(arr[0]);
                int end = Integer.parseInt(arr[1]);
                for (int i = begin; i <= end; i++) {
                    temp[t] = i;
                    t++;
                }
            }
        }
        int count;
        for (count = 0; temp[count] != 0; count++) ;
        int[] totalArr = new int[count];

        for (t = 0; t < count; t++) {
            totalArr[t] = temp[t];
        }

        return totalArr;
    }
}
