/*
*Задача 4. Свертка числовых диапазонов
Написать программу, осуществляющую свертку числовых диапазонов.
*/

package task4;

import task3.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task4 {

    static void printedArrOfNumbers(String s){
        int[] numbers;
        String[] splitedNumbers = s.split(",");
        numbers = new int[splitedNumbers.length];
        for (int i = 0; i < splitedNumbers.length; i++) {
            numbers[i] = Integer.parseInt(splitedNumbers[i]);
        }
        for (int i = 0; i < numbers.length - 3; i++) {
            System.out.print(numbers[i]);
            if (numbers[i] == numbers[i + 1] - 1 && numbers[i + 1] == numbers[i + 2] - 1) {
                while (i < numbers.length-1 && numbers[i] == numbers[i + 1]-1)
                    i++;
                System.out.print("-" + numbers[i]);
                if (i < numbers.length - 1)
                    System.out.print(",");
            } else
                System.out.print(",");
        }
    }


    public static void main (String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = bufferedReader.readLine();
        printedArrOfNumbers(s);
    }
}
