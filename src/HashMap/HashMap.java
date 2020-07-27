package HashMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class HashMap implements Map {
        private static final int NUM_BUCKETS = 16;
        public Entry[] data = new Entry[NUM_BUCKETS];
        private int sizeNotNull;

        public void put(Object key, String value) {

        int hash = key.hashCode();
        int positiveHash = Math.abs(hash);
        int index = positiveHash % NUM_BUCKETS;

        Entry last = data[index];
        data[index] = new Entry(last, key, value);
    }

        public String getValue(Student key) {
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
            sizeNotNull=0;
            for (int i = 0; i <NUM_BUCKETS ; i++) {
                if (data[i]!=null){
                    sizeNotNull++;
                }
            }
            return sizeNotNull;
        }

        public boolean isEmpty(){
            return sizeNotNull==0;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Object get(Object key) {
            return null;
        }

        @Override
        public Object put(Object key, Object value) {
            return null;
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
                    sizeNotNull--;
                    return "true";
                } else {
                    current = current.next;
                }
            }
            return "false";
        }

        @Override
        public void clear(){
            if (data!=null) {
                data = null;
                sizeNotNull = 0;

            }else{
                System.out.println("String is empty!");
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



        private static class Entry {
            public Entry(Entry next, Object key, String value) {
                this.next = next;
                this.key = key;
                this.value = value;
            }

            Entry next;
            Object key;
            String value;


            public Object getKey() {
                return key;
            }


            public Object getValue() {
                return value;
            }

            public Object setValue(String value) {
                Object oldValue = this.value;
                this.value = value;
                return oldValue;
            }

        }
        private int calculateHash(Student student){
            return student.getId();
        }
    }
