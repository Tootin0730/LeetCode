class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.val);
            copy.next = current.next;
            current.next = copy;
            current = copy.next;
        }
        
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next;
            }
            current = current.next.next;
        }
        
        current = head;
        Node copiedHead = head.next;
        Node copiedCurrent = copiedHead;
        while (current != null) {
            current.next = current.next.next;
            if (copiedCurrent.next != null) {
                copiedCurrent.next = copiedCurrent.next.next;
                copiedCurrent = copiedCurrent.next;
            }
            current = current.next;
        }
        
        return copiedHead;
    }
}
