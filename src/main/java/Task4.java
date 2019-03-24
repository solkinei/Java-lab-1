public class Task4 {
    public static void main(String[] args){
        String input="1,2,4,5,6,7,18,19,20,21";
        String[] arr=input.split(",");          // split string

        int length=0;
        for (String number:arr){                      // calculate string length
            length++;
        }

        int [] arrayOfIntegers=new int[length];
        for (int i=0;i<length;i++)                                  // put all numbers to array of integers
            arrayOfIntegers[i]=Integer.parseInt(arr[i]);

        byte flagForFirst=0;                             // 0 means that 'first' can be rewrited
        int first=0;
        int last=0;
        int count=0;

        for (int i=0;i<length;i++){
            if (flagForFirst==0)
            {
                first=arrayOfIntegers[i];
                flagForFirst=1;
            }
            else if (i==(length-1)&& flagForFirst==1 && count>1) {
                last=arrayOfIntegers[i];
                System.out.print(first + "-" + last + ",");
            }
            else if (arrayOfIntegers[i]-arrayOfIntegers[i-1]==1)
            {
                count++;
                last=arrayOfIntegers[i];
                continue;
            }
            else if (arrayOfIntegers[i]-arrayOfIntegers[i-1]>1 && flagForFirst==1 && count>1)
            {
                last=arrayOfIntegers[i-1];
                System.out.print(first+"-"+last+",");
                first=arrayOfIntegers[i];
                count=1;
            }
            else
            {
                System.out.print(first+","+last+",");
                first=arrayOfIntegers[i];
                count=1;
            }
        }
    }
}
