package pa3;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public String preOrderTraversal() {
        return this.preOrderTraversalHelper(this.root);
    }

    private String preOrderTraversalHelper(Node curr) {
        if (curr == null) {
            return "";
        }
        String left = this.preOrderTraversalHelper(curr.left);
        String right = this.preOrderTraversalHelper(curr.right);
        return "" + curr.value + " " + left + right;
    }

    public String inOrderTraversal() {
        return this.inOrderTraversalHelper(this.root);
    }

    private String inOrderTraversalHelper(Node curr) {
        if (curr == null) {
            return "";
        }
        String left = this.inOrderTraversalHelper(curr.left);
        String right = this.inOrderTraversalHelper(curr.right);
        return left + curr.value + " " + right;
    }

    public String levelOrderTraversal() {
        return this.levelOrderTraversalHelper(this.root);
    }

    private String levelOrderTraversalHelper(Node node) {
        if (node == null) {
            return "";
        }
        Queue queue = new Queue();
        queue.enqueue(node);
        String result = "";
        while (!queue.isEmpty()) {
            Node temp = queue.dequeue();
            result += temp.value + " ";
            if (temp.left != null) {
                queue.enqueue(temp.left);
            }
            if (temp.right != null) {
                queue.enqueue(temp.right);
            }
        }
        return result;
    }

    public void add(int value) {
        this.root = addHelper(this.root, value);
    }

    private Node addHelper(Node root, int value) {
        Node newNode = new Node(value);
        if (root == null) {
            return newNode;
        }
        Queue queue = new Queue();
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node node = queue.dequeue();
            if (node.left == null) {
                node.left = newNode;
                break;
            } else {
                queue.enqueue(node.left);
            }
            if (node.right == null) {
                node.right = newNode;
                break;
            } else {
                queue.enqueue(node.right);
            }
        }
        return root;
    }

    public void bs_insertion(int value) {
        this.root = bs_recurr(this.root, value);
    }

    private Node bs_recurr(Node root, int value) {
        if (root == null) {
            return new Node(value);
        } else if (value < root.value) {
            root.left = bs_recurr(root.left, value);
        } else if (value > root.value) {
            root.right = bs_recurr(root.right, value);
        }
        return root;
    }

    public void invert() {
        this.invertHelper(this.root);
    }

    private void invertHelper(Node node) {
        if (node == null) {
            return;
        }
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;
        invertHelper(node.left);
        invertHelper(node.right);
    }

    public int getHeight() {
        return this.getHeightHelper(this.root);
    }

    private int getHeightHelper(Node node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = getHeightHelper(node.left);
        int rightHeight = getHeightHelper(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        System.out.println(tree.levelOrderTraversal());

        tree.invert();
        System.out.println(tree.levelOrderTraversal());

        System.out.println(tree.getHeight());
    }
}
