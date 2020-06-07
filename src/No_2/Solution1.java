package No_2;

public class Solution1 {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int x){
            val = x;
        }
    }

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode lr = dummyHead;
        int carry = 0;
        while(l1 != null || l2 != null){
            int v1 = 0;
            int v2 = 0;
            if(l1 != null){
                v1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                v2 = l2.val;
                l2 = l2.next;
            }
            int vr = v1 + v2 + carry;
            lr.next = new ListNode(vr % 10);
            lr = lr.next;
            carry = vr / 10;
        }
        if (carry > 0){
            lr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}

