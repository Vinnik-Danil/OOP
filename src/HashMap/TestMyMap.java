package HashMap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMyMap {
        private HashMap hashMap;

        @Before
        public void before() {
            hashMap = new HashMap();
        }

        @Test
        public void testIsEmpty() {
            Assert.assertTrue(hashMap.isEmpty());
            hashMap.put("01 - First", 1);
            Assert.assertFalse(hashMap.isEmpty());
            hashMap.put("02 - Second", 3);
            Assert.assertFalse(hashMap.isEmpty());
        }

        @Test
        public void testSize() {
            Assert.assertEquals(0, hashMap.size());
            hashMap.put("123", 1);
            Assert.assertEquals(1, hashMap.size());
            hashMap.put("www", 3);
            Assert.assertEquals(2, hashMap.size());
            hashMap.put("sad", 2);
            Assert.assertEquals(2, hashMap.size());
        }

        @Test
        public void testAdd() {
            Assert.assertNull(hashMap.put("Sidorov", 1));
            Assert.assertNull(hashMap.put("Ivanov", 3));
            Assert.assertEquals(2, hashMap.size());
        }


        @Test
        public void testGetNullKey() {
            boolean exceptionIsThrown = false;

            try {
                hashMap.get(null);
            } catch (NullPointerException e) {
                exceptionIsThrown = true;
            }

            Assert.assertTrue(exceptionIsThrown);
        }



        @Test
        public void testContainsNullKey() {
            boolean exceptionIsThrown = false;

            try {
                hashMap.containsKey(null);
            } catch (NullPointerException e) {
                exceptionIsThrown = true;
            }

            Assert.assertTrue(exceptionIsThrown);
        }


        @Test
        public void testContainsNullValue() {
            boolean exceptionIsThrown = false;

            try {
                hashMap.containsValue(null);
            } catch (NullPointerException e) {
                exceptionIsThrown = true;
            }

            Assert.assertTrue(exceptionIsThrown);
        }

        @Test
        public void testContainsValue() {
            Assert.assertFalse(hashMap.containsValue(1));

            for (int i = 1; i <= 512; i++) {
                hashMap.put(i, i - 512);
            }
            for (int i = 1; i <= 512; i++) {
                Assert.assertTrue(hashMap.containsValue(i - 512));
            }
        }

        @Test
        public void testClear() {
            for (int i = 1; i <= 512; i++) {
                hashMap.put(i, i - 512);
            }

            hashMap.clear();
            Assert.assertEquals(0,hashMap.size());

        }

    }
