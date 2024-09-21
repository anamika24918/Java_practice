public class Linkedlist{
    public static class Node{
      int data;
      Node next;
      public Node (int data){
        this.data=data;
        this.next=null;
      }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        //step1
        Node newNode =new Node(data);
        size++;
        if(head==null){
         head=tail=newNode;
        }
        //step2
        newNode.next=head;
        //step3
        head=newNode;
    }
    public void addlast(int data){
        Node newNode =new Node(data);
        size++;
        if(head==null){
            head =tail=newNode;
            tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("ll is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public void add(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //prev:i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int itrsearch(int key){//O(n)
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){//key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        //key not found
        return -1;
    }
    public int helper(Node head,int key){
        if(head ==null){
            return -1;
        }
        if (head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recsearch(int key){
        return helper(head,key);
    }

    public void reverse(){//o(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public void deletenthfromend(int n){
        //calculate size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        if(n==sz){
            head=head.next;//Remove first
            return;
        }
        //sz-n
        int i=1;
        int itofind=sz-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public Node Findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow ;//it is a mid node
    }
    public boolean checkpalindrome(){
        //Base case
        if (head==null || head.next==null){
            return true;
        }
        //find mid
        Node midnode=Findmid(head);
        //reverse 2nd half
        Node prev =null;
        Node curr=midnode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;//right half head
        Node left =head;
        //check left half and right half are equal
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
    return true;
    }

    private Node getmid(Node head){
  Node slow=head;
  Node fast=head.next;
 
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;//mid node
}
private Node merge(Node head1,Node head2){
      Node mergell=new Node(-1);
      Node temp=mergell;
      while(head1!=null && head2!=null){
        if(head1.data<=head2.data){
          temp.next=head1;
          head1=head1.next;
          temp=temp.next;
        }else{
          temp.next=head2;
          head2=head2.next;
          temp=temp.next;
        }
      }
      while(head1!=null){
        temp.next=head1;
        head1=head1.next;
        temp=temp.next;
      }
      while(head2!=null){
        temp.next=head2;
        head2=head2.next;
        temp=temp.next;
      }
      return mergell.next;
}

public Node mergesort(Node head){
  if (head==null || head.next==null){
    return head;
  }
  //find mid
  Node mid=getmid(head);
  //left and right ms
  Node righthead=mid.next;
  mid.next=null;
  Node newleft=mergesort(head);
  Node newright=mergesort(righthead);
  //merge
  return merge(newleft,newright);
}

public void zigzag(){
    //find mid
    Node slow=head;
    Node fast=head.next;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    Node mid=slow;
    //reverse 2nd half
    Node curr =mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    Node left=head;
    Node right=prev;
    Node nextL,nextR;
    //alt merge-zigzag merge
    while(left!=null && right!=null){
        nextL=left.next;
        left.next=right;
        nextR=right.next;
        right.next=nextL;

        left=nextL;
        right=nextR;

    }
}


    public static void main(String args[]){
        Linkedlist ll=new Linkedlist();
            ll.addlast(1);
 ll.addlast(2);
  ll.addlast(3);
   ll.addlast(4);
   ll.addlast(5);
   ll.print();
   ll.zigzag();
//    ll.head=ll.mergesort(ll.head);//incorrect output
   ll.print();

    //    ll.addfirst(2);
    //    ll.addfirst(1);
    //    ll.addlast(1);
    //    ll.addlast(2);
    //    ll.addlast(2);
    // //    ll.addlast(1);
    // //    ll.add(2,9);
    // //    ll.removefirst();
    // //    ll.print();
    // //    ll.deletenthfromend(3);
    // //    ll.reverse();
    //    ll.print();
    //    System.out.println(ll.checkpalindrome());
    //    System.out.println(ll.size);
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);
        // System.out.println(ll.itrsearch(3));
        // System.out.println(ll.itrsearch(10));
        // System.out.println(ll.recsearch(3));
    }
}