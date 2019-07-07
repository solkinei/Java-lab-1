public class Task1 {
    public static void main(String[] args) {
        CollatzeSequence mainSequence = new CollatzeSequence();
        long maxLine = 0;
        long sequence = 0;
        long maxNumber = 0;
        for(long number = 1; number <= 1000000; number++){
            sequence = mainSequence.collatzNumber(number);
            if(sequence > maxLine){
                maxLine = sequence;
                maxNumber = number;
            }
        }
        System.out.println("Самая длинная последовательность Коллатца состоит из " + maxLine + " чисел и это число "
                + maxNumber);
    }
}

class CollatzeSequence{
    public static long collatzNumber(long number){
        long line = 1;
        for( ; number != 1; line++){
            if(number % 2 == 0){
                number = number / 2;
            }
            else if(number % 2 != 0){
                number = number * 3 + 1;
            }
        }
        return line;
    }
}
