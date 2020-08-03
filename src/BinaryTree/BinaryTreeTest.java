package BinaryTree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BinaryTreeTest {

    private BinaryTree binaryTree;

    @Before
    public void setUp(){
        binaryTree = new BinaryTree();
    }
    @Test
    public void testAddSizeEmpty(){
        Assert.assertEquals(0,binaryTree.size());
    }

    @Test
    public void testAddSizeNotEmpty(){
        binaryTree.add(1);
        Assert.assertEquals(1,binaryTree.size());
        binaryTree.add(4);
        Assert.assertEquals(2,binaryTree.size());

    }
    @Test
    public void testClear(){
        binaryTree.clear();
        Assert.assertEquals(0,binaryTree.size());
    }
    @Test
    public void testAddAll(){
        binaryTree.add(1);
        binaryTree.add(2);
        binaryTree.add(5);
        binaryTree.add(7);

        BinaryTree newBinaryTree = new BinaryTree();

        newBinaryTree.add(9);
        newBinaryTree.add(4);
        newBinaryTree.add(3);
        newBinaryTree.add(6);
        binaryTree.addAll(newBinaryTree);
        Assert.assertEquals(8, binaryTree.size());

    }
    @Test
    public void testContainsAll(){

        binaryTree.add(1);
        binaryTree.add(3);

        BinaryTree newBinaryTree = new BinaryTree();
        newBinaryTree.add(1);
        newBinaryTree.add(3);

        Assert.assertTrue(binaryTree.containsAll(newBinaryTree));
    }


    @Test
    public void testRetainAll(){

        binaryTree.add(5);
        binaryTree.add(7);
        binaryTree.add(1);
        binaryTree.add(3);

        BinaryTree newBinaryTree = new BinaryTree();
        newBinaryTree.add(5);
        newBinaryTree.add(7);
        newBinaryTree.add(1);
        newBinaryTree.add(3);

        Assert.assertTrue(binaryTree.containsAll(newBinaryTree));
    }
}
