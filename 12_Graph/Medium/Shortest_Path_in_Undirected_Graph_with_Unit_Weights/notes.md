1) We use BFS here as there are unit weights, and instead of visited we use dist array as our visited array.
2) private void bfs(ArrayList<ArrayList<Integer>> graph,int []dist, int node){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        int size=0;
        hop=-1;
        while(!q.isEmpty()){
            size=q.size();
            hop++;
            for(int i=0;i<size;i++){
                int curr=q.poll();
                dist[curr]=hop;
                for(int ngbr: graph.get(curr)){
                    if(dist[ngbr]==(int)1e9){
                        q.add(ngbr);
                    }
                }

            }
            
            
        }
    }


   Please look at above code, it fails for TC like in image.
   <img width="1688" height="810" alt="image" src="https://github.com/user-attachments/assets/ecf33bc5-6efa-4c6c-b513-c9f3de64ce05" />
   Here, 8 was added twice, first by 6 and by 7, its updated first when added by 6 , then when its added by 7 its again updated. And before being checked if its dist is calculated, we update it..Thats why its double. Thats why we must update dist only inside neighbours iteration as soon as we find that it can be added.

