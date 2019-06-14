public class NumToSymb {
    static void numtosumb(String str) {
        int j, i;
        String[] arr = new String[7];
        for (i = 0; i<7; i++) {
            for (j = 0; j<str.length(); j++) {
                char num = str.charAt(j);
                switch (num) {
                    case '0':
                        arr[0] = "  ***  ";
                        arr[1] = " *   * ";
                        arr[2] = "*     *";
                        arr[3] = "*     *";
                        arr[4] = "*     *";
                        arr[5] = " *   * ";
                        arr[6] = "  ***  ";
                        System.out.print(arr[i]);
                        break;
                    case '1':
                        arr[0] = "   *   ";
                        arr[1] = " * *   ";
                        arr[2] = "   *   ";
                        arr[3] = "   *   ";
                        arr[4] = "   *   ";
                        arr[5] = "   *   ";
                        arr[6] = "  ***  ";
                        System.out.print(arr[i]);
                        break;
                    case '2':
                        arr[0] = "  ***  ";
                        arr[1] = " *   * ";
                        arr[2] = "    *  ";
                        arr[3] = "   *   ";
                        arr[4] = "  *    ";
                        arr[5] = " *     ";
                        arr[6] = " ***** ";
                        System.out.print(arr[i]);
                        break;
                    case '3':
                        arr[0] = "  ***  ";
                        arr[1] = " *   * ";
                        arr[2] = "      *";
                        arr[3] = "   * * ";
                        arr[4] = "      *";
                        arr[5] = " *   * ";
                        arr[6] = "  ***  ";
                        System.out.print(arr[i]);
                        break;
                    case '4':
                        arr[0] = "    *  ";
                        arr[1] = "   **  ";
                        arr[2] = "  * *  ";
                        arr[3] = " *  *  ";
                        arr[4] = " ***** ";
                        arr[5] = "    *  ";
                        arr[6] = "    *  ";
                        System.out.print(arr[i]);
                        break;
                    case '5':
                        arr[0] = " ***** ";
                        arr[1] = " *     ";
                        arr[2] = " ****  ";
                        arr[3] = "     * ";
                        arr[4] = "      *";
                        arr[5] = " *   * ";
                        arr[6] = "  ***  ";
                        System.out.print(arr[i]);
                        break;
                    case '6':
                        arr[0] = "  **   ";
                        arr[1] = " *     ";
                        arr[2] = " *     ";
                        arr[3] = " ****  ";
                        arr[4] = " *   * ";
                        arr[5] = " *   * ";
                        arr[6] = "  ***  ";
                        System.out.print(arr[i]);
                        break;
                    case '7':
                        arr[0] = " ***** ";
                        arr[1] = "     * ";
                        arr[2] = "    *  ";
                        arr[3] = "   *   ";
                        arr[4] = "  *    ";
                        arr[5] = " *     ";
                        arr[6] = " *     ";
                        System.out.print(arr[i]);
                        break;
                    case '8':
                        arr[0] = "  ***  ";
                        arr[1] = " *   * ";
                        arr[2] = " *   * ";
                        arr[3] = "  ***  ";
                        arr[4] = " *   * ";
                        arr[5] = " *   * ";
                        arr[6] = "  ***  ";
                        System.out.print(arr[i]);
                        break;
                    case '9':
                        arr[0] = "  ***  ";
                        arr[1] = " *   * ";
                        arr[2] = " *   * ";
                        arr[3] = "  **** ";
                        arr[4] = "     * ";
                        arr[5] = "     * ";
                        arr[6] = "   **  ";
                        System.out.print(arr[i]);
                        break;
                }
            }
            System.out.println();
        }
    }
}
