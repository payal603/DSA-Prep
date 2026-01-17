### INTUITION
The largest BST in a binary tree can exist at any node, not necessarily at the root.
So instead of checking every subtree separately, we process the tree in a bottom-up manner.

For each node, we gather information from its left and right subtrees:
- whether they form a BST
- their minimum and maximum values
- the size of the largest BST found so far

Using this information, we decide if the current node can form a valid BST with its children.
If it can, we extend the BST size.
If it cannot, we propagate invalid boundaries so that no ancestor treats it as a BST.

This bottom-up (postorder) approach ensures each node is processed once,
leading to an efficient solution.







### EXPLANATION 

1) When a subtree is found to be **not a BST**, we return extreme values (`min = Integer.MIN_VALUE`, `max = Integer.MAX_VALUE`).
This ensures that any parent node using this subtree will automatically fail the BST condition.

2) ### Role of both Min and Max Values

We compute `min` and `max` for every subtree to validate BST properties.

- `max` is used when we have to validiate 8 root as bst and want to make sure there is no one grater than 8 on the left of 6 as in the left of 6 obviously everything will be less than 6 as 6 is valid bst and that's why we have reached here.

- `min` is used when we have 6 as root and need to know everything is greater than 6 in right that is MIN IN THE RIGHT OF 6 IS ALSO GREATER THAN 6.
-Both `min` and `max` values are calculated for every subtree because,
at a given moment, we do not know whether the current node will act as
a left child or a right child for its parent. 

These values are passed upward so that each ancestor can validate the BST condition in constant time.
<img width="873" height="678" alt="image" src="https://github.com/user-attachments/assets/22db5c4b-51d1-4c55-a204-b3f9c178342d" />
