import org.junit.Test;

/**
 * Created by orange on 16/9/15.
 */
public class MyListTest {

    @Test
    public void test(){
        int[] vals = {1,2,3,4,5,6};
        MyList list = new MyList(vals);
        MyList.Node head = list.header;
        while (head.next!=null){
            System.out.println(head.next.val);
            head = head.next;
        }

    }

}
