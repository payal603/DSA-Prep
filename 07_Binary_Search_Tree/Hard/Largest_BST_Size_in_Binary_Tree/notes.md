1) When a subtree is found to be **not a BST**, we return extreme values (`min = Integer.MIN_VALUE`, `max = Integer.MAX_VALUE`).
This ensures that any parent node using this subtree will automatically fail the BST condition.

2) ### Role of Min and Max Values

We compute `min` and `max` for every subtree to validate BST properties.

- `max` is used when the current subtree acts as the **left child**.
  The parent verifies that all values in the left subtree are smaller:
  `left.max < parent.val`.

- `min` is used when the current subtree acts as the **right child**.
  The parent verifies that no value in the right subtree is smaller:
  `parent.val < right.min`.

These values are passed upward so that each ancestor can
validate the BST condition in constant time.We mark max and min both for a particular subtree boz lets say we have to calculate max in left from bst then its max value will always come from the chils node's right only, not from child node's left as left are less onl;y that's why the condition is true.
<img width="873" height="678" alt="image" src="https://github.com/user-attachments/assets/22db5c4b-51d1-4c55-a204-b3f9c178342d" />
