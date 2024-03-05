package homework.leetcode;

public class S0876 {
    // https://leetcode.com/problems/middle-of-the-linked-list/description/

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(2);

    }

    public static ListNode middleNode(ListNode head) {
        // head = {1, 2, 3, 4, 5} -> 3 요소의 개수가 홀수개이면, 중간 인덱스가 그대로 중간 노드가 된다.
        // head = {1, 2, 3, 4, 5, 6} -> 4 요소의 개수가 짝수개이면, 중간 인덱스 + 1 이 중간 노드가 된다.
        int nodeCount = 0;
        ListNode nodeCurrent = head;

        while(nodeCurrent != null) {
            nodeCount++;
            nodeCurrent = nodeCurrent.next;
        }

        int mid = nodeCount/2 + 1;
        nodeCurrent = head;

        for (int i = 1; i < mid; i++) {
            nodeCurrent = nodeCurrent.next;
        }

        return nodeCurrent;
    }
}
