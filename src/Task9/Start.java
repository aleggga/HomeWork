package Task9;

public class Start {
    public static void main(String[] args) {
//        ListCharExtended listChar1Extended = new ListCharExtended();
//        System.out.println(listChar1Extended.add('A'));
//        System.out.println(listChar1Extended.add('B'));
//        System.out.println(listChar1Extended.add('C'));
//        ListCharExtended listChar2Extended = new ListCharExtended();
//        System.out.println(listChar2Extended.add('A'));
//        System.out.println(listChar2Extended.add('B'));
//        System.out.println(listChar2Extended.add('C'));

        ListChar listChar1 = new ListChar(2);
        listChar1.add('z');
        ListChar listChar2 = new ListChar();
        listChar2.add('a');
        listChar2.add('b');
        listChar2.add('c');
        listChar1.addAll(listChar2);
        listChar2.addAll(listChar1);
//        System.out.println(listChar1Extended.equals(listChar2Extended));
//        System.out.println(listChar1Extended.add('A'));
//        System.out.println(listChar1Extended.add('Z'));
    }
}
