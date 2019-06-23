public class Task5 {

    public static void main(String[] args) {
        String input = "1978564";
        char[] str = input.toCharArray();
        Figure figure=new Figure();
        figure.choiceNumber(str);

        for (String line:figure.picture) {
            System.out.println(line);
        }
    }
}