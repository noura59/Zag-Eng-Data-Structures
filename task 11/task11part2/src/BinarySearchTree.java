public class BinarySearchTree {
    private Tree root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private Tree insertRecursive(Tree current, int value) {
        if (current == null) {
            return new Tree(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    public boolean find(int value) {
        return findRecursive(root, value);
    }

    private boolean findRecursive(Tree current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }

        return value < current.value
                ? findRecursive(current.left, value)
                : findRecursive(current.right, value);
    }

    public void preorderTraversal() {
        preorderTraversalRecursive(root);
        System.out.println();
    }

    private void preorderTraversalRecursive(Tree node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderTraversalRecursive(node.left);
            preorderTraversalRecursive(node.right);
        }
    }

    public void inorderTraversal() {
        inorderTraversalRecursive(root);
        System.out.println();
    }

    private void inorderTraversalRecursive(Tree node) {
        if (node != null) {
            inorderTraversalRecursive(node.left);
            System.out.print(node.value + " ");
            inorderTraversalRecursive(node.right);
        }
    }

    public void postorderTraversal() {
        postorderTraversalRecursive(root);
        System.out.println();
    }

    private void postorderTraversalRecursive(Tree node) {
        if (node != null) {
            postorderTraversalRecursive(node.left);
            postorderTraversalRecursive(node.right);
            System.out.print(node.value + " ");
        }
    }

    public void printDescending() {
        printDescendingRecursive(root);
        System.out.println();
    }

    private void printDescendingRecursive(Tree node) {
        if (node != null) {
            printDescendingRecursive(node.right);
            System.out.print(node.value + " ");
            printDescendingRecursive(node.left);
        }
    }

    public int max() {
        return findMax(root);
    }

    private int findMax(Tree node) {
        if (node.right != null) {
            return findMax(node.right);
        }
        return node.value;
    }

    public int min() {
        return findMin(root);
    }

    private int findMin(Tree node) {
        if (node.left != null) {
            return findMin(node.left);
        }
        return node.value;
    }

}


