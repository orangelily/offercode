/**
 * 复杂链表的复制
 * 1.在原结点pNode后添加复制的结点pCloneNode:
 *   while(pNode!=null){
 *      pCloneNode.label = pNode.label;
 *      pCloneNode.next = pNode.next;
 *      pCloneNode.random = null;
 *
 *      pNode.next = pCloneNode;
 *      pNode = pCloneNode.next;
 *   }
 * 2.复制原结点pNode.random到pCloneNode.random
 *   while(pNode!=null){
 *       pCloneNode = pNode.next;
 *       if(pNode.random!=null)
 *          pCloneNode.random = pNode.random.next;
 *      pNode = pCloneNode.next;
 *   }
 *
 * 3.拆分链表
 *      if(pNode!=null)
 *          pCloneNode = pCloneHead = pNode.next;
 *   while(pNode!=null){
 *      pCloneNode = pNode.next;
 *      pNode = pCloneNode.next;
 *      pCloneNode.next = pNode.next;
 *   }
 *
 */

public class ListNodeClone26 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    public RandomListNode clone(RandomListNode pHead){
        CloneNodes(pHead);
        CloneRandomNodes(pHead);

        return ReconnectNodes(pHead);
    }
    public void CloneNodes(RandomListNode pHead){
        RandomListNode pNode = pHead;

        while(pNode!=null){
            RandomListNode pCloneNode = new RandomListNode(pNode.label);

            pCloneNode.next = pNode.next;
            pCloneNode.random = null;
            pNode.next = pCloneNode;
            pNode = pCloneNode.next;
        }
    }
    public void CloneRandomNodes(RandomListNode pHead){
        RandomListNode pNode = pHead;

        while(pNode!=null){
            RandomListNode pCloneNode = pNode.next;
            if (pNode.random!=null)
                pCloneNode.random = pNode.random.next;
            pNode = pCloneNode.next;
        }
    }
    public RandomListNode ReconnectNodes(RandomListNode pHead){
        RandomListNode pNode = pHead;
        RandomListNode pCloneHead = null;
        RandomListNode pCloneNode = null;
        if (pNode!=null){
            pCloneNode = pCloneHead = pNode.next;
            pNode.next = pCloneNode.next;
            pNode = pCloneNode.next;
        }
        while(pNode!=null){
            pCloneNode.next = pNode.next;
            pCloneNode = pNode.next;
            pNode = pCloneNode.next;
        }
        return pCloneHead;
    }
}


/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
//public class Solution {
//    public RandomListNode Clone(RandomListNode pHead){
//        if(pHead==null)	return null;
//        RandomListNode pNode = pHead;
//
//        while(pNode!=null){
//            RandomListNode pCloneNode = new RandomListNode(pNode.label);
//            pCloneNode.next = pNode.next;
//            pNode.next = pCloneNode;
//            pNode = pCloneNode.next;
//        }
//        pNode = pHead;
//        while(pNode!=null){
//            RandomListNode pCloneNode = pNode.next;
//            if (pNode.random!=null)
//                pCloneNode.random = pNode.random.next;
//            pNode = pCloneNode.next;
//        }
//        pNode = pHead;
//        RandomListNode pCloneHead = null;
//        RandomListNode pCloneNode = null;
//        if (pNode!=null){
//            pCloneNode = pCloneHead = pNode.next;
//            pNode.next = pCloneNode.next;
//            pNode = pCloneNode.next;
//        }
//        while(pNode!=null){
//            pCloneNode.next = pNode.next;
//            pCloneNode = pNode.next;
//            pNode = pCloneNode.next;
//        }
//        return pCloneHead;
//    }
//}
//
