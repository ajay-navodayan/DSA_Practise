import java.util.*;

public class chechPalindrome {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode mid = midNode(head);
        ListNode prev = null;
        ListNode curr = mid.next;
        ListNode next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode lh = head;
        ListNode rh = prev;

        while (rh != null) {
            if (lh.val != rh.val) {
                return false;
            }
            lh = lh.next;
            rh = rh.next;
        }
        return true;
    }

    private ListNode midNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        chechPalindrome obj = new chechPalindrome();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println(obj.isPalindrome(head));
    }
}

