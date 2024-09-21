public class recursion{
    public static void printdec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);

        // printinc(n-1);
        // System.out.print(n+"");
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);

        // return n+ sum(n-1);// for calculate n natural number's sum 
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
       
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static boolean isSorted(int arr[],int i){
        if(i ==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);
    }

    public static int firstoccurence(int arr[],int key,int i){
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccurence(arr,key,i+1);
    }

    public static int lastoccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound= lastoccurence(arr,key,i+1);
        if(isfound == -1 && arr[i]==key){
            return i;
        }
        return isfound;
    }

    public static int optimizedpower(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower=optimizedpower(a,n/2);
        int halfsquare=halfpower*halfpower;
        // int halfsquare=optimizedpower(a,n/2)*optimizedpower(a,n/2);//O(n)

        //n is odd
        if(n%2!=0){
            halfsquare=a*halfsquare;
        }
        return halfsquare;
    }


    public static int tilingproblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1=tilingproblem(n-1);
        //horizontal choice
        int fnm2=tilingproblem(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void removeduplicates(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            removeduplicates(str,idx+1,newStr,map);
        }
        else{
           map[currchar-'a']= true;
           removeduplicates(str,idx+1,newStr.append(currchar),map);
        }
    }

    public static int friendspair(int n){
        if (n==1 || n==2){
            return n;
        }
        //choice
        //single
        int fnm1=friendspair(n-1);
        //pair
        int fnm2=friendspair(n-2);
        int pairs=(n-1)*fnm2;

        //totalways
        int totalways=fnm1+pairs;
        return totalways;
    }

    public static void  printbinstring(int n,int lastplace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        printbinstring(n-1,0,str+"0");
        if(lastplace ==0){
            printbinstring(n-1,1,str+"1");
        }
    }

    public static void main(String args[]){
        // int n=25;
        // printdec(n);
        // System.out.println(fact(n));//O(n)
        // System.out.println(fibonacci(n));

        // int arr[]={1,2,8,4};
        // System.out.println(isSorted(arr,0));//O(n)

        // int arr[]={8,3,6,9,4,5,6,8};
        // System.out.println(firstoccurence(arr,5,0));

        // System.out.println(lastoccurence(arr,8,0));

        // int a=2;
        // int n=10;
        // System.out.println(optimizedpower(a,n));

        // System.out.println(tilingproblem(4));

        // String str="aappueerewtw";
        // removeduplicates(str,0,new StringBuilder(""),new boolean[26]);

        // System.out.println(friendspair(3));

        printbinstring(3,0,"");
    }

}