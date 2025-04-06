public class BinaryTree implements BTinterface {

    private Object data;
    private BinaryTree left, right, parent;

    public BinaryTree(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    // Getter methods
    public BinaryTree getLeft() {
        return this.left;
    }

    public BinaryTree getRight() {
        return this.right;
    }

    public BinaryTree getParent() {
        return this.parent;
    }

    public Object getData() {
        return this.data;
    }

    // Setter methods
    public void setParent(BinaryTree parent) {
        this.parent = parent;
    }

    public void setLeft(BinaryTree left) {
        this.left = left;
    }

    public void setRight(BinaryTree right) {
        this.right = right;
    }

    public void setData(Object data) {
        this.data = data;
    }

    // Traversal methods
    public void preOrder() {
        System.out.print(this.data + " ");
        if (this.left != null) this.left.preOrder();
        if (this.right != null) this.right.preOrder();
    }

    public void inOrder() {
        if (this.left != null) this.left.inOrder();
        System.out.print(this.data + " ");
        if (this.right != null) this.right.inOrder();
    }

    public void postOrder() {
        if (this.left != null) this.left.postOrder();
        if (this.right != null) this.right.postOrder();
        System.out.print(this.data + " ");
    }

    // Ancestor check method (Version 1)
    public boolean isAncestorV1(BinaryTree node) {
        BinaryTree current = this;
        while (current != null) {
            if (current == node) {
                return true;
            }
            current = current.getParent();
        }
        return false;
    }

    // Ancestor check method (Version 2)
    public boolean isAncestorV2(BinaryTree node) {
        if (this == null) return false;
        if (this == node) return true;
        return (this.left != null && this.left.isAncestorV2(node)) ||
               (this.right != null && this.right.isAncestorV2(node));
    }

    // Additional Methods

    @Override
    public boolean isRoot() {
        return this.parent == null;
    }

    @Override
    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }

    @Override
    public boolean isRight(Object data) {
        if (this.parent == null) return false;
        return this.parent.getRight() != null && this.parent.getRight().getData().equals(data);
    }

    @Override
    public boolean isLeft(Object data) {
        if (this.parent == null) return false;
        return this.parent.getLeft() != null && this.parent.getLeft().getData().equals(data);
    }

    @Override
    public int size(BinaryTree bt) {
        if (bt == null) return 0;
        return 1 + size(bt.getLeft()) + size(bt.getRight());
    }

    @Override
    public int level() {
        int level = 0;
        BinaryTree current = this;
        while (current.getParent() != null) {
            level++;
            current = current.getParent();
        }
        return level;
    }

    @Override
    public int depth() {
        return size(this) - 1; // depth is the size of the tree minus one
    }
}
