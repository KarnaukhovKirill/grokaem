package ru.kirill.chapter12;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListNode)) {
            return false;
        }
        ListNode a = this;
        ListNode b = (ListNode) o;
        while (a != null && b != null) {
            if (a.val != b.val) {
                return false;
            }
            a = a.next;
            b = b.next;
        }
        return a == null && b == null;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        for (ListNode node = this; node != null; node = node.next) {
            hash = 31 * hash + node.val;
        }
        return hash;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (ListNode node = this; node != null; node = node.next) {
            sb.append(node.val);
            if (node.next != null) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
