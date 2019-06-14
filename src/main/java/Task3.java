public class Task3 {
    static String strForParse;
    public static void main(String[] args) {
        strForParse = "1,2,4-7,18-21,46-50,15";
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

        StringBuilder myStringBuilder = new StringBuilder();
        String [] dividedStrings = strForParse.split(",");

        for (int i = 0; i < dividedStrings.length; i++){
            if (dividedStrings[i].contains("-")){
                String [] tmpRange = dividedStrings[i].split("-");
//checking range
                if (Integer.parseInt(tmpRange[0]) >= Integer.parseInt(tmpRange[1])){
                    //res = "The first number in the range should be less, than the second number!"
                    throw new WrongRangeException("The first number in the range should be less, than the second number!");
                    //return res;
                }
                for (int j = Integer.parseInt(tmpRange[0]); j <= Integer.parseInt(tmpRange[1]); j++){
                    myStringBuilder = myStringBuilder.append(j);
                    myStringBuilder = myStringBuilder.append(",");
                }
            }
            else {
                myStringBuilder = myStringBuilder.append(dividedStrings[i]);
                myStringBuilder = myStringBuilder.append(",");
            }
        }
        String res = new String(myStringBuilder);
        return res.substring(0, res.length() - 1);
    }
}

class WrongRangeException extends Exception {

    public WrongRangeException(String message) {
        super(message);
    }
}
