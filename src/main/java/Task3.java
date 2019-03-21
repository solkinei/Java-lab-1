public class Task3 {
    static String strForParse;
    public static void main(String[] args) {
        strForParse = "1,2,4-7,18-21,47-46";
        String strResult = new String();
        try {
            strResult = expandString(strForParse);
        }
        catch(WrongRangeException e){
            System.err.println(e.getMessage());
        }
        System.out.println(strResult);
    }

    static String expandString(String strForParse) throws WrongRangeException{
        String res = new String();
        String [] dividedStrings = strForParse.split(",");

        for (int i = 0; i < dividedStrings.length; i++){
            if (dividedStrings[i].contains("-")){
                String [] tmpRange = dividedStrings[i].split("-");
//checking range
                if (Integer.parseInt(tmpRange[0]) > Integer.parseInt(tmpRange[1])){
                    //res = "The first number in the range should be less, than the second number!"
                    throw new WrongRangeException("The first number in the range should be less, than the second number!");
                    //return res;
                }
                for (int j = Integer.parseInt(tmpRange[0]); j <= Integer.parseInt(tmpRange[1]); j++){
                    res = res + j + ",";
                }
            }
            else
                res = res + dividedStrings[i] + ",";
        }
        return res.substring(0, res.length() - 1);
    }


}

class WrongRangeException extends Exception {

    public WrongRangeException(String message) {
        super(message);
    }
}
