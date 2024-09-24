package pa3;

public class Queue {
    public Node[] arr;
    public int track;
    public int cap;

    public Queue() {
        this.track = 0;
        this.cap = 10;
        this.arr = new Node[cap];
    }

    public void enqueue(Node value) {
        if (track < cap) {
            this.arr[track] = value;
            track += 1;
        } else {
            cap += 5;
            Node[] history = this.arr;
            this.arr = new Node[cap];
            for (int i = 0; i < track; i++) {
                this.arr[i] = history[i];
            }
            this.arr[track] = value;
            track += 1;
        }
    }

    public Node dequeue() {
        if (isEmpty()) {
            System.out.println("Empty queue");
            return null;
        }
        Node removed = this.arr[0];
        for (int i = 0; i < track - 1; i++) {
            this.arr[i] = this.arr[i + 1];
        }
        track -= 1;
        return removed;
    }

    public boolean isEmpty() {
        return track == 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        queue.enqueue(node1);
        queue.enqueue(node2);
        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue());
    }
}
