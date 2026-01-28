## Intuition

In preorder traversal, nodes are visited in the order:
Root → Left → Right.

For a Binary Search Tree:
- all values in the left subtree are smaller than the root
- all values in the right subtree are greater than the root

Instead of splitting the preorder array into left and right parts,
we traverse it once while maintaining an upper bound.
This bound tells us whether the current value can belong to the
current subtree or not.

If a value exceeds the allowed bound, it cannot be placed in that subtree,
so we stop and return control to the parent.


## Complexity

Time Complexity: O(n)  
Each node is processed exactly once.

Space Complexity: O(h)  
Due to recursion stack, where h is the height of the tree.
