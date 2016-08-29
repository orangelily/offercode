
import org.junit.Test;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by orange on 16/8/15.
 */
public class FindBTPathTest {

    @Test
    public void no_path_in_bt(){
        int[] pre = {};
        int[] middle = {};
        ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();
        FindBTPath bt = new FindBTPath();
        FindBTPath.TreeNode root = bt.reConstructBinaryTree(pre,middle);
        bt.PreOrder(root);

        path = bt.FindPath(root,22);
        for (int i=0;i<path.size();i++){
//            System.out.println("binary tree");
            ArrayList<Integer> list = new ArrayList<Integer>();
            list = path.get(i);

            System.out.println(list.toString());
        }

    }

    @Test
    public void many_path_in_bt() {
        int[] pre = {10,5,4,7,12};
        int[] middle = {4,5,7,10,12};
        ArrayList<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();
        FindBTPath bt = new FindBTPath();
        FindBTPath.TreeNode root = bt.reConstructBinaryTree(pre,middle);
        bt.PreOrder(root);

        path = bt.FindPath(root,22);
        for (int i=0;i<path.size();i++){
//            System.out.println("binary tree");
            ArrayList<Integer> list = new ArrayList<Integer>();
            list = path.get(i);

            System.out.println(list.toString());
        }

    }
}
