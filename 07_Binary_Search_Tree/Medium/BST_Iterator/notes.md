Intuition – BST Iterator

Inorder traversal of a BST gives elements in sorted order.

We use a stack to simulate inorder traversal.

The stack always stores the path to the next smallest element.

pushAll() pushes a node and all its left children so that the top of the stack is always the next element to return.

After returning a node, if it has a right child, we prepare its right subtree in the same way.

Why next() is O(1) amortized
Key observation

Each node is pushed exactly once

Each node is popped exactly once

Let:

n = number of nodes in the BST

Total work over all next() calls

Total push operations = n

Total pop operations = n

Total operations
=
𝑂
(
𝑛
)
Total operations=O(n)

Number of next() calls = n

Amortized time per next()

<img width="880" height="180" alt="image" src="https://github.com/user-attachments/assets/eb5dab4c-587e-443a-9332-06bcae1c24eb" />
	​


Important clarification

A single next() call can take O(h) in the worst case

But across all calls, the average cost is constant

One-line interview answer (very strong)

“Although next() may push multiple nodes in one call, each node is pushed and popped only once overall. Hence the total work is O(n), making the amortized time per next() O(1).”

Space Complexity

O(h) where h is the height of the tree (stack depth)
