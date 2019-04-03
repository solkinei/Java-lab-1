public class Task3 {
    public static void main(String[] args){
        expand(args[0]);
        System.out.println(expand(args[0]));
    }

    static String expand(String collaps){
        String sought = "";                                 // sought - искомая "развёрнутая" строка
        String[] arr = collaps.split(",");            // split делит исходную строку на подстроки через каждую ","
        for (int i = 0; i < arr.length; i++){
            if (arr[i].contains("-")){                      // contains - если в строке содержится "-", то split её
                String[] add = arr[i].split("-");     // добавляем цифры в диапазон
                for (int j = Integer.parseInt(add[0]); j <= Integer.parseInt(add[1]); j++) // парсим границы диапазона
                    sought = sought + j + ",";
            }
            else sought = sought + arr[i] + ",";
        }
        return(sought.substring(0, sought.length() - 1));    // с помощью substring формируем(возвращаем) новую строку от нулевого до предпоследнего индекса
    }
}
