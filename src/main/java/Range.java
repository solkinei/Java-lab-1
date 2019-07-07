import java.lang.reflect.Array;

public class Range {
    String str;
    Range(String str){
        this.str=str;
    }
    String Unconvolution(String str) {
       int space=str.indexOf('-');
       while(space!=-1){
            int numberStart=Character.getNumericValue(str.charAt(space-1));
            int numberEnd=Character.getNumericValue(str.charAt(space+1));
            String buf="";
            while(numberStart<numberEnd){
                buf=buf+Integer.toString(numberStart)+',';
                numberStart++;
            }
            str=str.substring(0,space-1)+buf+str.substring(space+1);
           space=str.indexOf('-',space);
       }
        return str;
    }

    String Convolution(String str){
        String[] buf=str.split(",");
        for(int i=1;i<buf.length-1;i++){
            if(Integer.valueOf(buf[i])-1==Integer.valueOf(buf[i-1])
                    &&Integer.valueOf(buf[i])+1==Integer.valueOf(buf[i+1])){
                str=str.replace(buf[i],"-");
            }
        }
        str=str.replace(",-","-");
        str=str.replace("--","-");
        str=str.replace("-,","-");
        return str;
    }


    public static void main(String[] args)
    {
        String str=String.valueOf(args[0]);
        Range range=new Range(str);
        String result=range.Convolution(str);
        System.out.println(str+"="+result);
        result = range.Unconvolution(str);
        System.out.println(str+"="+result);
    }
}

