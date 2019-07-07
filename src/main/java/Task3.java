public class Task3 {

    public static void main(String[] args) {
        //String input = "1,2,4-7,18-21";
        String[] arr = args[0].split(",");
        for(String x:arr){
            String[] arrOfNumber = x.split("-");
            if(arrOfNumber.length == 1){
                System.out.print(arrOfNumber[0] + ",");
            }
            else{
                int start = Integer.parseInt(arrOfNumber[0]);
                int finish = Integer.parseInt(arrOfNumber[1]);
                for(int i = start; i <= finish; i++){
                    System.out.print(  i + ",");
                }
            }
        }
    }
}