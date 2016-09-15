import java.util.Scanner;

/**
 * Created by orange on 16/9/14.
 */
public class Factorial {
//输入正整数N

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        int nextSum = 1;
        for (i=1;i<=n;i++){
            nextSum = nextSum*i;
            sum+= nextSum;
        }
        System.out.println("sum = "+sum);

    }

}
