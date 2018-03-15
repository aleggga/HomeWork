package classwork;

/**
 * Created by User on 15.03.2018.
 */
public class SLL {
    Node head;
    private int counter = 0;

    void add(String data) {
        Node current = new Node(data);

        if (head == null) {
            head = current;
            counter++;
            return;
        }

        current.next = head;
        head = current;
        counter++;
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

    void remove(String data) {

        if (head.getValue().equals(data)) {
            head = head.next;
            counter--;
            return;
        }

        Node current = head;

        while (current != null) {
            if (current.next.getValue().equals(data)) {
                current.next = current.next.next;
                counter--;
                return;
            }
            current = current.next;
        }
    }

    Node[] toArray() {
        Node current = head;
        Node[] arr = new Node[counter];

        for (int i = 0; current != null; i++) {
            arr[i] = current;
            current = current.next;
        }
        return arr;
    }
}

package classwork;

/**
 * Created by User on 15.03.2018.
 */
public class Node {
    Node next;
    private String value;



    public Node (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

package classwork;

/**
 * Created by User on 15.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        SLL sll = new SLL();

        sll.add("text1");
        sll.add("text2");
        sll.add("text3");

        sll.remove("text2");
        showList(sll);



    }

    static void showList(SLL sll) {
        for (Node n : sll.toArray()) {
            System.out.println(n.getValue());
        }
    }
}
