## Intuition ##
take example of [4,2,0,3,1].

1)When we are doing res+=(leftMax-height[left], we dont think that rightMax can be lower becoz we are moving in such a way that we catch only the lower part are encountered first..


2) We dont worry if there is a smaller height in between somewhere,bcoz it will get filled with water due to big height walls, and the neighboring waters. We have not started from the other end because we know its bigger and it will protect lower wall's water.
3) The traversal from the edge s is important as they hold the water from the edges.
4) If there is a very tall height in between, it will manage the heights of small ones.
5) The water here is supported by both right and left max heights. This is the reason we move from both left and right.
6) First max height of each side is confirmed and is kept updated throughout.
   <img width="678" height="243" alt="image" src="https://github.com/user-attachments/assets/47f475ff-ad59-49c7-bd59-27fe79c09e33" />
7) In the image above, we can see that the fist height is nothing..So maxHeight will be 0, and the stored water will be maxHeight-current height ie 0.   

## Explanation ##
<h2>What to Speak in the Interview</h2>

<h3 style="color:#f39c12">Problem Introduction</h3>
Given an array representing heights of bars, we need to find the total amount of water that can be trapped between the bars after raining.

<h3 style="color:#f39c12">Brute Force</h3>
The naive approach would be for every index, scan left to find the maximum height on the left and scan right to find the maximum height on the right. The water trapped at that index is the minimum of those two maximums minus the current height. That gives us O(n²) time and O(1) space, which is too slow for large inputs.

<h3 style="color:#f39c12">Slightly Better Approach</h3>
We can improve this by precomputing prefix maximum from the left and suffix maximum from the right into two separate arrays. Then for each index we directly know both maximums in O(1). That brings us down to O(n) time but we are using O(n) extra space for those two arrays.

<h3 style="color:#f39c12">The Core Observation</h3>
The key observation is — water at any bar is determined by the minimum of the maximum wall on its left and the maximum wall on its right, minus its own height. So if we somehow always know which side has the smaller maximum, we can process that side confidently without needing the other side.

<h3 style="color:#f39c12">Why Two Pointers from the Edges</h3>
We start from both edges because the edges are the boundary walls that hold water from the sides. We maintain leftMax and rightMax and keep them updated as we move inward. At any point, whichever pointer has the smaller height, we process that side — because the other side is already confirmed to be equal or taller, so it will protect the water on this side.

<h3 style="color:#f39c12">The Guarantee That Makes It Work</h3>
When we process the left side and do leftMax minus current height, we are not worried that rightMax could be smaller — because the way we move guarantees we only touch the left side when the right side is already taller or equal. That taller right wall is the protection. Whatever smaller bars exist in between, they will get filled naturally by the surrounding taller walls and neighboring water levels.

<h3 style="color:#f39c12">How Water is Calculated</h3>
If the current height is greater than the running maximum on that side, we update the maximum — this bar is a new wall, no water sits on top of it. If the current height is less than the running maximum, the difference is exactly the water trapped at that bar and
