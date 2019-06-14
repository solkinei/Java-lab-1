public class rangeReduction {
    static String rangeReduction(String in) {
        String out = "";
        String str[] = in.split(",");
        for (int i=0; i < str.length; i++) {
            int j=0;
            while( i+j< str.length && Integer.parseInt(str[i])+j == Integer.parseInt(str[i+j]) ) {
            j++;
            }
            j--;
            if (j>1){
                out = out.concat(str[i]+"-"+str[i+j] + ",");
                i+=j;
            }
            else {
                out = out.concat(str[i] + ",");
            }
        }
        out = out.substring(0, out.length() - 1);
        return out;
    }
}
