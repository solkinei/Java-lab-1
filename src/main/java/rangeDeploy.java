public class rangeDeploy {
   static String rangeDeploy(String in){
        String out="";
        String str[] = in.split(",");
        for( String s : str ) {
            if ( s.contains("-") ) {
                String subStr[] = s.split("-");
                s= "";
                for (int i = Integer.parseInt(subStr[0]); i < Integer.parseInt(subStr[1]); i++) {
                    s= s.concat( String.valueOf(i) +"," );
                }
                s= s.concat( subStr[1] );
            }

            out= out.concat(s + ",");
        }
        out= out.substring(0, out.length()-1);
    return out;
    }

}
