import java.util.ArrayList;

public class NumericRazv {
    public static void main(String args[]) {
        String str = new String("1,2,3-8,10-12");
        razvorot(str);
    }
        public static void razvorot(String str){
            String[] array = str.split(",");
            for (int i = 0; i < array.length; i++) {
                if (array[i].indexOf("-") == -1) {
                    System.out.print(array[i] + " ");
                } else {
                    String razvor = array[i];
                    String[] arrayNew = razvor.split("-");
                    int input = Integer.parseInt(arrayNew[0]);
                    int output = Integer.parseInt(arrayNew[1]);
                    for (int y = input; y <= output; y++) {
                        System.out.print(y + " ");
                    }
                }

            }

        }
    }



