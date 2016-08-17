import org.junit.Test;

/**
 * Created by orange on 16/8/17.
 */
public class UglyTest {
    @Test
    public void uglytest(){
        UglyNumber ugly = new UglyNumber();
        int num = ugly.GetUglyNumber_Solution(14);
        System.out.println(num);
    }
}
