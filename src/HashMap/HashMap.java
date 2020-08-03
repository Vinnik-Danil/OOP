package HashMap;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap implements Map {
    private static final int NUM_BUCKETS = 16;

    public Entry[] data = new Entry[NUM_BUCKETS];
    private int size;
    private HashSet keys = new HashSet();


    public Object getValue(Student key) {
        int hash = key.hashCode();
        int positiveHash = Math.abs(hash);
        int index = positiveHash % NUM_BUCKETS;

        Entry current = data[index];

        while (current != null) {
            Object o = current.key;
            if (o.equals(key)) {
                return current.value;
            } else {
                current = current.next;
            }
        }
        return null;
    }

    public boolean contains(Object key){

        int hash = key.hashCode();
        int positiveHash = Math.abs(hash);
        int index = positiveHash % NUM_BUCKETS;

        Entry current = data[index];

        while (current != null) {
            Object o = current.key;
            if (o.equals(key)) {
                return true;
            } else {
                current = current.next;
            }
        }
        return false;
    }

    public int size(){
        size =0;
        for (int i = 0; i <NUM_BUCKETS ; i++) {
            if (data[i]!=null){
                size++;
            }
        }
        return size;
    }

    public boolean isEmpty(){
        return size ==0;
    }

    @Override
    public boolean containsKey(Object key) {
        if (key == null) {
            throw new NullPointerException("Null keys are not permitted");
        }

        return contains(key);
    }

    @Override
    public boolean containsValue(Object value) {
        if (value == null) {
            throw new NullPointerException("Null values are not permitted");
        }

        for (Entry row : data) {
            Entry entry = row;

            while (entry != null) {
                if (entry.getValue().equals(value)) {
                    return true;
                }

                entry = entry.next;
            }
        }

        return false;
    }

    @Override
    public Object get(Object key) {
        int hash = key.hashCode();
        int positiveHash = Math.abs(hash);
        int index = positiveHash % NUM_BUCKETS;

        Entry current = data[index];

        while (current != null) {
            Object o = current.key;
            if (o.equals(key)) {
                return true;

            }
        }
        return key;
    }

    @Override
    public Object put(Object key, Object value) {
        if (key == null || value == null) {
            throw new NullPointerException("Null keys or values are not permitted");
        }

        int index = getIndex(key);

        Entry entry = data[index];

        while (entry != null) {
            if (entry.getKey().equals(key)) {
                Object oldValue = entry.getValue();
                entry.setValue(value);

                return oldValue;
            }

            entry = entry.next;
        }

        data[index] = new Entry(key, value, data[index]);
        keys.add(key);
        size++;
        return null;
    }

    private int getIndex(Object o) {
        return Math.abs(o.hashCode()) % NUM_BUCKETS;
    }

    @Override
    public String remove(Object key){

        int hash = key.hashCode();
        int positiveHash = Math.abs(hash);
        int index = positiveHash % NUM_BUCKETS;

        Entry current = data[index];

        while (current != null) {
            Object o = current.key;
            if (o.equals(key)) {
                data[index]=null;
                size--;
                return "true";
            } else {
                current = current.next;
            }
        }
        return "false";
    }

    @Override
    public void clear(){
        for (int i = 0; i < NUM_BUCKETS; i++) {
            data[i] = null;
        }
    }


    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection values() {
        return null;
    }

    @Override
    public Set<Map.Entry> entrySet() {
        return null;
    }

    public void putAll(Map map) {
        if (map == null) {
            throw new NullPointerException("Null map is not permitted");
        }
        if (map.containsKey(null)) {
            throw new NullPointerException("Null keys are not permitted");
        }
        if (map.containsValue(null)) {
            throw new NullPointerException("Null values are not permitted");
        }

        Set entrySet = map.entrySet();

        for (Object entry : entrySet) {
            Map.Entry e = (Map.Entry) entry;
            put(e.getKey(), e.getValue());
        }
    }


    public Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }
    

    private static class Entry implements Map.Entry {
        Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public Object getKey() {
            return key;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public Object setValue(Object value) {
            Object oldValue = this.value;
            this.value = value;
            return oldValue;
        }
    }

    private int calculateHash(Student student){
        return student.getId();
    }
}
