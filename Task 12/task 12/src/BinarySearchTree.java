import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    public boolean equals(BinarySearchTree tree) {
        return equalsRecursive(this.root, tree.root);
    }

    private boolean equalsRecursive(Tree node1, Tree node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.value == node2.value
                && equalsRecursive(node1.left, node2.left)
                && equalsRecursive(node1.right, node2.right);
    }

    public int height() {
        return heightRecursive(root);
    }

    private int heightRecursive(Tree node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = heightRecursive(node.left);
        int rightHeight = heightRecursive(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public ArrayList<Integer> kthElementFromRoot(int k) {
        ArrayList<Integer> result = new ArrayList<>();
        kthElementFromRootRecursive(root, k, result);
        return result;
    }

    private void kthElementFromRootRecursive(Tree node, int k, ArrayList<Integer> result) {
        if (node == null || k < 0) {
            return;
        }
        if (k == 0) {
            result.add(node.value);
            return;
        }
        kthElementFromRootRecursive(node.left, k - 1, result);
        kthElementFromRootRecursive(node.right, k - 1, result);
    }

    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<Tree> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Tree node = queue.poll();
            System.out.print(node.value + " ");
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println();
    }
}
