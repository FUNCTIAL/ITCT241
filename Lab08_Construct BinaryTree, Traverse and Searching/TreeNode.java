class TreeNode {

    int key;
    TreeNode left;
    TreeNode right;

    TreeNode(int key, TreeNode l, TreeNode r) {
        this.key = key;
        this.left = l;
        this.right = r;
    }

    TreeNode(int key) {
        this(key, null, null);
    }

    public int depth(TreeNode u) {
        if (u == null) return 0;
        else return 1 + Math.max(depth(u.left), depth(u.right));
    }

    public void binarySearch(int key) {
        TreeNode current = this;

        while (current != null) {
            if (key == current.key) {
                System.out.println("Key " + key + " found in the tree.");
                return;
            } else if (key < current.key) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        System.out.println("Key " + key + " not found in the tree.");
    }
}
