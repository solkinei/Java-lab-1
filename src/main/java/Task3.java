import java.util.StringJoiner;

public class Task3 {
    public static String Scan(String args) {
        StringJoiner finalStr = new StringJoiner(",");
        String numbers[] = args.split(",");
        for (String number : numbers) {
            try {
                int i = Integer.parseInt(number);
                finalStr.add(Integer.toString(i));
            } catch (NumberFormatException e) {
                String num[] = number.split("-");
                int start = Integer.parseInt(num[0]);
                int end = Integer.parseInt(num[1]);
                for (int j = start; j <= end; j++) {
                    finalStr.add(Integer.toString(j));
                }
            }
        }
        System.out.print(finalStr);
        return finalStr.toString();
    }
}
