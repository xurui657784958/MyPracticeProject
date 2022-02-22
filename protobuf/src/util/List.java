package util;

import com.sun.org.apache.xpath.internal.operations.UnaryOperation;

public class List {

    ListNode head = null;
    public void addNode(String val){
    ListNode listNode = new ListNode("");
        if (head == null){
            head = listNode;
            return;
        }else {
            ListNode tempListNode = head;
            while (tempListNode.next!=null){
                tempListNode = tempListNode.next;
            }
            tempListNode.next = listNode;
        }
    }
}
