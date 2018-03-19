package Lists;

public class DoubleLinkedList {

    Node head;
    Node tail;

    void insertBefore(String data) {
        Node current = new Node(data);

        if (head == null) {
            head = current;
            tail = current;
            return;
        }

        current.next = head;
        head.previous = current;
        head = current;
    }

    void insertAfter(String data) {
        Node current = new Node(data);

        if (head == null) {
            head = current;
            tail = current;
            return;
        }

        current.previous = tail;
        tail.next = current;
        tail = current;
    }

    boolean contains(String node) {

        Node current = head;

        while (current != null) {
            if (current.getValue().equals(node)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    void remove (String data) {
        if (head.getValue().equals(data)) {
            head = head.next;
            head.previous = null;
            return;
        }
        if (tail.getValue().equals(data)) {
            tail = tail.previous;
            return;
        }

        Node current = head;

        while (current != null) {
            if (current.next.getValue().equals(data)) {
                current.next = current.next.next;
                current.next.next.previous = current.next.previous;
                return;
            }
            current = current.next;
        }
    }

    Node find(String data) {
        Node current = head;

            while (current != null) {
                if (current.getValue().equals(data)) {
                    return current;
                }
                current = current.next;
            }
            return null;
    }

    void clear() {
        head = null;
        tail = null;
    }
}
