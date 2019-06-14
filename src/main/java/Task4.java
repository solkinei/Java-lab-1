import java.util.Arrays;

public class Task4 {
    public static void main(String[] args){
        String input = "2,18,12,4,8,7,1,20,19,6,9,5,17,15,24,30";
        collaps(input);
    }

    static void collaps(String expanded){

        String[] arr = expanded.split(",");             // разделяем исходную строку на подстроки через каждую ","
        int[] num = new int[arr.length];
        for(int i = 0; i < arr.length; i++)                   // превращаем каждый символ строки в число
            num[i] = Integer.parseInt(arr[i]);
        Arrays.sort(num);                                     // сортируем числа по возрастанию
        for(int i:num) {
            System.out.print(i + " ");                        // печать для проверки сортировки
        }
        System.out.println(" ");

        for(int i = 0; i < num.length; i++){                  // шаманство
            System.out.print(num[i]);
            if(i < num.length - 1 && (num[i] == num[i + 1] - 1) && (num[i + 1] == num[i + 2] - 1)){
                while (i < num.length - 1 && num[i] == num[i + 1] - 1) {
                    i++;
                }
                System.out.print("-" + num[i] + ",");
            }
            else if (i < num.length - 1) {
                System.out.print(",");
            }
        }


    }
}
