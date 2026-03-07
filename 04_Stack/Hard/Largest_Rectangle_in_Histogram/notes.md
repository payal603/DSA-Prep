## intuition ##
1) If we are at a particular index and find that the previous element is greater or equal to the current index, we simply pop it and find maximal rectangle using it.
2) Its important to have (heights[st.peek()] >=heights[i]) because we need to have only the pse in the stack and not removing equal heights may give incorrect pse.
3) <img width="375" height="497" alt="image" src="https://github.com/user-attachments/assets/900a1491-a279-4537-b8ce-96cf5cda9979" />

   As per point 2, if there are consecutive equal heights like this, when we are at index 0,we will just insert it in the stack, when at index 1, then we we calculate height for 0 index rectangle ie 10, then as we are on index 2, for index 1 max rectangle area will be 20 then when we are at index 3, for index 2 total max height of 30 will be calculated.
4) <img width="366" height="525" alt="image" src="https://github.com/user-attachments/assets/9c613a43-f804-48bb-be3f-44be9dd872b6" />
  Here, when we reach n ie 3 at that time we start popping all elemnts one by one and calculating max rectangle before that we cant.

 
