public class queue{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        //add
        public static void add(int data){//circular queue
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        // public static void add(int data){
        //     if(rear ==size-1){
        //         System.out.println("queue is full");
        //         return;
        //     }
        //     rear=rear+1;
        //     arr[rear]=data;
        // }
        //remove
        // public static int remove(){
        //     if(isEmpty()){
        //         System.out.println("empty queue");
        //         return -1;
        //     }
        //     int front =arr[0];
        //     for(int i=0;i<rear;i++){
        //         arr[i]=arr[i+1];
        //     }
        //     rear=rear-1;
        //     return front;
        // }
        public static int remove(){//circular queue
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int res=arr[front];
            if (rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return res;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            // return arr[0];
            return arr[front];//circular queue
        }
    }
    public static void main(String args[]){
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}