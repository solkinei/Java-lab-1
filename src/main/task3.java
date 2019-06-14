import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        //String str = "0,2-4,5,6,10,11,14-18";
        String str = args[0];
        stringToInt one = new stringToInt();
        System.out.println (one.stringToInt(str));
    }
}

class stringToInt{
    ArrayList stringToInt (String str) {
        String[] buf = str.split(",");
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (int i = 0; i < buf.length; i++){
            boolean space = buf[i].contains("-");
            if (space == false)
                arr.add (Integer.parseInt(buf [i]));
            else{
                String[] bufX = buf[i].split("-");
                int x = Integer.parseInt(bufX [0]);
                int y = Integer.parseInt(bufX [1]);
                while (x <= y){
                    arr.add (x);
                    x++;
                }
            }
        }
        return arr;
    }
}
