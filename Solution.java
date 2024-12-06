class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode next = null;
        ListNode prevReverse = null;

        for (int i = left; i <= right; i++) {
            next = curr.next;
            curr.next = prevReverse;
            prevReverse = curr;
            curr = next;
        }

        prev.next.next = curr;t
        prev.next = prevReverse;

        return dummy.next;
    }
}
