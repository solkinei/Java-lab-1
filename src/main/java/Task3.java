public class Task3 {
    public static void main(String[] args) {
        String input = "1,2,4-8,10,12,13-18,20-25";
        Str2Int open = new Str2Int();
        int[] totalArr = open.StrToInt(input);

        for (int i = 0; i < (totalArr.length - 1); i++) {
            System.out.print(totalArr[i] + ",");
        }
        System.out.println(totalArr[totalArr.length - 1]);
    }
}
