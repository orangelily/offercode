import java.util.*;
/*
 *  猴子丢苹果
 */
public class Apple {
    public int getInitial(int n) {
        // write code here
        if(n<2||n>8) return 0;
        //下一次苹果的n倍+1是上次丢掉一个苹果后的n-1份     
        int sum = 0,averg=0;
        while(sum==0){
            sum = lastApple(n,averg);
            averg++;
        }

        return sum;
    }
    public int lastApple(int n,int averg){
        int sum =0 ;
        for(int m = 0;m<n;m++){
            sum = n*averg+1;//占上一次的n-1份
            if (m==n-1)
                return sum;
            if(sum%(n-1)!=0){
                return 0;
            }else{
                averg = sum/(n-1);
            }
        }
        return sum;
    }
}