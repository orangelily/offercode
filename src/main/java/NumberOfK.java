/**
 * Created by orange on 16/8/17.
 */
public class NumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        if (array==null||array.length==0) return 0;

        int first = GetFirstK(array,k,0,array.length-1);
        int last = GetLastK(array,k,0,array.length-1);
        if (first>-1&&last>-1)
            return last-first+1;
        return 0;
    }
    public int GetFirstK(int [] array,int k,int start,int end){
        if (start>end) return -1;
        int middle = (end+start)/2;
        int temp = array[middle];
        if (temp==k) {
            if ((middle > start && array[middle - 1] != k) || middle == start) {
                return middle;
            } else
                end = middle - 1;
        }else if (temp>k)
            end=middle-1;
        else start = middle+1;
        return GetFirstK(array,k,start,end);
    }

    public int GetLastK(int [] array,int k,int start,int end){
        if (start>end) return -1;
        int middle = (end+start)/2;
        int temp = array[middle];
        if (temp==k) {
            if ((middle <end && array[middle + 1] != k) || middle == end) {
                return middle;
            } else
                start = middle + 1;
        }else if (temp<k)
            start=middle+1;
        else end = middle-1;
        return GetLastK(array,k,start,end);
    }
}
