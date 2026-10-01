package ru.kirill.chapter12;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode buffer = new ListNode();
        ListNode firtNode = new ListNode(-1, buffer);
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                buffer.next = list1;
                list1 = list1.next;
            } else {
                buffer.next = list2;
                list2 = list2.next;
            }
            buffer = buffer.next;
        }
        if (list1 == null) {
            buffer.next = list2;
        } else {
            buffer.next = list1;
        }
        return firtNode.next.next;
    }
}
