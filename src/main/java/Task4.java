import java.util.Arrays;

public class Task4 {
    public static void main(String [] args) {
        String input = "1,2,4,5,6,7,8,9,18,19,20,21";
        String [] splitStr = input.split(",");

        int [] arr = new int[splitStr.length];
        for(int i=0; i<splitStr.length;i++) {
            arr[i] = Integer.parseInt(splitStr[i]);
        }
        String output = "";
        for(int i = 0; i<arr.length-2; i++) {
            if (arr[i + 1] != arr[i] + 1) {
                output += arr[i] + ",";
            }
            else if (arr[i + 1] == arr[i] + 1 && arr[i + 2] != arr[i] + 2) {
                output += arr[i] + ",";
            }
            else if (arr[i + 1] == arr[i] + 1 && arr[i + 2] == arr[i] + 2) {
                int tmpFirst = arr[i];
                int tmpLast = 0;
                for (int j = i; j<arr.length-1 && arr[j + 1] == arr[j]+1; j++) {
                    tmpLast = arr[j + 1];
                    i++;
                }
                if(i==arr.length-1)
                    output += tmpFirst + "-" + tmpLast;
                else
                    output += tmpFirst + "-" + tmpLast + ",";
            }
        }
        System.out.println(output);
    }
}
