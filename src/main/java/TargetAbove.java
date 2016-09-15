/**
 * Created by orange on 16/9/7.
 * 已排序的学生成绩中,输入一个及格线分数s,判断大于s的个数
 */
public class TargetAbove {
    public int bsearch( int[] a, int v ) {
        int low=0, high=a.length-1;
        int mid = 0;
        while ( low<=high ) {
            int m = (low+high)/2;

            if ( a[m] == v ) {
                while (a[m] >= v) {
                    m--;
                }
                return a.length - m-1;
            }
            else if ( a[m] >  v ) high = m-1;
            else if ( a[m] <  v ) low = m+1;
//            if ( a[m] == v ) return m; else
//            if ( a[m] >  v ) r = m-1; else
//            if ( a[m] <  v ) l = m+1;
        }
        return a.length-low;
    }

    public int bsearchdown(int[] a,int s){
        int left, right;
        left = 0; right = a.length-1;
        int mid = 0;
        while ( left < right ) {
            mid = (left+right+1)/2;
            if (a[mid]<s){
                left= mid;
            }
            else {
                right = mid-1;
            }

        }
        return a.length-mid;
    }
}
