take example of [4,2,0,3,1].

1)When we are doing res+=(leftMax-height[left], we dont think that rightMax can be lower becoz we are moving in such a way that we catch only the lower part are encountered first..


2) We dont worry if there is a smaller height in between somewhere,bcoz it will get filled with water due to big height walss, and the neighboring waters.
3) The traversal from the edge s is important as they hold the water from the edges.
4) If there is a very tall height in between, it will manage the heights of small ones.
5) The water here is supported by both right and left max heights. This is the reason we move from both left and right.
6) First max height of each side is confirmed and is kept updated throughout.
7) <img width="678" height="243" alt="image" src="https://github.com/user-attachments/assets/47f475ff-ad59-49c7-bd59-27fe79c09e33" />
