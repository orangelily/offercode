import java.util.ArrayList;
import java.util.List;

/**
 * Created by orange on 16/8/17.
 */
public class FirstOneCh35 {
    public char FirstNotRepeatingChar(String str){
        if (str==null||str.length()==0) return '.';
        String newstr = str.toLowerCase();
        List<Character> list = new ArrayList<Character>();
        for (int i=0;i<newstr.length();i++){
            char ch=newstr.charAt(i);
            if (!list.contains(ch)){
                list.add(Character.valueOf(ch));
            }else {
                list.remove(Character.valueOf(ch));
            }
        }
        if (list.size()>0)
            return list.get(0);
        return '.';
    }
}
