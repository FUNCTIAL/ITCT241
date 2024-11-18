// File: BinaryTree.java
// Description: Create a binary tree, print the tree, in order, pre order, post order.
// Assignment Number: 8
//
// ID: 6580838
// Name: Teerathad Udomjitwiwat
// Grader: Aj. Petch
//
// On my honor, Teerathad Udomjitwiwat, this lab assignment is my own work
// and I have not provided this code to any other students

public class BinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(
            53,
            new TreeNode(
                30,
                new TreeNode(20, null, new TreeNode(26)),
                new TreeNode(33)
            ),
            new TreeNode(
                75,
                new TreeNode(72, new TreeNode(70), new TreeNode(74)),
                new TreeNode(80)
            )
        );

        System.out.println("Depth of the tree: " + root.depth(root));
        System.out.print("\nIn-Order: ");
        inOrder(root);
        System.out.print("\nPre-Order: ");
        preOrder(root);
        System.out.print("\nPost-Order: ");
        postOrder(root);

        System.out.println("\n");
        root.binarySearch(70);
    }

    // In-order traversal LVR
    public static void inOrder(TreeNode node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    // Pre-order traversal VLR
    public static void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.key + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // Post-order traversal LRV
    public static void postOrder(TreeNode node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.key + " ");
        }
    }
}
