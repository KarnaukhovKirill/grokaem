package ru.kirill.chapter12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLinkedListTest {

    @Test
    public void test1() {
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode()));
        ListNode reversed = ReverseLinkedList.reverseList(listNode);
        assertEquals(new ListNode(0, new ListNode(2, new ListNode(1))), reversed);
    }

    @Test
    public void test2() {
        ListNode listNode = new ListNode(1);
        ListNode reversed = ReverseLinkedList.reverseList(listNode);
        assertEquals(new ListNode(1), reversed);
    }
}
