class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;    
		if(l2 == null) return l1;    
        ListNode node = new ListNode(0);
        ListNode c = node;          
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                c.next = l1;
                l1=l1.next;
            }
            else{
                c.next = l2;
                l2 = l2.next;
            }
            c = c.next;
        }
        
        if (l1 != null) {
            c.next = l1;
        } else if (l2 != null) {
            c.next = l2;
        }
        
        return node.next;
        
    }
}