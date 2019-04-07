class Chislo {

    public String[][] mass = { { " **  ",
                                 "*  * ",
                                 "*  * ",
                                 "*  * ",
                                 "*  * ",
                                 "*  * ",
                                 " **  " },

                               {"  *  ",
                                " **  ",
                                "* *  ",
                                "  *  ",
                                "  *  ",
                                "  *  ",
                                "  *  "},

                               {" **  ",
                                "*  * ",
                                "   * ",
                                "  *  ",
                                " *   ",
                                "*    ",
                                "**** "},
                   {"***  ",
                    "   * ",
                    "   * ",
                    " **  ",
                    "   * ",
                    "   * ",
                    "***  "},


                   {"  *  ",
                    " **  ",
                    "* *  ",
                    "* *  ",
                    "**** ",
                    "  *  ",
                    "  *  "},


                   {" *** ",
                    "*    ",
                    "*    ",
                    "***  ",
                    "   * ",
                    "   * ",
                    "***  "},


                   {"   * ",
                    "  *  ",
                    " *   ",
                    " **  ",
                    "*  * ",
                    "*  * ",
                    " **  "},


                   {"**** ",
                    "   * ",
                    "   * ",
                    "  *  ",
                    "  *  ",
                    " *   ",
                    " *   "},


                   {" **  ",
                    "*  * ",
                    "*  * ",
                    " **  ",
                    "*  * ",
                    "*  * ",
                    " **  "},


                   {" **  ",
                    "*  * ",
                    "*  * ",
                    " **  ",
                    "  *  ",
                    " *   ",
                    "*    "},

    };
}

public class ChislaZvezd {
    static public void main(String args[]) {

        String str = "0123456789";
        int length = str.length();
        Chislo D = new Chislo();
        String[][] massiv = new String[length][7];
        for (int y = 0; y < 7; y++) {
        for (int i = 0; i < length; i++) {
            int[] chisla = new int[length];
           chisla[i] = str.charAt(i) - '0';
                massiv[i][y] = D.mass[i][y];
                System.out.print(massiv[i][y]);
            }
            System.out.println("");
            }
        }
    }



