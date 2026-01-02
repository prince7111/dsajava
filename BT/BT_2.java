package BT;

public class BT_2 {
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
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }
        int leftDia = diameter(root.left);
        int leftHight = height(root.left);
        int rightDia = diameter(root.right);
        int rightHight = height(root.right);
         int selfDia = leftHight + rightHight +1;
         return Math.max(selfDia, Math.max(leftDia,rightDia));
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static void main(String args[]){
        Node root = new Node(4);
        root.left = new Node(0);
      //  root.right = new Node(1);
     /*
          4
         / \
        0   1
                */
    System.out.println(diameter(root));

    }
}


