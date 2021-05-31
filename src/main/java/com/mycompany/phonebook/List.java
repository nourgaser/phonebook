package com.mycompany.phonebook;

//Doubly-linked list.
public class List<T> {

    private class Node {

        T data;
        Node prev;
        Node next;

        Node(T d) {
            data = d;
            prev = null;
            next = null;
        }
    }

    public class Iterator {

        private Node current;
        private int position;

        public int getPosition() {
            return position;
        }

        public T getValue() throws Exception {
            if (current == null) {
                throw new Exception("Iterator at an invalid position. Advance to fix (will move to last element).");
            }
            return current.data;
        }

        Iterator(int position) throws ArrayIndexOutOfBoundsException {
            if (position >= length || position < 0 || length == 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (position == length - 1) {
                current = tail;
                position = length - 1;
            }
            current = head;
            this.position = position;
            for (int i = 0; i < position; i++) {
                current = current.next;
            }
        }

        Iterator() throws ArrayIndexOutOfBoundsException {
            if (length == 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            current = head;
            position = 0;
        }

        public Boolean advance() {
            if (position >= length - 1) {
                current = tail;
                position = length - 1;
                return false;
            } else {
                current = current.next;
                position++;
                return true;
            }
        }

        public Boolean advanceBack() {
            if (position <= 0) {
                return false;
            }
            if (position >= length - 1) {
                current = tail;
                position = length - 1;
                return false;
            } else {
                current = current.prev;
                position--;
                return true;
            }
        }
    }
    private Node head, tail;
    public T test;
    private int length;

    public int size() {
        return length;
    }

    List() {
        head = null;
        tail = null;
        length = 0;
    }

    public void pushBack(T newValue) {
        Node newNode = new Node(newValue);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void pushFront(T newValue) {
        Node newNode = new Node(newValue);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public void insert(int pos, T newValue) throws ArrayIndexOutOfBoundsException {
        if (pos > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (pos == 0) {
            pushFront(newValue);
            return;
        }
        if (pos == length) {
            pushBack(newValue);
            return;
        }
        Node curr = head, newNode = new Node(newValue);
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        newNode.prev = curr.prev;
        newNode.next = curr;
        curr.prev.next = newNode;
        curr.prev = newNode;
        length++;
    }

    public void popBack() {
        if (length == 0) {
            return;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null; //Java's automatic GC removes the last node which has no references
        }
        length--;
        System.out.println("Removed at end!");
    }

    public void popFront() {
        if (length == 0) {
            return;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        length--;
        System.out.println("Removed at start!");

    }

    public void remove(int pos) throws ArrayIndexOutOfBoundsException {
        System.out.println("Attempting to remove at " + pos + "!");

        if (pos >= length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (pos == 0) {
            popFront();
            return;
        }
        if (pos == length - 1) {
            popBack();
            return;
        }
        Node curr = head;
        for (int i = 0; i < pos; i++) {
            curr = curr.next;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        curr = null;
        length--;
        System.out.println("Removed at " + pos + "!");
    }

    public Iterator front() {
        return new Iterator();
    }

    public Iterator back() {
        return new Iterator(length - 1);
    }

    public T at(int pos) throws ArrayIndexOutOfBoundsException {
        if (pos >= length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (pos == 0) {
            return head.data;
        }
        if (pos == length - 1) {
            return tail.data;
        }
        Node temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    private Iterator nodeAt(int pos) throws ArrayIndexOutOfBoundsException {
        if (pos >= length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (pos == 0) {
            return new Iterator();
        }
        if (pos == length - 1) {
            return new Iterator(length - 1);
        }
        Iterator temp = new Iterator();
        for (int i = 0; i < pos; i++) {
            temp.advance();
        }
        return temp;
    }

    public void printAll() {
        System.out.println("Contents of list " + this + " are: (size = " + length + ")\n");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data.toString());
            temp = temp.next;
        }
        System.out.println();
    }
}
