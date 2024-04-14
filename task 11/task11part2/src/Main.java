public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.println("Preorder Traversal:");
        bst.preorderTraversal();

        System.out.println("Inorder Traversal:");
        bst.inorderTraversal();

        System.out.println("Postorder Traversal:");
        bst.postorderTraversal();

        System.out.println("Descending Order Traversal:");
        bst.printDescending();

        System.out.println("Max element: " + bst.max());
        System.out.println("Min element: " + bst.min());

        System.out.println("Find 70: " + bst.find(70));
        System.out.println("Find 100: " + bst.find(100));
    }
}