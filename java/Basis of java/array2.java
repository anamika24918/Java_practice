import java.util.*;
public class array2{
    public static void kadanes(int numbers[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for (int i=0;i<numbers.length;i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("our max subarray sum is:"+ms);

    }


    public static int trappedRainwater(int height[]){
        int n =height.length;
        //calculate left max boundary -array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);

        }
        //calculate right max boundary-array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);

        }
        int trap=0;
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(leftMax[i],rightMax[i]);
            trap+=waterlevel-height[i];
        }
        return trap;
    }



    public static int buyandsell(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i=0;i<prices.length;i++){
            if(buyprice<prices[i]){ //profit
            int profit=prices[i]-buyprice;//today's profit
            maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buyprice=prices[i];
            }
        }
        return maxprofit;
    }


    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);

        // int height[]={4,2,0,6,3,2,5};
        // System.out.println(trappedRainwater(height));

        // int prices[]={7,1,5,3,6,4};
        // System.out.println(buyandsell(prices));
    }

}