package Tree;

public class Tree {

    Node root;

    Tree() {
    }

    void print() {

        Node tmp = root;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.left;
        }

    }

    void insert(int data) {
        root = insert(root, data);
    }

    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node();
            root.data = data;
        } else {
            if (data <= root.data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }
        }
        return root;
    }

    void printPostOrder(Node node) {
        if (node == null) {
            System.out.println("hi1");
            return;
        }
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
        System.out.println("h");
    }

    void printInOrder(Node node) {
        if (node == null) {
            System.out.println("hi2");
            return;
        }
        printInOrder(node.left);
        System.out.print(node.data + " ");
        System.out.println();
        printInOrder(node.right);
    }

    void printPreOrder(Node node) {
        if (node == null) {
            System.out.println("hi3");
            return;
        }
        System.out.print(node.data + " ");
        System.out.println();
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

}
