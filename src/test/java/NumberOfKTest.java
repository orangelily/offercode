import org.junit.Test;

/**
 * Created by orange on 16/8/17.
 */
public class NumberOfKTest {


    @Test
    public void test_null_arr_contain_k(){
        NumberOfK numberOfK = new NumberOfK();
        int[] array = {};
        int number=numberOfK.GetNumberOfK(array,6);
        System.out.println(number);
    }
    @Test
    public void test_arr_with_one_not_contain_k(){
        NumberOfK numberOfK = new NumberOfK();
        int[] array = {1};
        int number=numberOfK.GetNumberOfK(array,6);
        System.out.println(number);
    }

    @Test
    public void test_arr_with_many_not_contain_k(){
        NumberOfK numberOfK = new NumberOfK();
        int[] array = {1,2,3,3,3,3,4,5,7};
        int number=numberOfK.GetNumberOfK(array,6);
        System.out.println(number);
    }

    @Test
    public void test_contains_one_k(){
        NumberOfK numberOfK = new NumberOfK();
        int[] array = {1,2,3,3,3,3,4,5};
        int number=numberOfK.GetNumberOfK(array,2);
        System.out.println(number);
    }



    @Test
    public void test_contains_many_k(){
        NumberOfK numberOfK = new NumberOfK();
        int[] array = {1,2,3,3,3,3,4,5};
        int number=numberOfK.GetNumberOfK(array,3);
        System.out.println(number);
    }
}
