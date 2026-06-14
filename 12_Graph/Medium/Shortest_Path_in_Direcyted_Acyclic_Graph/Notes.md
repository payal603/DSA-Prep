
1) We know that in toposort, we may put different nodes of the graph in any order(any other element other than the source node may come on the top). So when its that the topmost element on stack is not the source node(whose dist is manually made 0), at that time, we dont consider any of the other nodes other than the source as it has dis[node]=infinity. Our djistra algo start only when we get our source node.
2) We require toposort as then we traverse the graph according the reachbility in the graph.
3) The component of the graph that contains source node gets dist markings, other components remaining infinity.
4) <img width="642" height="255" alt="image" src="https://github.com/user-attachments/assets/89227d0e-0de4-45fe-af41-89f2a24f9177" />
The above image has source  node but its not connected to anyone,so 1 has infinity.
