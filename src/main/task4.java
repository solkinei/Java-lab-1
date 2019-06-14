public class task4 {
    public static void main(String[] args) {
        //String arr = {1,2,5,7,8,9,10,12,15,16,17,18,21,25};
        String argument = args[0];
        intToString one = new intToString();
        System.out.println (one.intToString(argument));
    }
}

class intToString {
    String intToString (String argument){
        String[] buf = argument.split(",");
        int [] arr = new int [buf.length];
        for (int i = 0; i < buf.length; i++)
            arr [i]= Integer.parseInt(buf[i]);
        String str = "";
        if ((arr[0]+1 == arr[0+1]) && (arr[0]+2 == arr[0+2]))
            str = "" + arr[0]+"-";
        else str = "" + arr[0]+",";
        for (int i = 1; i < arr.length-1; i++){
            if (arr[i]-1 != arr[i-1]) {
                if ((arr[i] - 1 != arr[i - 1]) && (arr[i] + 1 == arr[i + 1]) && (arr[i] + 2 == arr[i + 2]))
                    str = str + arr[i] + "-";
                else str = str + arr[i]+",";
            }
            if ((arr[i]-1 == arr[i-1]) && (arr[i]+1 != arr[i+1]))
                str = str + arr[i]+",";
        }
        str = str + arr[arr.length-1];
        return str;
    }
}
