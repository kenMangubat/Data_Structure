public interface BTinterface {

    // Getters
    public BinaryTree getLeft();
    public BinaryTree getRight();
    public BinaryTree getParent();
    public Object getData();

    // Setters
    public void setParent(BinaryTree parent);
    public void setRight(BinaryTree right);
    public void setLeft(BinaryTree left);
    public void setData(Object data);

    // Traversals
    public void preOrder();
    public void inOrder();
    public void postOrder();

    // Other methods
    public boolean isRoot();
    public boolean isLeaf();
    public boolean isRight(Object data);
    public boolean isLeft(Object data);
    public int size(BinaryTree bt);
    public int level();
    public int depth();
    boolean isAncestorV1(BinaryTree p);
    boolean isAncestorV2(BinaryTree p);
}
