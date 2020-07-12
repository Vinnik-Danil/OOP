package BinaryTree;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class BinaryTree implements Set {
    /*
        private Node root;
        private int sizeOfNode=0;

        @Override
        public boolean add(Object o) {

            Integer data = (Integer) o;

            Node newNode = new Node(data);

            if(root == null){
                root  = newNode;
            }else{
                appendToNode(data, root);
            }
            sizeOfNode++;
            return true;
        }


        private void appendToNode(int toAdd, Node node){

            if(node.data == toAdd){
                return;
            }
            else if(node.data > toAdd){
                if (node.left == null){
                    node.left = new Node(toAdd);
                }
                else {
                    appendToNode(toAdd, node.left);
                }
            }
            else {
                if (node.right == null){
                    node.right = new Node(toAdd);
                }
                else {
                    appendToNode(toAdd, node.right);
                }

            }

        }

        @Override
        public boolean contains(Object o) {
            if (root == null){
            return false;
            }
            return containsIn((Integer) o, root);
        }

        private boolean containsIn(Integer i, Node node) {
            if (root==null){
            return false;
            }

            if (node.data == i){
                return true;
            }

            else if(node.data>i){
                return containsIn(i, node.left);
            }

            else {
                return containsIn(i, node.right);
            }
        }

        @Override
        public String toString(){
            print(root);
            return null;
        }

        private void print(Node node){
            if(node==null){
                return;
            }
            print(node.left);
            System.out.println(node.data);
            print(node.right);
        }


        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public int size() {
            return sizeOfNode;
        }

        @Override
        public boolean isEmpty() {
            return sizeOfNode==0;
        }

        @Override
        public Iterator iterator() {
            return null;
        }



        @Override
        public boolean remove(Object o) {
            return true;
            }

        @Override
        public boolean addAll(Collection c) {

            if (c == null || c.size() == 0) {
                return false;
            }


            boolean isAdded = false;

            Object[] newArray = c.toArray();

            for (Object element : newArray) {
                boolean added = add(element);

                isAdded = true;

            }

            return isAdded;
        }

        @Override
        public void clear() {
            sizeOfNode = 0;
        }

        @Override
        public boolean removeAll(Collection c) {
            if (c == null || c.size() == 0 || root == null) {
                return false;
            }

            for (Object o : c) {
                if (c.contains(o)) {
                        return true;
                }
            }
            return false;

    //        Object[] coll = c.toArray();
    //
    //        for (int i = 0; i <sizeOfNode ; i++) {
    //
    //        }coll

        }

        @Override
        public boolean retainAll(Collection c) {
            if (c == null || c.size() == 0 || root == null) {
                return false;
            }

            boolean isRemoved = false;

            for (Object o : this) {
                if (!c.contains(o)) {
                    boolean removed = remove(o);

                    if (removed) {
                        isRemoved = true;
                    }
                }
            }

            return isRemoved;
        }

        @Override
        public boolean containsAll(Collection c) {
            Object[] newArray = c.toArray();

            for (Object element : newArray) {
                if (!contains(element)) {
                    return false;
                }
            }

            return true;
        }

        @Override
        public Object[] toArray(Object[] a) {
            Object[] array = new Object[sizeOfNode];

            int i = 0;

            for (Object data : this) {
                array[i] = data;
                i++;
            }

            return array;
        }


        public void remove(int key)
        {
            sizeOfNode--;
            root = deleteRec(root, key);
        }
        private Node deleteRec(Node root, int key) {

            if (root == null)  return root;

            if (key < root.data)
                root.left = deleteRec(root.left, key);
            else if (key > root.data)
                root.right = deleteRec(root.right, key);
            else
            {
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;
                    root.data = minValue(root.right);

                root.right = deleteRec(root.right, root.data);
            }

            return root;
        }

        private int minValue(Node root)
        {
            int minv = root.data;
            while (root.left != null)
            {
                minv = root.left.data;
                root = root.left;
            }
            return minv;
        }


    */
//    private class Node{
//        int data;
//        Node left;
//        Node right;
//
//        public Node(int data){
//            this.data = data;
//        }
//    }

    private Node root = null;
    private int size = 0;

    private Node getMostLeft(Node root) {
        if (root == null || root.left == null) {
            return root;
        } else {
            return getMostLeft(root.left);
        }
    }

    private int compareObjects(Object o1, Object o2) {
        if (!(o2 instanceof Comparable)) {
            return -1;
        }
        if (!(o1 instanceof Comparable)) {
            return 1;
        }

        if (o1 instanceof Number && o2 instanceof Number) {
            Number n1 = (Number) o1;
            Number n2 = (Number) o2;
            if (n1.doubleValue() < n2.doubleValue()) {
                return -1;
            } else if (n1.doubleValue() > n2.doubleValue()) {
                return 1;
            } else {
                return 0;
            }
        }
        if (o1.getClass() == o2.getClass()) {
            return ((Comparable) o1).compareTo(o2);
        }

        if (o1 instanceof Number) {
            return -1;
        } else if (o2 instanceof Number) {
            return 1;
        }

        return 0;
    }

    private boolean appendToTree(Object data, Node root) {
        if (root.data.equals(data)) {
            return false;
        }
        if (compareObjects(root.data, data) < 0) {
            if (root.right == null) {
                root.right = new Node(data, root);
                size++;
                return true;
            } else {
                return appendToTree(data, root.right);
            }
        } else {
            if (root.left == null) {
                root.left = new Node(data, root);
                size++;
                return true;
            } else {
                return appendToTree(data, root.left);
            }
        }
    }

    private boolean removeFromTree(Object data, Node root) {
        if (root.data.equals(data)) {
            if (root.right != null) {
                root.right.root = root.root;

                if (root.left != null) {
                    Node mostLeftOfRight = getMostLeft(root.right);
                    mostLeftOfRight.left = root.left;
                    mostLeftOfRight.left.root = mostLeftOfRight;
                }

                if (root.root != null) {
                    if (root.root.left == root) {
                        root.root.left = root.right;
                    } else {
                        root.root.right = root.right;
                    }
                } else {
                    this.root = root.right;
                }
            } else if (root.left != null) {
                root.left.root = root.root;

                if (root.root != null) {
                    if (root.root.left == root) {
                        root.root.left = root.left;
                    } else {
                        root.root.right = root.left;
                    }
                } else {
                    this.root = root.left;
                }
            } else {
                if (root.root != null) {
                    if (root.root.left == root) {
                        root.root.left = null;
                    } else {
                        root.root.right = null;
                    }
                } else {
                    this.root = null;
                }
            }

            size--;
            return true;
        }

        if (compareObjects(root.data, data) < 0) {
            if (root.right == null) {
                return false;
            } else {
                return removeFromTree(data, root.right);
            }
        } else {
            if (root.left == null) {
                return false;
            } else {
                return removeFromTree(data, root.left);
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Object data : this) {
            if (data.equals(o)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private Node node = getMostLeft(root);

            @Override
            public boolean hasNext() {
                return node != null;
            }

            @Override
            public Object next() {
                Object currentData = node.data;

                if (node.right == null) {

                    for (; ; ) {
                        Node currentNode = node;
                        node = node.root;

                        if (node == null) {
                            break;
                        }
                        if (node.right != currentNode) {
                            break;
                        }
                    }
                } else {
                    node = getMostLeft(node.right);
                }

                return currentData;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];

        int i = 0;

        for (Object data : this) {
            array[i] = data;
            i++;
        }

        return array;
    }

    @Override
    public boolean add(Object o) {
        if (o == null) {
            return false;
        }

        if (root == null) {
            root = new Node(o);
            size++;
            return true;
        }

        return appendToTree(o, root);
    }

    @Override
    public boolean remove(Object o) {
        if (o == null || root == null) {
            return false;
        }

        return removeFromTree(o, root);
    }

    @Override
    public boolean addAll(Collection c) {
        if (c == null || c.size() == 0) {
            return false;
        }

        boolean isAdded = false;

        Object[] newArray = c.toArray();

        for (Object element : newArray) {
            boolean added = add(element);

            if (added) {
                isAdded = true;
            }
        }

        return isAdded;
    }

    @Override
    public boolean retainAll(Collection c) {
        if (c == null || c.size() == 0 || root == null) {
            return false;
        }

        boolean isRemoved = false;

        for (Object o : this) {
            if (!c.contains(o)) {
                boolean removed = remove(o);

                if (removed) {
                    isRemoved = true;
                }
            }
        }

        return isRemoved;
    }

    @Override
    public boolean removeAll(Collection c) {
        if (c == null || c.size() == 0 || root == null) {
            return false;
        }

        boolean isRemoved = false;

        Object[] newArray = c.toArray();

        for (Object element : newArray) {
            boolean removed = remove(element);

            if (removed) {
                isRemoved = true;
            }
        }

        return isRemoved;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public boolean containsAll(Collection c) {
        if (c == null || c.size() == 0) {
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

    @Override
    public Object[] toArray(Object[] a) {
        if (a.length < size) {
            return toArray();
        }

        int i = 0;

        for (Object data : this) {
            a[i] = data;
            i++;
        }

        for (; i < a.length; i++) {
            a[i] = null;
        }

        return a;
    }

    private class Node implements Comparable {
        Object data;
        Node root;
        Node left;
        Node right;

        public Node(Object data) {
            this(data, null);
        }

        public Node(Object data, Node root) {
            this.data = data;
            this.root = root;
            this.left = null;
            this.right = null;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Node node = (Node) o;

            if (data != null) {
                return data.equals(node.data);
            } else {
                return node.data == null;
            }
        }

        @Override
        public int hashCode() {
            return data != null ? data.hashCode() : 0;
        }

        @Override
        public int compareTo(Object o) {
            return compareObjects(data, o);
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        String delimiter = "";

        for (Object o : this) {
            result.append(delimiter).append(o);
            delimiter = "; ";
        }

        result.append("]");
        return result.toString();
    }
}
