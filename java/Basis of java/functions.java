public class functions{
    public static void hollow_rec(int t_rows,int t_cols){
        for(int i=1;i<=t_rows;i++){
            for(int j=1;j<=t_cols;j++){
                if(i==1 || i==t_rows || j==1 || j==t_cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


  public static void i_r_h_puramid(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }   
    System.out.println(); 
    }
  }  

  public static void floyds_tri(int n){
    int count=1;
    for (int i=1;i<=n;i++){
    for(int j=1;j<=i;j++){
        System.out.print(count + " ");
        count++;
    }
    
    System.out.println();
    }
  }


public static void butterfuly(int n){

    for(int i=1;i<=n;i++){
        for( int j=1;j<=i;j++){
        System.out.print("*");
        }
    for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
    } 
    // 2nd half
    for(int i=n;i>=1;i--){
        for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i; j++){
        System.out.print("*");
    }
    System.out.println();
    }

}

    public static void hollow_rhombus(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    

  
    public static void main(String args[]){
        // hollow_rec(4,5);
        // i_r_h_puramid(4);
        // floyds_tri(5);
        // butterfuly(4);
         hollow_rhombus(5);

    }
}