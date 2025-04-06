public class BTtest {

    public static void main(String[] args) {
        // Create the binary tree nodes
        BinaryTree root = new BinaryTree(1);
        BinaryTree n2 = new BinaryTree(2);
        BinaryTree n3 = new BinaryTree(3);
        BinaryTree n4 = new BinaryTree(4);
        BinaryTree n5 = new BinaryTree(5);

        // Build the tree structure
        root.setLeft(n2);
        root.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);

        // Set parent relationships for ancestor checks
        n2.setParent(root);
        n3.setParent(root);
        n4.setParent(n2);
        n5.setParent(n2);

        // Pre-order traversal
        System.out.print("Pre-order: ");
        root.preOrder();  // Output: 1 2 4 5 3
        System.out.println();

        // In-order traversal
        System.out.print("In-order: ");
        root.inOrder();   // Output: 4 2 5 1 3
        System.out.println();

        // Post-order traversal
        System.out.print("Post-order: ");
        root.postOrder(); // Output: 4 5 2 3 1
        System.out.println();

        // Ancestor check (Version 1)
        System.out.print("isAncestorV1 (n2 is ancestor of n4): ");
        System.out.println(n2.isAncestorV1(n4));  // Output: true

        System.out.print("isAncestorV1 (n3 is ancestor of n5): ");
        System.out.println(n3.isAncestorV1(n5));  // Output: false

        // Ancestor check (Version 2)
        System.out.print("isAncestorV2 (n2 is ancestor of n4): ");
        System.out.println(n2.isAncestorV2(n4));  // Output: true

        System.out.print("isAncestorV2 (n3 is ancestor of n5): ");
        System.out.println(n3.isAncestorV2(n5));  // Output: false

        // Check if the nodes are root or leaf
        System.out.println("isRoot (n1): " + root.isRoot());  // Output: true
        System.out.println("isLeaf (n4): " + n4.isLeaf());    // Output: true
        System.out.println("isLeaf (n2): " + n2.isLeaf());    // Output: false

        // Size of the tree
        System.out.println("Size of tree: " + root.size(root));  // Output: 5

        // Level of nodes
        System.out.println("Level of n2: " + n2.level());  // Output: 1
        System.out.println("Level of n4: " + n4.level());  // Output: 2

        // Depth of nodes
        System.out.println("Depth of n1: " + root.depth());  // Output: 4
    }
}
