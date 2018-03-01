package Task9;

import com.kovalev.ArrayTools;

import java.util.Arrays;

public class ListChar {

    private int defaultListSize = 30;
    protected char[] listChar;
    private int availableCapacity;

    public ListChar(int size) {

        if (size < 1) {
            return;
        }
        this.listChar = new char[size];
        availableCapacity = size;
    }

    public ListChar() {
        this.listChar = new char[defaultListSize];
        availableCapacity = defaultListSize;
    }


    public boolean add(char e) { // add a new char to list
        if (availableCapacity > 1) {
            for (int i = 0; i < this.getFullSize(); i++) {
                if (this.get(i) == 0) {
                    this.set(i, e);
                    availableCapacity--;
                    return true;
                }
            }
        }
        System.out.println(("Failed to add char: " + e));
        return false;
    }

    public boolean set(int index, char c) { // set a char to a place located by the index
        if (availableCapacity > index) {
            listChar[index] = c;
            availableCapacity--;
            return true;
        }
        return false;
    }

    public char get(int index) { // get a code of char by the index or -1 in case element wasn't found by the index
        return (this.getFullSize() > index) ? listChar[index] : 0;
    }

    public boolean contains(char c) { // true if list contains a char c
        for (char a : listChar) {
             if (a == c) {
                 return true;
             }
        }
        return false;
    }

    public boolean addAll(ListChar listChar1) { // add all elements from another list
        if (getFreeSize() >= listChar1.getFullSize()) {
            int j = 0;
            for (int i = 0; i < listChar1.getFullSize(); i++) {
                while (this.get(j) != '\u0000') {
                    j++;
                }
                this.set(j, (char) listChar1.get(i));
                availableCapacity--;
            }
            System.out.println(Arrays.toString(listChar));
        }
        System.out.println(Arrays.toString(listChar));

        return false;
    }

    public boolean equals(Object obj) { // compare two ListChar
        if (this == obj) {
            return false;
        }
        if (!(obj instanceof ListChar)) {
            return false;
        }

        ListChar c = (ListChar) obj;

        for (int i = 0; i < this.getFullSize(); i++) {
            if (this.get(i) != c.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void clear() { // clear all elements of list
        listChar = new char[defaultListSize];
    }

    public int indexOf(char c) { // return index of found element else if not then -1
        if (this.getFullSize() > 0) {
            for (int i = 0; i < this.getFullSize(); i++) {
                if (this.get(i) == c) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getFullSize() {  // return full size of all list
        return listChar.length;
    }

    public int getFreeSize() { // return number of free elements of list
        return this.availableCapacity;
    }

    public int length1() { // return current size
        return this.getFullSize() - getFreeSize();
    }

    public boolean isEmpty() { // true, if list is empty
        if (this.getFullSize() > 0) {
            for (char a : listChar) {
                if (a != '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }

    public void sort(Direction direction) { // sorting elements inside current list
        for (int i = this.getFullSize() - 1 ; i > 0 ; i--){
            if (direction == Direction.ASC) {
                for (int j = 0 ; j < i ; j++) {
                    if (this.get(j) > this.get(j + 1)) {
                        char tmp = this.get(j);
                        this.set(j, this.get(j + 1));
                        this.set(j + 1, tmp);
                    }
                }
            } else {
                for (int j = 0 ; j < i ; j++) {
                    if (this.get(j) > this.get(j + 1)) {
                        char tmp = this.get(j);
                        this.set(j, this.get(j + 1));
                        this.set(j + 1, tmp);
                    }
                }
            }

        }
    }
}
