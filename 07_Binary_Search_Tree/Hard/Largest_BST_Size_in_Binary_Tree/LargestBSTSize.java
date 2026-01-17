// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {

    // Return the size of the largest sub-tree which is also a BST
    static class  nodeValue{
        int maxNode;
        int minNode;
        int maxSize;
        
        public nodeValue(int maxNode, int minNode,int maxSize){
            this.maxNode=maxNode;
            this.minNode=minNode;
            this.maxSize=maxSize;
        }
    }
    static int largestBst(Node root) {
        return helper(root).maxSize;
        
    }
    private static nodeValue helper(Node root){
        if(root==null){
            return new nodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,0);
        }
        nodeValue left=helper(root.left);
        nodeValue right=helper(root.right);
        if(left.maxNode<root.data && right.minNode>root.data){
            return new nodeValue(Math.max(root.data,right.maxNode),Math.min(root.data,left.minNode),left.maxSize+right.maxSize+1);
        }
        return new nodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,Math.max(left.maxSize,right.maxSize));
    }
}
