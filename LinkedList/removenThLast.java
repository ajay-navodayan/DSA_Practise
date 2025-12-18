import java.util.*;

public class removenThLast {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }

        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int idxRemove = count - n;
        if (idxRemove == 0) {
            return head.next;
        }

        ListNode prev = head;
        for (int i = 1; i < idxRemove; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
        return head;
    }

    public static void main(String[] args) {
        removenThLast obj = new removenThLast();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode res = obj.removeNthFromEnd(head, 2);
        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}
