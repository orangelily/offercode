import java.util.*;

/**
 * Created by orange on 16/8/17.
 */
public class PrettyName {
    public void prettyname(){
        Scanner cin = new Scanner(System.in);
        List<String> values = new ArrayList<String>();
        while(cin.hasNextInt()){
            int num = cin.nextInt();
            String[] names = new String[num];
            StringBuffer value = new StringBuffer();

            for (int i=0;i<num;i++){
                names[i] = cin.next();
                int result = namevalues(names[i]);
                value.append(" "+result);
            }
            values.add(value.toString());
        }
        for(int l=0;l<values.size();l++ ) {
            System.out.println(values.get(l));
        }
    }
    public int namevalues(String name){
        name = name.toLowerCase();
        char[] c = name.toCharArray();

        Map<Character,Integer> nameValue = new HashMap<Character, Integer>();

        for (int j = 0; j < c.length; j++) {
            if (nameValue.containsKey(c[j])){
                nameValue.put(c[j],nameValue.get(c[j])+1);
            }else {
                nameValue.put(c[j],1);
            }
        }
        List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(nameValue.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int result =0;
        for (int k = 0;k<list.size();k++){
            result = result+list.get(k).getValue()*(26-k);
        }

        return result;
    }
}
