// IntTreeNode

public void traverse()
{
    traverse(overallRoot);
}

private void traverse(IntTreeNode root)
{
    if (root != null)
    {
        System.out.println(root.data);
        traverse(root.left);
        traverse(root.right);
    }
}