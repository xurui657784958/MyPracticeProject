package util;

class ListNode{
    String val;//员工编号
    ListNode next;

    public ListNode(String i) {
        this.val = i;
    }

    public String getVal() {
        return val;
    }
    public void setVal(String val) {
        this.val = val;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
}