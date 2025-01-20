/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // two pointers
        // 使用dummy作为list的首个node,并指向head
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode left = dummy;
        // 右指针指向head
        ListNode right = head;

        // 求right指针应所在的位置
        // right指针需要表示为：比left右移了n个位置
        // 用循环来得到该位置
        // 在n大于0且right不为空的前提下使用loop实现
        while (n > 0 && right !=null) {
            right = right.next;
            // 每次循环，right都右移一位，并且n递减；
            // 这样保证right指针是比left指针 shift n个位置
            n -= 1;
            // 直到right指针指向null
            // 此时我们的left指针指向了待被删除的node
        }

        // loop直到right指针指到null，此时left指针指向待删除的node
        while (right != null) {
            left = left.next;
            right = right.next;
        }

        // 上述循环结束，找到待删除的node
        // 开始删除操作
        left.next = left.next.next;

        // return the head of the lost
        return dummy.next;
    }
}