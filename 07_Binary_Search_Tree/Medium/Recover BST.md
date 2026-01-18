## Intuition
In a Binary Search Tree, an inorder traversal always gives a sorted sequence.

Since only two nodes are swapped, the inorder sequence will have at most two places where the sorted order breaks (prev.val > curr.val).

During inorder traversal:

We keep track of the previous node (prev).

Whenever we find prev.val > curr.val, we detect a violation.

Two possible cases:
Case 1: Swapped nodes are adjacent

Only one violation occurs.

Example inorder: 1 3 2 4

Here:

first = prev

mid = curr

Fix by swapping first and mid.

Case 2: Swapped nodes are not adjacent

Two violations occur.

Example inorder: 1 4 3 2 5

Here:

First violation → first = prev, mid = curr

Second violation → last = curr

Fix by swapping first and last.

Final step:

If last exists → swap first and last

Else → swap first and mid

Why this works:

The first incorrect node is always the larger value (first)

The second incorrect node is either mid (adjacent case) or last (non-adjacent case)

Complexity:

Time: O(n)

Space: O(h) (recursion stack)

## EXPLANATION
1) Always first will be largest even when there is mid and last bcoz it has been swapped for last's place ,then last it at extreme right so it must be big only.

“Since inorder traversal of a BST is sorted, swapping two nodes causes one or two order violations. By tracking these violations during inorder traversal, we identify the swapped nodes and fix the tree by swapping them back.”
