public class Task1 {

    public static long maxNum = 0;
    public static long maxlen = 0;

    public static void main(String[] args) {
        Collatz.CollatzDemo();
        System.out.println("Collatz max lenght - " + maxlen + ". Max number - " + maxNum);
    }
}