## Intuition
1) First of all, we will add only the positive ones in the list, negative will be added only when the list is empty or has only negatives. Negative will be either destroyed by bigger positives, equal positives, or they themselves will destroy all the positives currently in the list.
2) If we encounter a positive, we directly add it to the list.
3) f it is negative, first we destroy all smaller positives in the while loop, then after destroying the positive ones we enter the if and else if block.
4) In the if block, if the last element of the list is equal in size to the current negative, both destroy each other so the current negative gets destroyed and we do not add it. In the else if block, if the list is empty or has only negatives at the last position, the current negative survives and we add it to the list.
5) Now what could be left in the list is either a big positive than the current negative, or an empty list, or only negatives. If it is a big positive than the current negative then we cannot include the current negative as it will get destroyed. If the list is empty or only negatives are there we can include it.
6) In the last if else block we decide if the current -ve is to be added in the stack or not.

```
## 🟠 What to Speak in the Interview

---

### 🔸 Problem Introduction
Given an array of asteroids moving in a row, positive numbers move right and negative numbers move left. When two asteroids meet, the smaller one explodes. If both are equal, both explode. We need to return the state of asteroids after all collisions.

---

### 🔸 Brute Force
The naive approach would be to repeatedly scan the array, find colliding pairs, resolve them one by one, and keep doing this until no more collisions happen. This is very inefficient and gives us O(n²) time and O(n) space in the worst case.

---

### 🔸 The Core Observation
A collision only happens when a left moving asteroid meets a right moving asteroid. Two right moving asteroids never collide. Two left moving asteroids never collide. So we only need to worry about the moment a negative asteroid appears after a positive one.

---

### 🔸 Why a List as a Stack
We use an ArrayList and treat it like a stack by always adding and removing from the last index. We do this because at the end we need to directly convert it to an array, which is cleaner with a List than with a Stack. The last element of the list acts as the top of our stack.

---

### 🔸 Intuition
First of all, we will add only the positive ones in the list, negative will be added only when the list is empty or has only negatives. Negative will be either destroyed by bigger positives, equal positives, or they themselves will destroy all the positives currently in the list.

---

### 🔸 How Collisions Are Handled Step by Step
If we encounter a positive, we directly add it to the list. If it is negative, first we destroy all smaller positives in the while loop by removing the last element of the list one by one. Then after destroying the positive ones we enter the if and else if block.

---

### 🔸 The Three Cases After the While Loop
In the if block, if the last element of the list is equal in size to the current negative, both destroy each other so the current negative gets destroyed and we do not add it. In the else if block, if the list is empty or has only negatives at the last position, the current negative survives and we add it to the list. Now what could be left in the list is either a big positive than the current negative, or an empty list, or only negatives. If it is a big positive than the current negative then we cannot include the current negative as it will get destroyed. If the list is empty or only negatives are there we can include it.

---

### 🔸 Time and Space Complexity
Time complexity is O(n) — each asteroid is added once and removed at most once from the list, so total operations are 2n which is O(n). Space complexity is O(n) — in the worst case when no collisions happen, like all asteroids moving right, all of them end up in the list.

---

### 🔸 Closing
So the core idea is — positive asteroids go straight into the list. Negative asteroids fight their way through, destroying smaller positives in the while loop, and are only added to the list when nothing can stop them. At the end we simply convert the list to an array and return it.
```
