/**
 * 21.合并两个有序链表 Simple
 * */
public class ListNode {
    private ListNode head = null;

    Integer val;
    ListNode next;

    public ListNode(Integer val) {
        this.val = val;
    }

    public ListNode(Integer val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }

    public void addFirst(Integer val) {
        head = new ListNode(val, head);
    }

    public ListNode getterHear() {
        return this.head;
    }

    public static void main(String[] args) {
        MergeTwoLists mt = new MergeTwoLists();
        ListNode ln1 = new ListNode();
        ln1.addFirst(4);
        ln1.addFirst(2);
        ln1.addFirst(1);

        ListNode ln2 = new ListNode();
        ln2.addFirst(4);
        ln2.addFirst(3);
        ln2.addFirst(1);

        ListNode result = mt.mergeTwoLists(ln1.getterHear(), ln2.getterHear());
    }
}

class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {return list2;}
        if (list2 == null) {return list1;}

        ListNode head = new ListNode();
        head.next = list1.val < list2.val ? list1 : list2;

        ListNode temp = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
            if (temp.next == null) {
                temp.next = list1 == null ? list2 : list1;
            }

        }
        return head.next;
    }
}


