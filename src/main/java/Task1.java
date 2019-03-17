
/*Найти наибольшую последовательность Коллатца для чисел в диапазоне от 1 до 1 000 000.*/

public class Task1 {
    public static void main(String[] args) {
        CollatzeSequence mainSequence = new CollatzeSequence();//Создание объекта класса
        long maxLine = 0;
        long sequence = 0;
        long maxNumber = 0;
        for(long number = 1; number <= 1000000; number++){ //Цикл перебериет числа, которые будут использоваться для пос-ти
            sequence = mainSequence.collatzNumber(number);//Присваиваем длину последовательности для числа переменной
            if(sequence > maxLine){
                maxLine = sequence; // Определяем максимальную длину пос-ти
                maxNumber = number; // Записываем число, у которого максимальная длин пос-ти

            }
        }
        System.out.println("Самая длинная последовательность Коллатца состоит из " + maxLine + " чисел и это число "
                + maxNumber);
    }
}

class CollatzeSequence{
    /*Метод,возвращающий длину  пос-ти Коллатца для входящего числа*/
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


