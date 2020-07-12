package MyCollection;


import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class MyCollection implements Collection {
    private int SIZE_OF_COLLECTION = 0;
    private Object[] collec = new Object[SIZE_OF_COLLECTION];
    private int maxIndex;

    public String getCollec() {

        if (collec == null) {
            System.out.println("My collection: []");
        } else {
            StringBuilder result = new StringBuilder("[");
            String delimiter = "";

            for (int i = 0; i < collec.length; i++) {
                if (collec[i] == null) {
                    continue;
                }

                result.append(delimiter).append(collec[i].toString());
                delimiter = "; ";
            }

            result.append("]");
            return result.toString();
        }
        return "";
    }

    @Override
    public int size() {
        System.out.println("Size of my collection is: ");
        if (collec == null) {
            return 0;
        }
        return SIZE_OF_COLLECTION;
    }

    @Override
    public boolean isEmpty() {
        if (collec.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if (o == null) {
            return false;
        }
        for (int i = 0; i < collec.length; i++) {
            if (collec[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void index_max(){
        int index=-1;
        for (int i = 0; i <collec.length ; i++) {
            if (collec[i] != null){
                index=i;
            }
        }
        maxIndex = index;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index <= maxIndex;
            }

            @Override
            public Object next() {
                int currentIndex = index;

                index++;

                for (; index <= maxIndex; index++) {
                    if (collec[index] != null) {
                        break;
                    }
                }

                return collec[currentIndex];
            }
        };
    }


    @Override
    public Object[] toArray(Object[] a) {
        if (a.length <= SIZE_OF_COLLECTION) {
            return toArray();
        }

        int i = 0;
        for (Object element : collec) {
            if (element != null) {
                a[i] = element;
                i++;
            }
        }
        for (; i < a.length; i++) {
            a[i] = null;
        }

        return a;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[SIZE_OF_COLLECTION];

        if (SIZE_OF_COLLECTION == 0) {
            return newArray;
        }else {
        int i = 0;
        for (Object element : collec) {
            if (element != null) {
                newArray[i] = element;
                i++;
            }
        }
        }
        return newArray;
    }

    @Override
    public String toString(){

        if (collec==null) {
            System.out.println("My collection: []");
            return "";
        }

        String result ="";
        for (Object o : collec) {
            if (o == null) {
                continue;
            }
            result += (o + ", ");
        }
        if (result.length() != 0) {
            result = result.substring(0, result.length() - 2);
        }
        return "My container is: " + "[" + result + "]";
    }

    @Override
    public boolean add(Object o) {

        Object[] newArray = new Object[collec.length + 1];

        for (int i = 0; i < collec.length; i++) {
            newArray[i] = collec[i];
            SIZE_OF_COLLECTION=collec.length;
            SIZE_OF_COLLECTION++;
        }
        newArray[collec.length] = o;
        collec = newArray;
        return true;
    }

    @Override
    public boolean remove(Object o) {

        if (o == null) {
            return false;
        }

        for (int i = 0; i < collec.length; i++) {
            if (collec[i] == null) {
                continue;
            }
            if (collec[i].equals(o)) {
                collec[i] = null;
                SIZE_OF_COLLECTION = collec.length;
                SIZE_OF_COLLECTION--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
       Object[] newCollec = c.toArray();
        if (collec.length > newCollec.length){
            for (Object el : newCollec) {
                add(el);
            }
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
            collec = null;
            SIZE_OF_COLLECTION=0;
        System.out.println("Collection is clear");
    }

    @Override
    public boolean retainAll(Collection c) {
        Object[] newCollec = c.toArray();
        Object[] result = new Object[collec.length];

        if (c == null) {
            return false;
        }

        if (collec == null) {
            return false;
        }

        for (int i = 0; i < collec.length; i++) {
            if (collec == null) {
                continue;
            }
            if (!c.contains(collec[i])) {
                collec[i] = null;
            }
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {

        if (c == null) {
            return false;
        }

        if (collec==null){
            return false;
        }

        for (int i = 0; i < collec.length; i++) {
            if (collec == null) {
                continue;
            }
            if (c.contains(collec[i])) {
                collec[i] = null;

            }
        }
        return true;

    }

    @Override
    public boolean containsAll(Collection c) {

        if (c == null) {
            return false;
        }

        if (collec==null){
            return false;
        }

        for (int i = 0; i < collec.length; i++) {
            if (collec == null) {
                continue;
            }
            if (c.contains(collec[i])) {
                return true;
            }
        }
        return false;

    }

    public Object numbOfindex(int numbOfindex) {
        numbOfindex--;
        for (int i = 0; i < collec.length; i++) {
            if (i == numbOfindex) {
//                System.out.println(mass[i]);
                return collec[i];
            }
        }
        return 0;
    }

    public int hashCode(){
        return Objects.hash(collec);
    }
}
