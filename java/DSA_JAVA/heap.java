import java.util.*;
public class heap{

    static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();
        public void add (int data){
            arr.add(data);
            int x=arr.size()-1;
            int par=(x-1)/2;
            while(arr.get(x)<arr.get(par)){//0(logn)
                int temp=arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);
                x=par;
                par=(x-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr.size() && arr.get(minidx)>arr.get(left)){
                minidx=left;
            }
            if(right<arr.size() && arr.get(minidx)>arr.get(right)){
                minidx=right;
            }
            if(minidx!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);
                heapify(minidx);
            }
        }
        public int remove(){
            int data=arr.get(0);
            //step1 swap first and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //step2 delete last
            arr.remove(arr.size()-1);
            //step3 heapify
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    // static class Student implements Comparable<Student>{//overriding
    //     String name;
    //     int rank;
    //     public Student(String name,int rank){
    //         this.name=name;
    //         this.rank=rank;
    //     }
    //     @Override
    //     public int compareTo(Student s2){
    //         return this.rank-s2.rank;
    //     }
    // }
    public static void main( String args[]){
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }


        // PriorityQueue<Student> pq=new PriorityQueue<>();
        // pq.add(new Student("A",4));
        // pq.add(new Student("B",5));
        // pq.add(new Student("C",6));
        // pq.add(new Student("D",7));
        // while(!pq.isEmpty()){
        //     System.out.println(pq.peek().name +"->"+pq.peek().rank);
        //     pq.remove();
        // }


    }
}
