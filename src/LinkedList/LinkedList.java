package LinkedList;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList implements Collection {

    private Node head = null;
    private Node tail = null;
    private int size = 1;


    @Override
    public int size() {
        return size;
    }

    public void push(Object object) {
        head = new Node(object, head);
        size++;

        if (tail == null) {
            tail = head;
        }
    }


    @Override
    public boolean isEmpty() {
        return size()==0;
    }

    @Override
    public boolean contains(Object o) {
        Node thisNode = head;

        while (thisNode != null) {
            if (thisNode.getData().equals(o)) {
                return true;
            }

            thisNode = thisNode.getNext();
        }

        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private Node node = head;

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Object next() {
                Object currentData = node.getData();
                node = node.getNext();
                return currentData;
            }
        };
    }

    @Override
    public Object[] toArray(Object[] a) {
        if (a.length <= size) {
            return toArray();
        }

        int i = 0;
        Node currentNode = head;

        while (currentNode != null) {
            a[i] = currentNode.getData();
            i++;
            currentNode = currentNode.getNext();
        }

        for (; i < a.length; i++) {
            a[i] = null;
        }

        return a;
    }

    @Override
    public Object[] toArray() {
        Object[] arrayObject = new Object[size];

        if (size == 0) {
            return arrayObject;
        }

        int i = 0;
        Node currentNode = head;

        while (currentNode != null) {
            arrayObject[i] = currentNode.getData();
            currentNode = currentNode.getNext();
            System.out.print(arrayObject[i]+", ");
            i++;
        }

        return arrayObject;
    }

    @Override
    public boolean add(Object o) {

        if (head == null) {
            head = new Node(o);
            tail = head;
//            size = 0;
            return true;
        }

        Node oldTail = tail;
        tail = new Node(o);
        oldTail.setNext(tail);

        size++;

        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        String delimiter = "";

        Node currentNode = head;

        while (currentNode != null) {
            result.append(delimiter).append(currentNode);
            delimiter = "; ";

            currentNode = currentNode.getNext();
        }

        result.append("]");
        return result.toString();
    }


    @Override
    public boolean remove(Object o) {
        if (head==null){
            System.out.println("Linked list is empty");
        }

        Node thisNode = head;

        while (thisNode != null) {
            if (thisNode.getData().equals(o)) {
                Node removeNode = thisNode;

                thisNode = thisNode.getNext();
                thisNode=null;
                } else {
                thisNode = thisNode.getNext();
            }

        }
        return false;
    }


    @Override
    public boolean addAll(Collection c) {
        if (c==null){
        return false;
        }

        Object[] newArray = c.toArray();

        for (Object element : newArray) {
            add(element);
        }

        return true;
    }

    @Override
    public void clear() {
        head=null;
        tail=null;
        size=0;
    }
    @Override
    public boolean retainAll(Collection c) {
        Node thisNode = head;

        while (thisNode != null) {
            if (!c.contains(thisNode.getData())) {
                Node removeNode = thisNode;

                thisNode = thisNode.getNext();

                thisNode=null;
            } else {
                thisNode = thisNode.getNext();
            }
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        if (c == null) {
            return false;
        }

        Node thisNode = head;

        while (thisNode!= null) {
            if (c.contains(thisNode.getData())) {
                Node removeNode = thisNode;

                thisNode = thisNode.getNext();

            } else {
                thisNode= thisNode.getNext();
            }
        }

        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        if (c == null) {
            return false;
        }
        if (c.size() == 0) {
            return false;
        }

        Object[] newArray = c.toArray();

        for (Object element : newArray) {
            if (!contains(element)) {
                return false;
            }
        }

        return true;
    }
}
