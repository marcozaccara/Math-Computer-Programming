package add_two_numbers_problem;

/*
https://leetcode.com/problems/add-two-numbers/

You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Es n.1
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

Es n.2
Input: l1 = [0], l2 = [0]
Output: [0]

Es n.3
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
*/
public class AddTwoNumbers {

    public ListNode solution(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

    private static ListNode add(ListNode l1, ListNode l2, int carry) {
        int sum;
        if (l1 == null && l2 == null) {
            if (carry != 0)
                return new ListNode(carry);
            else
                return null;
        }
        if (l1 == null) {
            sum = l2.val + carry;
            l2 = l2.next;
        } else if (l2 == null) {
            sum = l1.val + carry;
            l1 = l1.next;
        } else {
            sum = l2.val + l1.val + carry;
            l1 = l1.next;
            l2 = l2.next;
        }
        carry = sum / 10;
        sum = sum % 10;
        ListNode head = new ListNode(sum);
        head.next = add(l1, l2, carry);
        return head;
    }


}
