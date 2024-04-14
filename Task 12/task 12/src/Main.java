public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst1 = new BinarySearchTree();
        bst1.insert(50);
        bst1.insert(30);
        bst1.insert(70);
        bst1.insert(20);
        bst1.insert(40);
        bst1.insert(60);
        bst1.insert(80);

        BinarySearchTree bst2 = new BinarySearchTree();
        bst2.insert(50);
        bst2.insert(30);
        bst2.insert(70);
        bst2.insert(20);
        bst2.insert(40);
        bst2.insert(60);
        bst2.insert(80);

        System.out.println("Are the trees equal? " + bst1.equals(bst2));
        System.out.println("Height of bst1: " + bst1.height());
        System.out.println("Height of bst2: " + bst2.height());
        System.out.println("3rd element from root of bst1: " + bst1.kthElementFromRoot(3));
        System.out.println("Level order traversal of bst2:");
        bst2.levelOrder();


        System.out.println("Preorder Traversal:");
        bst1.preorderTraversal();

        System.out.println("Inorder Traversal:");
        bst1.inorderTraversal();

        System.out.println("Postorder Traversal:");
        bst1.postorderTraversal();

        System.out.println("Descending Order Traversal:");
        bst1.printDescending();

        System.out.println("Max element: " + bst1.max());
        System.out.println("Min element: " + bst1.min());

        System.out.println("Find 70: " + bst1.find(70));
        System.out.println("Find 100: " + bst1.find(100));

    }
}