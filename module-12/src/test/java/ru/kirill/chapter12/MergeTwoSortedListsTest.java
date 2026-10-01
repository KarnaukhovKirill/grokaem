package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class MergeTwoSortedListsTest {

    @Test
    public void test1() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))))), merged);
    }

    @Test
    public void test2() {
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(null, null);
        assertNull(merged);
    }

    @Test
    public void test3() {
        ListNode list2 = new ListNode(1, new ListNode(2));
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(null, list2);
        assertEquals(new ListNode(1, new ListNode(2)), merged);
    }

    @Test
    public void test4() {
        ListNode list1 = new ListNode(1, new ListNode(2));
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(list1, null);
        assertEquals(new ListNode(1, new ListNode(2)), merged);
    }

    @Test
    public void test5() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode list2 = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))), merged);
    }

    @Test
    public void test6() {
        ListNode list1 = new ListNode(5);
        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(7)));
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(new ListNode(1, new ListNode(2, new ListNode(5, new ListNode(7)))), merged);
    }

    @Test
    public void test7() {
        ListNode list1 = new ListNode(-3, new ListNode(0));
        ListNode list2 = new ListNode(-5, new ListNode(-3, new ListNode(10)));
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(list1, list2);
        assertEquals(new ListNode(-5, new ListNode(-3, new ListNode(-3, new ListNode(0, new ListNode(10))))), merged);
    }

    @Test
    public void test8() {
        ListNode a = new ListNode(1);
        ListNode c = new ListNode(3);
        ListNode b = new ListNode(2);
        a.next = c;
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(a, b);
        assertSame(a, merged);
        assertSame(b, merged.next);
        assertSame(c, merged.next.next);
    }
}
