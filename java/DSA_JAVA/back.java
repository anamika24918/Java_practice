public class back{
    public static void findsubsets(String str,String ans,int i){
        //base case
        if(i== str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //yes choice 
        findsubsets(str,ans+str.charAt(i),i+1);
        //no choice
        findsubsets(str,ans,i+1);

    }

    public static void findpermutation(String str,String ans){
        //base case
        if (str.length()==0){
            System.out.println(ans);
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //"abcde"=>"ab"+"de"="abde"
            String newstr=str.substring(0,i)+str.substring(i+1);
            findpermutation(newstr,ans+curr);
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertical_up dir
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // left dia_up dir
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //right dia_up dir
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
    return true;
    }
    public static void nqueen(char board[][],int row){
        //base
        if(row==board.length){
            // printboard(board);
            count++;
            return;

        }
        //column loop
        for(int j=0;j<board.length;j++){
            if (isSafe(board,row,j)){
                 board[row][j]='Q';
            nqueen(board,row+1);
            board[row][j]='.';

            }
            // board[row][j]='q';
            // nqueen(board,row+1);
            // board[row][j]='.';
            }
    }
    public static void printboard(char board[][]){
        System.out.println("...........chess board......");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static int gridways(int i,int j,int n,int m){
        //base case
        if(i ==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==n){
            return 0;
        }


        int w1=gridways(i+1,j,n,m);
        int w2=gridways(i,j+1,n,m);
        return w1+w2;
    }
    static int count=0;
    public static void main(String args[]){
        // String str="abc";
        // // findsubsets(str,"",0);
        //     findpermutation(str,"");

        // int n=5;
        // char board[][]=new char[n][n];
        // for (int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j]='.';
        //     }
        // }
        // nqueen(board,0);
        // System.out.println("total ways to solve n queens:"+ count);

        int n=3,m=3;
        System.out.println(gridways(0,0,n,m));
    }
} 