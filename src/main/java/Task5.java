class Stars {
    static String [] zero = {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
    };
    static String [] one = {
            " * ",
            "** ",
            " * ",
            " * ",
            " * ",
            " * ",
            "***"
    };
    static String [] two = {
            " *** ",
            "*   *",
            "*  * ",
            "  *  ",
            " *   ",
            "*    ",
            "*****"
    };
    static String [] three = {
            " *** ",
            "*   *",
            "    *",
            "   * ",
            "    *",
            "*   *",
            " *** "
    };
    static String [] four = {
            "   *  ",
            "  **  ",
            " * *  ",
            "*  *  ",
            "******",
            "   *  ",
            "   *  "
    };
    static String [] five = {
            "*****",
            "*    ",
            "*    ",
            "**** ",
            "    *",
            "*   *",
            " *** "
    };
    static String [] six = {
            " *** ",
            "*   *",
            "*    ",
            "**** ",
            "*   *",
            "*   *",
            " *** "
    };
    static String [] seven = {
            "*****",
            "    *",
            "   * ",
            "  *  ",
            " *   ",
            "*    ",
            "*    "
    };
    static String [] eight = {
            " *** ",
            "*   *",
            "*   *",
            " *** ",
            "*   *",
            "*   *",
            " *** "
    };
    static String [] nine = {
            " ****",
            "*   *",
            "*   *",
            " ****",
            "    *",
            "    *",
            "    *"
    };
}

public class Task5 {
    public static void main(String [] args) {
        String str = "41072819";
        String [] arr = str.split("");
        for(int i = 0; i < 7; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("0")) {
                    System.out.print(Stars.zero[i]);
                }
                else if (arr[j].equals("1")) {
                    System.out.print(Stars.one[i]);
                }
                else if (arr[j].equals("2")) {
                    System.out.print(Stars.two[i]);
                }
                else if (arr[j].equals("3")) {
                    System.out.print(Stars.three[i]);
                }
                else if (arr[j].equals("4")) {
                    System.out.print(Stars.four[i]);
                }
                else if (arr[j].equals("5")) {
                    System.out.print(Stars.five[i]);
                }
                else if (arr[j].equals("6")) {
                    System.out.print(Stars.six[i]);
                }
                else if (arr[j].equals("7")) {
                    System.out.print(Stars.seven[i]);
                }
                else if (arr[j].equals("8")) {
                    System.out.print(Stars.eight[i]);
                }
                else if (arr[j].equals("9")) {
                    System.out.print(Stars.nine[i]);
                }
                if(j==arr.length-1){
                    System.out.println();
                }
            }
        }
    }
}
