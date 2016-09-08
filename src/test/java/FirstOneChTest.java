import org.junit.Test;

/**
 * Created by orange on 16/8/17.
 */
public class FirstOneChTest {
    @Test
    public void test(){
        FirstOneCh35 onech = new FirstOneCh35();
        char a = onech.FirstNotRepeatingChar("adacdgsafdab");
        System.out.println(a);

    }
    @Test
    public void test1(){
        //存在只出现一次的字符
        FirstOneCh35 onech = new FirstOneCh35();
        char a = onech.FirstNotRepeatingChar("adcdgsfdb");
        System.out.println("test1"+a);

    }


    @Test
    public void test2(){
        //不存在出现一次的字符
        FirstOneCh35 noexist = new FirstOneCh35();
        char a = noexist.FirstNotRepeatingChar("aabbccgg");
        System.out.println("test2"+a);

    }

    @Test
    public void test3(){
        //都只出现一次的字符
        FirstOneCh35 onetime = new FirstOneCh35();
        char a = onetime.FirstNotRepeatingChar("abcdefg");
        System.out.println("test3"+a);

    }

}
