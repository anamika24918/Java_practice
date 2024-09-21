import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.*;
public class greedy{
    static class job{
        int deadline;
        int profit;
        int id;

    public job(int i,int d,int p){
        id=i;
        deadline=d;
        profit=p;
    }    
    }


    public static void main(String args[]){
        //chocola problem
        int n=4,m=6;
        Integer costver[]={2,1,3,1,4};
        Integer costhor[]={4,1,2};
        Arrays.sort(costver,Collections.reverseOrder());
        Arrays.sort(costhor,Collections.reverseOrder());
        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;
        while(h<costhor.length && v<costver.length){
            if(costver[v]<=costhor[h]){
                cost+=(costhor[h]*vp);
                hp++;
                h++;
            }else{
                cost+=(costver[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costhor.length){
            cost+=(costhor[h]*vp);
            hp++;
            h++;
        }
        while(v<costver.length){
            cost+=(costver[v]*hp);
            vp++;
            v++;
        }
        System.out.println("min cost of cuts="+cost);






        // //JOB SEQUENCING PROBLEM
        // int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        // ArrayList<job>jobs=new ArrayList<>();
        // for(int i=0;i<jobinfo.length;i++){
        //     jobs.add(new job(i,jobinfo[i][0],jobinfo[i][1]));
        // }
        // Collections.sort(jobs,(obj1,obj2)-> obj2.profit-obj1.profit);//descending order of profit
        // ArrayList<Integer>seq=new ArrayList<>();
        // int time=0;
        // for(int i=0;i<jobs.size();i++){
        //     job curr=jobs.get(i);
        //     if(curr.deadline>time){
        //         seq.add(curr.id);
        //         time++;
        //     }
        // }
        // //print seq
        // System.out.println("max job="+seq.size());
        // for(int i=0;i<seq.size();i++){
        //     System.out.print(seq.get(i)+" ");
        // }
        // System.out.println();



        // //INDIAN COINS
        // Integer coins[]={1,2,5,10,20,50,100,500,2000};
        // Arrays.sort(coins,Comparator.reverseOrder());
        // int countofcoins=0;
        // int amount=590;
        // ArrayList<Integer>ans=new ArrayList<>();
        // for(int i=0;i<coins.length;i++){
        //     if(coins[i]<=amount){
        //         while(coins[i]<=amount){
        //         countofcoins++;
        //         ans.add(coins[i]);
        //         amount-=coins[i];
        //         }
        //     }
        // }
        // System.out.println("total(min) coins used="+countofcoins);
        // for(int i=0;i<ans.size();i++){
        //     System.out.println(ans.get(i)+" ");
        // }
        // System.out.println();


        // //MINIMUM SUM ABSOLUTE DIFFERENCE PAIRS
        // int A[]={1,2,3};
        // int B[]={2,4,3};
        // Arrays.sort(A);
        // Arrays.sort(B);
        // int minDiff=0;
        // for(int i =0;i<A.length;i++){
        //     minDiff+=Math.abs(A[i]-B[i]);
        // }
        // System.out.println("min absolut diff of pairs="+minDiff);


    //     //FACTIONAL KNAPSACK PROBLEM
    //     int val[]={60,100,120};
    //     int weight[]={10,20,30};
    //     int w=50;
    //     double ratio[][]=new double[val.length][2];
    //     //0th col=>idx;1st col=>ratio
    //     for(int i=0;i<val.length;i++){
    //         ratio[i][0]=i;
    //         ratio[i][1]=val[i]/(double)weight[i];
    //     }
    //     //ascending order
    //    Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
       
    //     int capacity=w;
    //     int finalval=0;
    //     for(int i=ratio.length-1;i>=0;i--){
    //         int idx= (int)ratio[i][0];
    //         if(capacity>=weight[idx]){//include full item
    //         finalval+=val[idx];
    //         capacity-=weight[idx];
    //         }else{
    //             //include fractional item
    //             finalval+=(ratio[i][1]*capacity);
    //             capacity=0;
    //             break;
    //         }

    //     }
    //     System.out.println("final value="+finalval);




        // int start[]={0,1,3,5,8,5};
        // int end[]={6,2,4,7,9,9};
        //sorting
        // int activities[][]=new int[start.length][3];
        // for(int i=0;i<start.length;i++){
        //     activities[i][0]=i;
        //     activities[i][1]=start[i];
        //     activities[i][2]=end[i];
        // }
        // //lambda function->shortform
        // Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        // //end time basis sorted
        // int maxAct=0;
        // ArrayList<Integer> ans = new ArrayList<>();
        // //1st activity
        // maxAct=1;
        // ans.add(activities[0][0]);
        // int lastend=activities[0][2];
        // for(int i=1;i<end.length;i++){
        //     if(activities[i][1]>=lastend){
        //         //activity select
        //         maxAct++;
        //         ans.add(activities[i][0]);
        //         lastend=activities[i][2];
        //     }
        // }

    // int start[]={1,3,0,5,8,5};
    // int end[]={2,4,6,7,9,9};
    // //end time basis sorted
    // int maxAct=0;
    // ArrayList<Integer> ans = new ArrayList<>();
    // //1st activity
    // int maxact=1;
    // ans.add(0);
    // int lastend=end[0];
    // for(int i=1;i<end.length;i++){
    //     if(start[i]>=lastend){
    //         //activity select
    //         maxact++;
    //         ans.add(i);
    //         lastend=end[i];
    //     }
    // }
    // System.out.println("max activities=" + maxAct);
    // for(int i=0;i<ans.size();i++){
    //     System.out.print("a"+ans.get(i)+" ");
    // }
    // System.out.println();
}
}