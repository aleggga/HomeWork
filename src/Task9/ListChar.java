package Task9;

import com.kovalev.ArrayTools;

import java.util.Arrays;

public class ListChar {

    private char[] listChar;

    public ListChar(int size) {
        this.listChar = new char[size];
    }

    public ListChar() {
        this.listChar = new char[30];
    }

    private boolean sizeAvailableForMethod(int sizeRequired) {
        return listChar.length >= sizeRequired;
    }

    public boolean add(char e) { // add a new char to list
        if (sizeAvailableForMethod(1)) {
            for (int i = 0; i < listChar.length; i++) {
                if (listChar[i] == 0) {
                    listChar[i] = e;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean set(int index, char c) { // set a char to a place located by the index
        if (listChar.length > index) {
            listChar[index] = c;
            return true;
        }
        return false;
    }

    public char get(int index) { // get a code of char by the index or -1 in case element wasn't found by the index
        return (sizeAvailableForMethod(index)) ? listChar[index] : 0;
    }

    public boolean contains(char c) { // true if list contains a char c
        if (sizeAvailableForMethod(1)) {
            for (char a : listChar) {
                 if (a == c) {
                     return true;
                 }
            }
        }
        return false;
    }

    public boolean addAll(ListChar listChar1) { // add all elements from another list
        if (getFreeSize() >= listChar1.getFullSize()) {
            int j = 0;
            for (int i = 0; i < listChar1.getFullSize(); i++) {
                while (listChar[j] != '\u0000') {
                    j++;
                }
                set(j, (char) listChar1.get(i));
            }
            System.out.println(Arrays.toString(listChar));
        }
        System.out.println(Arrays.toString(listChar));

        return false;
    }

    public boolean equals(ListChar c) { // compare two ListChar
        sort(true);
        c.sort(true);

        for (int i = 0; i < listChar.length; i++) {
            if (listChar[i] != c.get(i)) {
                return false;
            }
        }
        return true;
    }

    public void clear() { // clear all elements of list
        listChar = new char[30];
    }

    public int indexOf(char c) { // return index of found element else if not then -1
        if (sizeAvailableForMethod(1)) {
            for (int i = 0; i < listChar.length; i++) {
                if (listChar[i] == c) {
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
        int emptyValues = 0;

        for (char a : listChar) {
            if (a == 0) {
                emptyValues++;
            }
        }

        return emptyValues;
    }

    public int length1() { // return current size
        return listChar.length - getFreeSize();
    }

    public boolean isEmpty() { // true, if list is empty
        if (listChar.length > 0) {
            for (char a : listChar) {
                if (a != '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }

    public void sort(boolean asc) { // sorting elements inside current list
        for (int i = listChar.length - 1 ; i > 0 ; i--){
            if (asc) {
                for (int j = 0 ; j < i ; j++) {
                    if (listChar[j] > listChar[j + 1]) {
                        char tmp = listChar[j];
                        listChar[j] = listChar[j + 1];
                        listChar[j + 1] = tmp;
                    }
                }
            } else {
                for (int j = 0 ; j < i ; j++) {
                    if (listChar[j] < listChar[j + 1]) {
                        char tmp = listChar[j];
                        listChar[j] = listChar[j + 1];
                        listChar[j + 1] = tmp;
                    }
                }
            }

        }
    }
}
