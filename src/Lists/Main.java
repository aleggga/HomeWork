package Lists;

public class Main {

    public static void main(String[] args) {
        DoubleLinkedList dLList =  new DoubleLinkedList();
        dLList.insertBefore("test2");
        dLList.insertBefore("test1");
        dLList.insertAfter("test3");

        System.out.println(dLList.contains("test2"));
        System.out.println(dLList.find("test3"));
        dLList.remove("test3");
        dLList.clear();
        System.out.println(dLList.contains("test1"));

    }
}
