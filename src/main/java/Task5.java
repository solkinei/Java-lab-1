public class Task5 {

    static String[] zero = {
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
    };
    static String[] one = {
            "  *  ",
            " **  ",
            "* *  ",
            "  *  ",
            "  *  ",
            "  *  ",
            "*****"
    };
    static String[] two = {
            " *** ",
            "*   *",
            "   * ",
            "  *  ",
            " *   ",
            "*    ",
            "*****",
    };
    static String[] three = {
            " *** ",
            "*   *",
            "    *",
            "   * ",
            "    *",
            "*   *",
            " *** ",
    };
    static String[] four = {
            "   * ",
            "  ** ",
            " * * ",
            "*  * ",
            "*****",
            "   * ",
            "   * ",
    };
    static String[] five = {
            "*****",
            "*    ",
            "*    ",
            "**** ",
            "    *",
            "    *",
            "****",
    };
    static String[] six = {
            " ****",
            "*    ",
            "*    ",
            "**** ",
            "*   *",
            "*   *",
            " *** ",
    };
    static String[] seven = {
            "*****",
            "    *",
            "   * ",
            "  *  ",
            " *   ",
            "*    ",
            "*    ",
    };
    static String[] eight = {
            " *** ",
            "*   *",
            "*   *",
            " *** ",
            "*   *",
            "*   *",
            " *** ",
    };
    static String[] nine = {
            " *** ",
            "*   *",
            "*   *",
            " ****",
            "    *",
            "    *",
            "****",
    };

    private static void Draw(String args) {
        String[] number = args.split("");
        for (int i = 0; i < 7; i++) {
            System.out.print("\n");
            for (int j = 0; j < number.length; j++) {
                switch (number[j]) {
                    case "0":
                        System.out.print(zero[i] + " ");
                        break;
                    case "1":
                        System.out.print(one[i] + " ");
                        break;
                    case "2":
                        System.out.print(two[i] + " ");
                        break;
                    case "3":
                        System.out.print(three[i] + " ");
                        break;
                    case "4":
                        System.out.print(four[i] + " ");
                        break;
                    case "5":
                        System.out.print(five[i] + " ");
                        break;
                    case "6":
                        System.out.print(six[i] + " ");
                        break;
                    case "7":
                        System.out.print(seven[i] + " ");
                        break;
                    case "8":
                        System.out.print(eight[i] + " ");
                        break;
                    case "9":
                        System.out.print(nine[i] + " ");
                        break;
                }
            }
        }
        System.out.print("\n");
    }
}