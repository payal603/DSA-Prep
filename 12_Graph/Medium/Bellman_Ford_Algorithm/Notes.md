
Suppose we need to reach a node 'V' from a node 'U', then if we require more than V-1 iterations( V-1 only because there can be at max 1 less than total nodes edges), it means that we are using a path that requires a particular node twice. But for a positive weight cycle,this cant be possible as cycle means extra path in =ve, equal weight cycle also will not have cycle nodes.

1->2->3->4->5
Suppose in above graph, we are relaxing one by one, like only 1->2 in first pass( as edges given order may have 1->2 in the last), the shortest path fom 1->5 requires V-1 ie 4 pass.

Graph: 1→2→3→4→5, but suppose edges are given in reverse order: (4,5), (3,4), (2,3), (1,2), and this exact order is used every pass.

Pass 1: Process (4,5): dist[4]=∞, no update. (3,4): no update. (2,3): no update. (1,2): dist[2] = 0+w → correct now.
Pass 2: (4,5): no update. (3,4): no update. (2,3): dist[2] correct → dist[3] updates → correct now. (1,2): unchanged.
Pass 3: (4,5): no update. (3,4): dist[3] correct → dist[4] updates → correct now.
Pass 4: (4,5): dist[4] correct → dist[5] updates → correct now.

So it takes exactly 4 = V-1 passes for the shortest-path info to "propagate" from node 1 to node 5, one hop per pass, because of the adversarial edge ordering. This is precisely the worst case that motivates the V-1 bound — with a "nice" edge order (1,2),(2,3),(3,4),(4,5), you'd converge in just 1 pass, but Bellman-Ford has to guarantee correctness for any order, hence V-1.

One more detail worth internalizing: this is also why after V-1 passes, if a Vth pass still finds a relaxation possible, you know there's a negative-weight cycle reachable from the source — since no simple path can need a Vth relaxation.
