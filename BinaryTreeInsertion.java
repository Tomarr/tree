/**
 * Created by RT033812 on 3/4/2017.
 */
public class BinaryTreeInsertion {


    class Node{
        int data;
        Node left, right;

        public Node(){
            left = right = null;
        }
    }
    public Node Insert(Node root,int value)
    {

        if(root == null){
            root = new Node();
            root.data = value;
            return root;
        }

        if(value < root.data){
            root.left = Insert(root.left, value);
        }else{
            root.right = Insert(root.right, value);
        }

        return root;
    }

}
