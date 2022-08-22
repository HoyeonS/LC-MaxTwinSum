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
    public int pairSum(ListNode head) {
        
        ListNode trv = head;
        
        
        int count = 0;
        while(trv != null) {
            count++;
            trv = trv.next;
        }
        //traversal to check the length
        int[] sum = new int[count/2];
        count = 0;
        
        trv = head;
        int max = 0;
        
        while(trv != null) {
            if(count < sum.length)
                sum[count] += trv.val;
            else {
                if( max < sum[2 * sum.length - 1 - count] + trv.val)
                    max = sum[2 * sum.length - 1 - count] + trv.val;
            }
            trv = trv.next;
            count++;
        }
        // take the max with storing value of half of the linked list.
        return max;
    }
}

