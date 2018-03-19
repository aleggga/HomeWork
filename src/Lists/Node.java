package Lists;

public class Node {

    Node next;
    Node previous;
    private String value;

    public Node (String value) { this.value = value; }

    public String getValue() { return value; }
}
