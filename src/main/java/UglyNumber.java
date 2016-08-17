/**
 * Created by orange on 16/8/17.
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class UglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if (index<=0) return 0;
        int[] pUglyNumbers = new int[index];
        pUglyNumbers[0] = 1;
        int nextUglyIndex = 1;
        int indexP2=0,indexP3=0,indexP5=0;

        while (nextUglyIndex<index){

            int p2=pUglyNumbers[indexP2];
            int p3=pUglyNumbers[indexP3];
            int p5=pUglyNumbers[indexP5];

            System.out.println("start:"+p2+" "+p3+" "+p5);


            int min = Min(p2*2,p3*3,p5*5);
            pUglyNumbers[nextUglyIndex] = min;
            if (p2*2<=min)
                ++indexP2;
            if (p3*3<=min)
                ++indexP3;
            if (p5*5<=min)
                ++indexP5;
//            System.out.println("end"+p2+" "+p3+" "+p5);
            ++nextUglyIndex;
        }

        return pUglyNumbers[nextUglyIndex-1];
    }
    public int Min(int num1,int num2,int num3){
        int min = (num1<num2)? num1:num2;
        min = (min<num3)?min:num3;
        return min;
    }
    public boolean isUglyNum(int number){
        while (number%2==0){
            number/=2;
        }
        while (number%3==0){
            number/=3;
        }
        while (number%5==0){
            number/=5;
        }
        return  (number==1) ? true:false;
    }
}
