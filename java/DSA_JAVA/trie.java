import java.util.*;
public class trie{
    static class Node{
        Node children[]=new Node[26];
        boolean eow=false;
        int frq;

       public Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
            frq=1;
        }
    }
    public static Node root=new Node();
    


    // static class Node{
    //     Node children[]=new Node[26];
    //     boolean eow=false;
    //     Node(){
    //         for(int i=0;i<26;i++){
    //             children[i]=null;
    //         }
    //     }
    // }
    // public static Node root=new Node();
    public static void insert (String word){
        Node curr=root;
        // int idx=0;
        for(int level=0;level<word.length();level++){
            int idx=word.charAt(level)-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new Node();
            }
            // else{
            //     curr.children[idx].frq++;
            // }
            curr=curr.children[idx];
        }
        curr.eow=true;
    }
    public static boolean search(String key){
        // int idx=0;
        Node curr=root;
        for(int level=0;level<key.length();level++){
            int idx=key.charAt(level)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
       return curr.eow==true;
        
    }
    public static void findprefix(Node root,String ans){
        if(root==null){
            return;
        }
        if(root.frq==1){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++){
            if(root.children[i]!=null){
                findprefix(root.children[i],ans+(char)(i+'a'));

            }
        }
    }
    public static boolean startswith(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static int countnode(Node root){
        if(root==null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countnode(root.children[i]);
            }
        }
        return count+1;
    }
    public static void main(String args[]){
        //SHORTEST UNIQUE PREFIX
        // String arr[]={"zebra","dog","duck","dove"};
        // for(int i=0;i<arr.length;i++){
        //     insert(arr[i]);
        // }
        // root.frq=-1;
        // findprefix(root,"");

        //STARTSWITH  PREFIX PROBLEM
        // String words[]={"apple","app","mango","man","woman"};
        // String prefix1="app";
        // String prefix2="kull";
        //  for(int i=0;i<words.length;i++){
        //     insert(words[i]);
        // }
        // System.out.println(startswith(prefix2));
    

        //UNIQUE SUBSTRING
        String str="ababa";
        //SUFFIX ->INSERT IN TRIE
        for(int i=0;i<str.length();i++){
            String suffix=str.substring(i);
            insert(suffix);
        }
        System.out.println(countnode(root));


        // String words[]={"the","a","there","any","thee"};
        // for(int i=0;i<words.length;i++){
        //     insert(words[i]);
        // }
        // System.out.println(search("thee"));
        // System.out.println(search("thor"));
    }
}