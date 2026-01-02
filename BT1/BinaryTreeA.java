package BT1;
public class BinaryTreeA {
    static class Node{
       int data;
       Node left;
       Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }
    public static void preOrderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
          System.out.print(root.data+" ");
        inorder(root.right);

    }
    public static void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
//Leval order

public static void levalorder(Node root){
	     if(root == null){
	         return;
	     }
	         Queue<Node> q = new LinkedList<>();
	         q.add(root);
	         q.add(null);
	         
	       while(!q.isEmpty()){
	          Node curr = q.remove();
	          if(curr == null){
	              if(q.isEmpty()){
	                  break;
	              }
	                  q.add(null);
	                  System.out.println();
	               
	          }else{
	               System.out.print(curr.data);    
	              if(curr.left!=null){
	                  q.add(curr.left);
	               }
	                if(curr.right!=null){
	                  q.add(curr.right);
	               }    
	          }
	          
	     }
	}

    public static void main(String args[]){
       int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
       BinaryTree tree = new BinaryTree();
       Node root = tree.buildTree(nodes);
       levelorder(root);
    }   
}
