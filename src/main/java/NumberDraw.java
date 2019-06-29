import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberDraw {

    static ArrayList addElement(String path) {
        ArrayList temp = new ArrayList();
        try {
            FileReader fr = new FileReader(path);
            Scanner scan = new Scanner(fr);
            while (scan.hasNextLine()) {
                temp.add(scan.nextLine());
            }
            scan.close();
        }
        catch (Throwable t) {
            System.out.println(t);
        }
        return temp;
    }

    static void PrintNumber(int N, ArrayList[] arr){
        String str = new String();
        for(int i = 0; i < 7; i++){
            int n = N;
            str = "";
            while (n > 0) {
                int temp = n % 10;
                str = arr[temp].get(i) + str;
                n = (n - temp) / 10;
            }
            System.out.println(str);
        }

    }

    public static void main(String[] args) {
        int n = 123456789;//Integer.valueOf(args[0]);
        ArrayList[] arr = new ArrayList[10];
        arr[0] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\zero.txt");
        arr[1] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\one.txt");
        arr[2] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\two.txt");
        arr[3] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\three.txt");
        arr[4] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\four.txt");
        arr[5] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\five.txt");
        arr[6] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\six.txt");
        arr[7] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\seven.txt");
        arr[8] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\eight.txt");
        arr[9] = addElement("C:\\Projects\\Java\\Java-lab-1\\InputNumber\\nine.txt");
        String str = new String();
        PrintNumber(n,arr);
    }
}

