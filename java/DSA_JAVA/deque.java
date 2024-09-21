import java.util.*;
public class deque{
    static class Stack{
        Deque<Integer>deque=new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }

    static class Queue{
        Deque<Integer>deque=new LinkedList<>();
        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }
    public static void main(String args[]){
        //QUEUE USING DEQUE
        Queue q=new Queue();//constructor
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek="+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());


        //STACK USING DEQUE
        // Stack s=new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println("peek="+s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        //DEQUE OPERATIONS USING JCF
        // Deque<Integer>deque=new LinkedList<>();
        // deque.addFirst(1);
        // deque.addFirst(2);
        // deque.addLast(3);
        // deque.addLast(4);
        // System.out.println(deque);
        // deque.removeFirst();
        // deque.removeLast();
        // System.out.println(deque);
        // System.out.println("first element"+deque.getFirst());
        // System.out.println("last element"+deque.getLast());
    }

}