/*
*Задача 3. Развертка числовых диапазонов
Написать программу, которая принимает через командную строку несколько
числовых диапазонов и выдает на экран список чисел.
Например: ''1,2,4-7,18-21'' -> 1,2,4,5,6,7,18,19,20,21.
 */

package task3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class task3{

     static String[] arrSplit (String s){
        String[] buf = s.split(",");
        return buf;
    }


    public static int[] openRange (String[] arr){
        int[] arrayNumber = new int[20];
        int j = 0; // для движения по новому массиву
        for(int i = 0; i < arr.length; i++) {
            String[] cuttedString = arr[i].split("-");
            if(cuttedString.length == 1){
                arrayNumber[j] = Integer.parseInt(cuttedString[0]);
                j++;
            } else {
                int begin = Integer.parseInt(cuttedString[0]);
                int end = Integer.parseInt(cuttedString[1]);
                for(int x = begin; x <= end; x++){
                    arrayNumber[j] = x;
                    j++;
                }
            }
        }
        int counter = 0;
        while(arrayNumber[counter] != 0){
            counter++;
        }
        int[] numbers = new int[counter];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = arrayNumber[i];
        }
        return numbers;
    }

    public static void main (String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        s = bufferedReader.readLine();
        int [] numbers = task3.openRange(arrSplit(s));
        for(int i = 0; i < (numbers.length - 1); i++) {
            System.out.print(numbers[i] + ",");
        }
        System.out.println(numbers[numbers.length-1]);

    }
}

