/**
 * Created by orange on 16/8/17.
 */
public class StrToInt49 {
    public int StrToInt(String str) {
        if(str.equals("")||str.length()==0) return 0;
        char[] ch = str.toCharArray();
        boolean  isTrue = true;
        int sign = 0;
        if (ch[0]=='-'){
            sign++;
            isTrue = false;
        }else if(ch[0]=='+'){
            sign++;
         }
        long sum = 0;
        for (int i = sign;i<ch.length;i++){
            if (ch[i]<'0'||ch[i]>'9')
                return 0;
            sum = sum*10+ch[i]-'0';
            if ((isTrue&&sum>0x7FFFFFFF)||(!isTrue&&sum<0x80000000)){
                return 0;
            }

        }
        sum = isTrue? sum:sum*-1;
        int result = Integer.parseInt(String.valueOf(sum));

        return result;
    }
}
