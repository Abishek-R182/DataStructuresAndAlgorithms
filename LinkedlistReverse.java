public class LinkedlistReverse {
     static class ListNode {
         int value = 1;
         ListNode next;

         ListNode(int value) {
             this.value = value;
         }
     }

     public static ListNode reverse(ListNode head){
                ListNode current = head;
                ListNode previous = null;
                ListNode next = null;

                while(current!=null){
                    next=current.next;
                    current.next=previous;
                    previous = current;
                    current=next;

                }
                return previous;
            }

            public static void main(String[] args){
                ListNode head = new ListNode(2);
                head.next= new ListNode(4);
                head.next.next = new ListNode(6);
                head.next.next.next = new ListNode(8);
                head.next.next.next.next = new ListNode(10);

                ListNode result = LinkedlistReverse.reverse(head);
                while(result!=null){
                    System.out.println(result.value + "");
                    result=result.next;
                }
            }



}
