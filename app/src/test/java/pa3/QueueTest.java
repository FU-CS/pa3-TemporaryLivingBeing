package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

    @Test
    public void testEnqueue() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        queue.enqueue(node1);
        queue.enqueue(node2);
        assertEquals(node1, queue.dequeue());
        assertEquals(node2, queue.dequeue());
    }

    @Test
    public void testDequeue() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        queue.enqueue(node1);
        assertEquals(node1, queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        queue.enqueue(new Node(1));
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}