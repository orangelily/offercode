/**
 * Created by orange on 16/9/15.
 */

public class MyList {
    public class Node {
        int val = 0;
        Node next;

        public Node() {

        }

        public Node(int val,Node next) {
            this.val = val;
            this.next = next;
        }
    }
    public Node header;

    public MyList(int[] vals){
        header = new Node(-1,null);
        Node next = header;
         for (int i = 0;i<vals.length;i++){
             Node temp = new Node(vals[i],null);
             next.next = temp;
             next = temp;
         }
        next=null;
    }
}
