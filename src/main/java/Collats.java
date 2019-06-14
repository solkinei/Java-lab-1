public class Collats {
    public static void main(String[] args) {
        int countMax = 0;
        int num = 0;
        for (int i = 1; i < 100000; i = i + 1) {
            if (counter(i) > countMax) {
                countMax = counter(i);
                num = i;
            }
        }
        System.out.println(" Максимальное число итераций " + countMax);
        System.out.println(" При числе " + num);
    }

    public static int counter(int i) {
        int count = 0;
        for (int num = i; num != 1; num = num / 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = 3 * num + 1;
            }
            count = count + 1;
        }
        return count;
    }
}
