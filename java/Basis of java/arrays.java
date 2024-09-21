 import java .util.*;
 public class arrays{
    public static void update(int marks[]){
        for (int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void linear(int arr[],int target){
        int ans=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                ans=1;
                break;
            }
        }
        System.out.print(ans);
        System.out.println();
    }

    public static void binary(int arr[],int target){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                ans=mid;
                break;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
        }
        System.out.print(ans);
        System.out.println();
    }


    public static int largestnum(int num[]){
        int largest=Integer.MIN_VALUE;//-infinity
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("smallest number is:"+ smallest);
        return largest;
    }

    public static void reverse(int num[]){
        int first=0,last=num.length-1;
        while(first<last){
            int temp=num[last];
            num[last]=num[first];
            num[first]=temp;
            first++;
            last--;

        }
    }

    public static void printpairs(int num[]){
        for(int i=0;i<num.length;i++){
            int curr=num[i];//3,6,7,8
            for(int j=i+1;j<num.length;j++){
                System.out.print("(" + curr+ "," + num[j] +")");
            }
            System.out.println();
        }
    }

    public static void printsubarrays(int num[]){
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(num[k]+" ");//subarray
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxsumsubarrays(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum+=num[k];//subarraysum
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            
        }
        System.out.println("max sum="+maxsum);
    }


     public static void prefixsumsubarray(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currsum=0;
                currsum=start==0? prefix[end]:prefix[end]-prefix[start-1];
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
            
        }
        System.out.println("max sum="+maxsum);
    }




    public static void main(String args[]){
        // int marks[]={32,34,56};
        // int arr[]={1,3,5,7};
        // int arr2[]={1,4,6,8,9};
        // update(marks);
        // linear(arr,3);
        // binary(arr2,9);
        // for(int i=0;i<marks.length;i++){
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println();
        int num[]={2,4,6,8,10};
        // printpairs(num);
        // printsubarrays(num);


        // maxsumsubarrays(num);

        prefixsumsubarray(num);





        // reverse(num);
        //  for(int i=0;i<num.length;i++){
        //     System.out.print(num[i]+" ");
        // }
        // System.out.println();
        // System.out.println("largest number is:"+largestnum(num));
    }
 } 