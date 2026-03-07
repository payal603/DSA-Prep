## intuition ##
1) If we are at a particular index and find that the previous element is greater or equal to the current index, we simply pop it and find maximal rectangle using it.
2) Its important to have (heights[st.peek()] >=heights[i]) because we need to have only the pse in the stack and not removing equal heights may give incorrect pse.
3) <img width="375" height="497" alt="image" src="https://github.com/user-attachments/assets/900a1491-a279-4537-b8ce-96cf5cda9979" />

   As per point 2, if there are consecutive equal heights like this, when we are at index 0,we will just insert it in the stack, when at index 1, then we we calculate height for 0 index rectangle ie 10, then as we are on index 2, for index 1 max rectangle area will be 20 then when we are at index 3, for index 2 total max height of 30 will be calculated.
4) <img width="366" height="525" alt="image" src="https://github.com/user-attachments/assets/9c613a43-f804-48bb-be3f-44be9dd872b6" />
  Here, when we reach n ie 3 at that time we start popping all elemnts one by one and calculating max rectangle before that we cant.

 
## interview ##

What to Speak in the Interview

Problem Introduction
"Given an array of bar heights, we need to find the largest rectangle that can be formed across consecutive bars. The height of the rectangle is limited by the shortest bar in that range."

Brute Force
"The naive approach would be to check every pair of indices i and j, track the minimum height in that range, and compute width times height. That gives us O(n²) time and O(1) space, which is too slow for large inputs."

Optimized Approach — The Key Insight
"The bottleneck in brute force is repeatedly finding the minimum. So instead, we flip the thinking — for each bar, we ask: what is the largest rectangle where THIS bar is the limiting height? That rectangle extends left and right until it hits a shorter bar."

Why a Monotonic Stack
"We use a monotonic increasing stack of indices. As long as bars are increasing, we keep pushing. The moment we find a shorter bar, we know the bar at the top of the stack can't extend any further right — so that's the perfect moment to calculate its area."

Width Calculation
"When we pop a bar, its width spans from the new stack top on the left to the current index on the right, exclusive on both ends. If the stack is empty after popping, it means that bar was the smallest so far, so it extends all the way to index zero — so width is just the current index."

The Sentinel Trick
"We loop till i equals n, one index past the end. This acts as a virtual bar of height zero, which forces all remaining bars in the stack to get popped and their areas calculated. Without this, we'd miss bars that never got blocked."

Time and Space Complexity
"Time complexity is O(n) — even though there's a while loop inside the for loop, each index is pushed exactly once and popped exactly once, so total operations are 2n which is O(n). For space complexity, the stack can hold at most n elements in the worst case — for example when the array is strictly increasing, every index gets pushed and nothing gets popped until the end. So space complexity is O(n). Compared to brute force which was O(n²) time and O(1) space, we are trading some extra space for a much better time complexity."

Closing
"So the core idea is — instead of scanning ranges repeatedly, each bar computes its area exactly once, at the moment it's blocked by something shorter. The monotonic stack gives us that moment naturally."
