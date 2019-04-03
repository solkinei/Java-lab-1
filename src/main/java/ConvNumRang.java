public class ConvNumRang {
    static String conv( String str){
        String nums = " ";
        int count = 0;
        int inseq =0;
        int i;
        String arr[] = str.split(",");
        for (i = 1; i<arr.length; i++) {
                int j = i - 1;
                int number1 = Integer.parseInt(arr[i]);
                int number2 = Integer.parseInt(arr[j]);
                if (number2 == (number1 - 1)) {
                    if (inseq == 0) {
                        nums += arr[j];
                        inseq = 1;
                    }
                    count++;

                } else {
                    if (count == 1){
                        nums+=",";
                    }else if(count>1){
                        nums+="-";
                    }
                    nums += arr[j] + " ";
                    inseq = 0;
                    count=0;
                }

        }
        if (count == 1){
            nums+=",";
        }else if(count>1){
            nums+="-";
        }
        nums+=arr[i-1]+" ";
        nums = nums.trim();
        nums = nums.replace(" ", ",");
        return nums;
    }
}
