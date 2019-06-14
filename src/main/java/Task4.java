public class Task4 {
   static String strForParse;
   public static void main(String[] args) {
        strForParse = "7,15,16,17,1,2,3,4,9,6,7,18,19,20,8,1,2,3,4";
        //System.out.println(strForParse);
        String strResult = new String();
        strResult = parseString(strForParse);
        System.out.println(strResult);
    }

    static String parseString(String strForParse) {
        strForParse = strForParse + ",";
        String [] dividedStrings = strForParse.split(",");
        int len = dividedStrings.length;
        int [] arr = new int[len];

        for (int i = 0; i < len; i++){
            arr[i] = Integer.parseInt(dividedStrings[i]);
        }
        int j = 0;
        String range = new String();

        for (int i = 0; i < len-2; i++) {
            range = null;
            j = 0;
            if ((1 == arr[i + 1] - arr[i]) && (1 == arr[i + 2] - arr[i + 1])) {
//the element is a start of the range
                range = arr [i] + "," + arr [i + 1] + "," + arr [i + 2] + ",";
                if (i + 3 < len) {
//checking next symbols only if the array was not finished
                    for (j = i + 3; j < len; j++) {
                        if (1 == arr[j] - arr[j - 1]) {
                            range = range + arr[j] + ",";
                        } else
                            break;
                    }
                    strForParse = strForParse.replace(range, arr[i] + "-" + arr[j - 1] + ",");
                    i = j-1;
                }
                else{
                    strForParse = strForParse.replace(range, arr[i] + "-" + arr[i + 2] + ",");
                    i += 2;
                }
            }
        }
        return strForParse.substring(0, strForParse.length() - 1);
    }
}