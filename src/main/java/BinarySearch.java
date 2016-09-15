/**
 * Created by orange on 16/9/13.
 */
public class BinarySearch {
    public static int binaryseach(int[] array,int target){
        int left = 0;
        int right = array.length-1;
        while (left<=right){
            int mid = left+ (right- left)/2;
            if (array[mid]==target){
                return mid;
            }else if (array[mid]>target){
                right = mid-1;
            }else if (array[mid]<target){
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,5,7,9,13};
        int res = binaryseach(arr,8);
        System.out.println(res);
    }
}
