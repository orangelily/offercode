import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by orange on 16/8/15.
 */
public class VerifyBSTTest {
    //测试用例

    @Test
    public void nullArr() {
        VerifyBST bst = new VerifyBST();
        //* 空数组,所有结点都没有
        int[] nullArr = {};
        System.out.println(bst.VerifySquenceOfBST(nullArr));

    }
    @Test
    public void onenode_in_Arr() {
        VerifyBST bst = new VerifyBST();

        //*完全二叉树
        int[] avlArr = {1,3,2,5,7,6,4};
        System.out.println(bst.VerifySquenceOfBST(avlArr));

        //* 只有一个结点
        int[] a = {1};
        System.out.println(bst.VerifySquenceOfBST(a));
        //*无对应二叉搜索树
        int[] b = {7,4,6,5};
        System.out.println(bst.VerifySquenceOfBST(b));
    }
    @Test
    public void avl_in_Arr() {
        VerifyBST bst = new VerifyBST();

        //*完全二叉树
        int[] avlArr = {1,3,2,5,7,6,4};
        System.out.println(bst.VerifySquenceOfBST(avlArr));
         //*无对应二叉搜索树
        int[] b = {7,4,6,5};
        System.out.println(bst.VerifySquenceOfBST(b));
    }

    @Test
    public void non_bst() {
        VerifyBST bst = new VerifyBST();
        //*无对应二叉搜索树
        int[] b = {1,7,4,8,10,9,5};
        System.out.println(bst.VerifySquenceOfBST(b));
    }

}
