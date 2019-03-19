public class task5 {

    public static void main(String[] args) {
        String str = args[0];
        char[] buf = str.toCharArray();
        String [] strMax = new String [12];
        for (int i = 0; i < 11; i++)
            strMax [i] = "";

        for (int i = 0; i < buf.length; i++) {
            picture one = new picture();
            strMax = one.picture(strMax, buf[i]);
        }
        for (int i = 0; i < 11; i++)
            System.out.println (strMax[i]);
    }
}

class picture{
    String [] picture (String [] strMax, char symbol){
        String [] str = new String [12];
        if (symbol == '1') {
            strMax[0] = strMax[0] + "     *  ";
            strMax[1] = strMax[1] + "    **  ";
            strMax[2] = strMax[2] + "   * *  ";
            strMax[3] = strMax[3] + "  *  *  ";
            strMax[4] = strMax[4] + " *   *  ";
            strMax[5] = strMax[5] + "*    *  ";
            strMax[6] = strMax[6] + "     *  ";
            strMax[7] = strMax[7] + "     *  ";
            strMax[8] = strMax[8] + "     *  ";
            strMax[9] = strMax[9] + "     *  ";
            strMax[10] = strMax[10] + "     *  ";
        }
        if (symbol == '2') {
            strMax[0] = strMax[0] + "******  ";
            strMax[1] = strMax[1] + "     *  ";
            strMax[2] = strMax[2] + "     *  ";
            strMax[3] = strMax[3] + "     *  ";
            strMax[4] = strMax[4] + "     *  ";
            strMax[5] = strMax[5] + "     *  ";
            strMax[6] = strMax[6] + "    *   ";
            strMax[7] = strMax[7] + "   *    ";
            strMax[8] = strMax[8] + "  *     ";
            strMax[9] = strMax[9] + " *      ";
            strMax[10] = strMax[10] + "******  ";
        }
        if (symbol == '3') {
            strMax[0] = strMax[0] + "******  ";
            strMax[1] = strMax[1] + "    *   ";
            strMax[2] = strMax[2] + "   *    ";
            strMax[3] = strMax[3] + "  *     ";
            strMax[4] = strMax[4] + " *      ";
            strMax[5] = strMax[5] + "******  ";
            strMax[6] = strMax[6] + "    *   ";
            strMax[7] = strMax[7] + "   *    ";
            strMax[8] = strMax[8] + "  *     ";
            strMax[9] = strMax[9] + " *      ";
            strMax[10] = strMax[10] + "*       ";
        }
        if (symbol == '4') {
            strMax[0] = strMax[0] + "*    *  ";
            strMax[1] = strMax[1] + "*    *  ";
            strMax[2] = strMax[2] + "*    *  ";
            strMax[3] = strMax[3] + "*    *  ";
            strMax[4] = strMax[4] + "*    *  ";
            strMax[5] = strMax[5] + "******  ";
            strMax[6] = strMax[6] + "     *  ";
            strMax[7] = strMax[7] + "     *  ";
            strMax[8] = strMax[8] + "     *  ";
            strMax[9] = strMax[9] + "     *  ";
            strMax[10] = strMax[10] + "     *  ";
        }
        if (symbol == '5') {
            strMax[0] = strMax[0] + "******  ";
            strMax[1] = strMax[1] + "*       ";
            strMax[2] = strMax[2] + "*       ";
            strMax[3] = strMax[3] + "*       ";
            strMax[4] = strMax[4] + "*       ";
            strMax[5] = strMax[5] + "******  ";
            strMax[6] = strMax[6] + "     *  ";
            strMax[7] = strMax[7] + "     *  ";
            strMax[8] = strMax[8] + "     *  ";
            strMax[9] = strMax[9] + "     *  ";
            strMax[10] = strMax[10] + "******  ";
        }
        if (symbol == '6') {
            strMax[0] = strMax[0] + "******  ";
            strMax[1] = strMax[1] + "*       ";
            strMax[2] = strMax[2] + "*       ";
            strMax[3] = strMax[3] + "*       ";
            strMax[4] = strMax[4] + "*       ";
            strMax[5] = strMax[5] + "******  ";
            strMax[6] = strMax[6] + "*    *  ";
            strMax[7] = strMax[7] + "*    *  ";
            strMax[8] = strMax[8] + "*    *  ";
            strMax[9] = strMax[9] + "*    *  ";
            strMax[10] = strMax[10] + "******  ";
        }
        if (symbol == '7') {
            strMax[0] = strMax[0] + "******  ";
            strMax[1] = strMax[1] + "     *  ";
            strMax[2] = strMax[2] + "     *  ";
            strMax[3] = strMax[3] + "     *  ";
            strMax[4] = strMax[4] + "     *  ";
            strMax[5] = strMax[5] + "     *  ";
            strMax[6] = strMax[6] + "     *  ";
            strMax[7] = strMax[7] + "     *  ";
            strMax[8] = strMax[8] + "     *  ";
            strMax[9] = strMax[9] + "     *  ";
            strMax[10] = strMax[10] + "     *  ";
        }
        if (symbol == '8') {
            strMax[0] = strMax[0] + "******  ";
            strMax[1] = strMax[1] + "*    *  ";
            strMax[2] = strMax[2] + "*    *  ";
            strMax[3] = strMax[3] + "*    *  ";
            strMax[4] = strMax[4] + "*    *  ";
            strMax[5] = strMax[5] + "******  ";
            strMax[6] = strMax[6] + "*    *  ";
            strMax[7] = strMax[7] + "*    *  ";
            strMax[8] = strMax[8] + "*    *  ";
            strMax[9] = strMax[9] + "*    *  ";
            strMax[10] = strMax[10] + "******  ";
        }
        if (symbol == '9') {
            strMax[0] = strMax[0] + "******  ";
            strMax[1] = strMax[1] + "*    *  ";
            strMax[2] = strMax[2] + "*    *  ";
            strMax[3] = strMax[3] + "*    *  ";
            strMax[4] = strMax[4] + "*    *  ";
            strMax[5] = strMax[5] + "******  ";
            strMax[6] = strMax[6] + "    *   ";
            strMax[7] = strMax[7] + "   *    ";
            strMax[8] = strMax[8] + "  *     ";
            strMax[9] = strMax[9] + " *      ";
            strMax[10] = strMax[10] + "*       ";
        }
        if (symbol == '0') {
            strMax[0] = strMax[0] + "******  ";
            strMax[1] = strMax[1] + "*    *  ";
            strMax[2] = strMax[2] + "*    *  ";
            strMax[3] = strMax[3] + "*    *  ";
            strMax[4] = strMax[4] + "*    *  ";
            strMax[5] = strMax[5] + "*    *  ";
            strMax[6] = strMax[6] + "*    *  ";
            strMax[7] = strMax[7] + "*    *  ";
            strMax[8] = strMax[8] + "*    *  ";
            strMax[9] = strMax[9] + "*    *  ";
            strMax[10] = strMax[10] + "******  ";
        }
        return strMax;
    }
}

