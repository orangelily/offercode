import org.junit.Test;

/**
 * Created by orange on 16/8/24.
 */
public class StrToIntTest {
    @Test
    public void test1(){
        StrToInt49 str = new StrToInt49();
        //32位整数中-2147483648到2147 483 647
        int result = str.StrToInt("-2147483648");
        System.out.println(result);
    }
}
