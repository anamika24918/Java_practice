import java.util.*;
public class arraylist{
    public static boolean pairsum1(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
               if(list.get(i)+list.get(j)==target){
                return true;
               } 
            }
        }
        return false;
    }

    public static boolean pairsum2(ArrayList<Integer>list,int target){
        int bp=-1;
        int n =list.size();
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=1;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case2
            if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                //case3
                rp=(n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        // ArrayList<Integer> list=new ArrayList<>();
        // list.add(1);
        // list.add(20);
        // list.add(3);
        // list.add(40);
        // list.add(5);
        // list.add(6);
        // //reverse print -O(n)
        // for(int i=list.size()-1;i>=0;i--){
        //     System.out.print(list.get(i)+" ");
        // }
        // System.out.println();

        //Find maximum
        // int max=Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
        //     max=Math.max(max,list.get(i));
        // }
        // System.out.println("max element:"+max);

        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        // //descending
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);

        //multidemional array
        // ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        // ArrayList<Integer>list=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // mainList.add(list);

        // ArrayList<Integer>list2=new ArrayList<>();
        // list2.add(3);
        // list2.add(4);
        // mainList.add(list2);
        // for (int i=0;i<mainList.size();i++){
        //     ArrayList<Integer>currList=mainList.get(i);
        //     for(int j=0;j<currList.size();j++){
        //         System.out.print(currList.get(j)+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println(mainList);

        //pairs sum
        // ArrayList<Integer>list=new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // int target=5;
        // System.out.print(pairsum1(list,target));

        //pair sum2
        ArrayList<Integer>list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.print(pairsum2(list,target));



    }
}