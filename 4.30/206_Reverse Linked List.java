class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode new_head = null;
        while(head!=null){
            ListNode tmp = head;
            head = head.next;
            tmp.next = new_head;
            new_head = tmp;
        }
        return new_head;
    }
}
