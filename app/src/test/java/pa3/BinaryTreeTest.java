package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    public void testLevelOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        assertEquals("1 2 3 4 5 6 7 ", tree.levelOrderTraversal());
    }

    @Test
    public void testInOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.bs_insertion(4);
        tree.bs_insertion(2);
        tree.bs_insertion(6);
        tree.bs_insertion(1);
        tree.bs_insertion(3);
        tree.bs_insertion(5);
        tree.bs_insertion(7);
        assertEquals("1 2 3 4 5 6 7 ", tree.inOrderTraversal());
    }

    @Test
    public void testPreOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.bs_insertion(4);
        tree.bs_insertion(2);
        tree.bs_insertion(6);
        tree.bs_insertion(1);
        tree.bs_insertion(3);
        tree.bs_insertion(5);
        tree.bs_insertion(7);
        assertEquals("4 2 1 3 6 5 7 ", tree.preOrderTraversal());
    }

    @Test
    public void testInvertLevel() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.invert();
        assertEquals("1 3 2 7 6 5 4 ", tree.levelOrderTraversal());
    }

    @Test
    public void testHeight() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        assertEquals(2, tree.getHeight());
    }
}
