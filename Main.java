package Tree;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();
        for (int i = 1; i <= 3; i++) {
            tree.insert(i);
        }
        tree.printPostOrder(tree.root);
        tree.printInOrder(tree.root);
        tree.printPreOrder(tree.root);
    }
}
