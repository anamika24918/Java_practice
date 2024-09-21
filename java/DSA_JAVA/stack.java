import java.util.*;
public class stack{
//     /*STACK IMPLEMENTATION BY LINKEDLIST*/
//     static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }

//     }
//     static class Stack{
//         static Node head=null;
//         public static boolean isEmpty(){
//             return head==null;
//         }
//         //push
//         public static void push(int data){
//           Node newNode =new Node(data);
//           if(isEmpty()){
//             head=newNode;
//             return;
//           }  
//           newNode.next=head;
//           head=newNode;
//         }
//     //pop
//     public static int pop(){
//         if(isEmpty()){
//             return -1;
//         }
//         int top=head.data;
//         head=head.next;
//         return top;
//     }
//     //peek
//     public static int peek(){
//         if(isEmpty()){
//             return -1;
//         }
//         return head.data;
//     }

//                 /*STACK IMPLEMENTATION BY ARRAYLIST*/
//         // static ArrayList<Integer> list=new ArrayList<>();
//         // public static boolean isEmpty(){
//         //     return list.size()==0;
//         // }
//         // //push
//         // public static void push(int data){
//         //     list.add(data);
//         // }
//         // //pop
//         // public static int pop(){
//         //     if(isEmpty()){
//         //         return -1;
//         //     }
//         //     int top=list.get(list.size()-1);
//         //     list.remove(list.size()-1);
//         //     return top;
//         // }
//         // //peek
//         // public static int peek(){
//         //     if(isEmpty()){
//         //         return -1;
//         //     }
//         //     return list.get(list.size()-1);
//         // }
//     }
    public static void pushatbottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushatbottom(s,data);
        s.push(top);
    }
    public static String reversestring(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void reversestack(Stack<Integer>s){
        if(s.isEmpty()){
            return ;
        }
        int top =s.pop();
        reversestack(s);
        pushatbottom(s,top);
    }
    public static void printStack(Stack<Integer>s){
        while(! s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void stockspan(int stocks[],int span[]){
        Stack<Integer> s=new Stack<>();
        span[0]=1;
        s.push(0);
        for (int i=1;i<stocks.length;i++){
            int currPrice =stocks[i];
            while(!s.isEmpty()&& currPrice>stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }else{
                int prevhigh=s.peek();
                span[i]=i-prevhigh;
            }
        }
    }
    public static boolean isduplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //closing
            if(ch==')'){
                int count=0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;//duplicate
                }else{
                    s.pop();//opening pair
                }
                }
                else{
                    //opening
                    s.push(ch);
                }
            
        }
        return false;
    }
    public static void main(String args[]){
        String str="((a+b))";//true
        String str2="(a-b)";//false
        System.out.println(isduplicate(str2));
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nxtgreater[]=new int[arr.length];
        for (int i=arr.length-1;i>=0;i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //2 if else
            if(s.isEmpty()){
                nxtgreater[i]=-1;
            }else{
                nxtgreater[i]=arr[s.peek()];
            }
            //3push in s
            s.push(i);
        }
        for(int i=0;i<nxtgreater.length;i++){
            System.out.println(nxtgreater[i]+" ");
        }
        // int stocks[]={100,80,60,70,60,85,100};
        // int span[]=new int[stocks.length];
        // stockspan(stocks,span);
        // for(int i=0;i<span.length;i++){
        //     System.out.println(span[i]+" ");
        // }
        // Stack<Integer>s=new Stack<>();//from JCF
        // // // Stack s=new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
      
        // reversestack(s);
        // printStack(s);
        // pushatbottom(s,4);

        // while(!s.isEmpty()){
        //     System.out.println(s.pop());
        // //     System.out.println(s.peek());
        //     // s.pop();
        // }
        // String str="abc";
        // String result=reversestring(str);
        // System.out.println(result);
    }
}
