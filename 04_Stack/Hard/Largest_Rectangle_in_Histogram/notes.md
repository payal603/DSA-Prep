## intuition ##
1) If we are at a particular index and find that the previous element is greater or equal to the current index, we simply pop it and find maximal rectangle using it.
2) Its important to have (heights[st.peek()] >=heights[i]) because we need to have only the pse in the stack and not removing equal heights may give incorrect pse.
3) {"type":"excalidraw/clipboard","elements":[],"files":{}}
   As per point 2, if there are consecutive equal heights like this, when we are at index 0,we will just insert it in the stack, when at index 1, then we we calculate height for 0 index rectangle ie 10, then as we are on index 2, for index 1 max rectangle area will be 20 then when we are at index 3, for index 2 total max height of 30 will be calculated.
4) {"type":"excalidraw/clipboard","elements":[],"files":{}}
 
