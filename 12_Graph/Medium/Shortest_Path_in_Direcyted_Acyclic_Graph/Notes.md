
1) We know that in toposort, we may put different components of the graph in any order. So when its that the topmost element on stack is not the source node(whose dist is manually made 0), that condition is ruled out by dis[node]=infinity.
2) We require toposort as then we traverse the graph according the reachbility in the graph.
3) The component of the graph that contains source node gets dist markings, other components remaining infinity.
4) <img width="642" height="255" alt="image" src="https://github.com/user-attachments/assets/89227d0e-0de4-45fe-af41-89f2a24f9177" />
The above image has source  node but its not connected to anyone,so 1 has infinity.
