package implementation;

import java.util.Iterator;

/**
 *
 * @author hkhoi
 */
public class LinkedList implements Iterable<Integer> {

    protected Node root;
    protected Node tail;

    public void add(int value) {
        Node instance = new Node(value);
        if (root == null) {
            root = instance;
            tail = instance;
        } else {
            tail.next = instance;
            tail = tail.getNext();
        }
    }

    public void addFirst(int value) {
        Node instance = new Node(value);
        instance.next = root;
        root = instance;

        if (root.getNext() == null) {
            tail = root;
        }
    }

    public void addLast(int value) {
        Node instance = new Node(value);
        if (root == null) {
            root = instance;
            tail = instance;
        } else {
            tail.next = instance;
            tail = instance;
        }
    }

    public void remove(int index) {
        if (root == null) {
        } else if (index == 0) {
            removeFirst();
        } else {
            Node iterator = root;
            for (int i = 1; i < index; ++i) {
                iterator = iterator.getNext();
            }

            boolean isTailRemoved = false;

            if (iterator.getNext().getNext() == null) {
                isTailRemoved = true;
            }
            iterator.removeNext();
            if (isTailRemoved) {
                tail = iterator;
            }
        }
    }

    public void removeFirst() {
        if (root == null) {
        } else {
            root = root.getNext();
            if (root == null) {
                tail = null;
            } else if (root.getNext() == null) {
                tail = root;
            }
        }
    }

    public void removeLast() {
        if (root == null) {
        } else if (root == tail) {
            root = null;
            tail = null;
        } else {
            Node iterator = root;
            while (iterator.getNext().getNext() != null) {
                iterator = iterator.getNext();
            }

            iterator.removeNext();
            tail = iterator;
        }
    }
    
    public Node getNode(int index) {
        Node iterator = root;
        while (index-- > 0) {
            iterator = iterator.next;
        }
        
        return iterator;
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        Node iterator = root;
        
        while (iterator != null) {
            builder.append(iterator.getValue() + " ");
            iterator = iterator.getNext();
        }
        
        return builder.toString();
    }
    
    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator();
    }
    
    private class LinkedListIterator implements Iterator<Integer> {

        Node iterator = root;

        @Override
        public boolean hasNext() {
            return (iterator != null);
        }

        @Override
        public Integer next() {
            int result = iterator.getValue();
            iterator = iterator.getNext();
            return result;
        }
    }

    public class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        
        public void removeNext() {
            if (next != null) {
                Node skip = next.next;
                next = skip;
            }
        }

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setNext(Node next) {
            this.next = next;
        }
        
        @Override
        public String toString() {
            return "This = " + value;
        }

        @Override
        protected void finalize() throws Throwable {
            super.finalize(); //To change body of generated methods, choose Tools | Templates.
            System.out.println("Final");
        }
    }
}
