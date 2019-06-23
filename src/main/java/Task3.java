public class Task3 {
    public static void main(String[] args) {
        String input = "1-3,4-8,9,10,11,12-18,19,20";
        Str_Int open = new Str_Int();
        int[] totalArr = open.str_int(input);

        for (int i = 0; i < (totalArr.length - 1); i++) {
            System.out.print(totalArr[i] + ",");
        }
        System.out.println(totalArr[totalArr.length - 1]);
    }
}