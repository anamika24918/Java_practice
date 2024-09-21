public class BST{
    static class Node{
        int data;
        Node left;
        Node right;

       public Node (int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
           return search(root.left,key);
        }
        else{
            return search(root.right,key);
        }
    }

    public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }else if(root.data>val){
            root.left=delete(root.left,val);
        }else{
            // case1-leaf node
            if(root.left ==null && root.right==null){
                return null;
            }
            //case 2-single child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            //case3-both child
            Node IS=findinordersuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static Node findinordersuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public static void printinrange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            printinrange(root.left,k1,k2);
            System.out.print(root.data+" ");
            printinrange(root.right,k1,k2);
        }
        else if(root.data<k1){
            printinrange(root.left,k1,k2);
        }else{
            printinrange(root.right,k1,k2);
        }
    }
    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST,int size,int min,int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxbst=0;
    public static Info largestbst(Node root){
        if(root==null){
            return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        }
       Info leftinfo= largestbst(root.left);
       Info rightinfo= largestbst(root.right);
       int size=leftinfo.size+rightinfo.size+1;
       int min=Math.min(root.data,Math.min(leftinfo.min,rightinfo.min));
       int max=Math.max(root.data,Math.max(leftinfo.max,rightinfo.max));
       if(root.data<=leftinfo.max || root.data>=rightinfo.min){
        return new Info(false,size,min,max);
       }
       if(leftinfo.isBST && rightinfo.isBST){
        maxbst=Math.max(maxbst,size);
        return new Info(true,size,min,max);
       }
        return new Info(false,size,min,max);
    }
    public static void main(String args[]){
        // int values[]={8,5,3,1,4,6,10,11,14};
        // Node root=null;
        // for(int i=0;i<values.length;i++){
        //     root=insert(root,values[i]);
        // }
        // inorder(root);
        // System.out.println();
        // printinrange(root,5,12);



        // root=delete(root,1);
        // System.out.println();
        // inorder(root);
        // System.out.println();


        // if(search(root,9)){
        //     System.out.println("found");
        // }else{
        //     System.out.println("not found");
        // }

        // Node root=new Node(data:50);
        // root.left=new Node(data:30);
        // root.left.left=new Node(data:5);
        // root.left.right=new Node(data:20);
        
        // root.right=new Node(data:60);
        // root.right.left=new Node(data:45);
        // root.right.right=new Node(data:70);
        // root.right.right.left=new Node(data:65);
        // root.right.right.right=new Node(data:80);
         Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
        Info info=largestbst(root);
        System.out.println("largest bst size="+ maxbst);
    }
}