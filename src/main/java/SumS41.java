import java.util.ArrayList;

/**
 * Created by orange on 16/9/7.
 * 数组中和为S的最小数对，首尾相加
 */
public class SumS41 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> listSum = new ArrayList<Integer>();
        if (array==null||array.length<1)    return listSum;

        int low = 0;
        int high = array.length-1;
        int curSum =0;
        while (high>low){
            curSum = array[low]+array[high];
            if (curSum==sum){
                listSum.add(array[low]);
                listSum.add(array[high]);
            }else if (curSum<sum){
                low++;
            }else {
                high--;
            }
        }

        return listSum;
    }
}
