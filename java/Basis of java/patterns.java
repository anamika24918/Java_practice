 import java .util.*;
 public class patterns{
    public static void main(String args[]){
        // for (int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //       System.out.println();
        // }

        // inverted stars pattern
        // int n=4;
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // half pyramid
        // int n=4;
        // for (int line=1;line<=n;line++){
        //     for(int number=1;number<=line;number++){
        //         System.out.print(number);
        //     }
        //     System.out.println("");
        // }

        // print character 
        // int n=4;
        // char ch='A';
        // for (int i=1;i<=n;i++){
        //     for (int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // hollow rectangle pattern
    //      Scanner sc= new Scanner(System.in);
    // int n= sc.nextInt();
    //     int row=1;
    //     int stars=n;
    //     int spaces=n-2;
    //     while(row<=n-1){
    //         if(row==1||row==n-1){
    //             for (int i=0;i<stars;i++){
    //                 System.out.print("*");
    //             }
    //         }
    //         else{
    //             System.out.print("*");
    //             for (int i=0;i<n-2;i++){
    //                 System.out.print(" ");
    //             }
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //         row++;
    //     }

    // inverted half pyramid
    //  Scanner sc= new Scanner(System.in);
    //  int n= sc.nextInt();
    //  int total_row=n;
    //  int star=1;
    //  int spaces=n-1;
    //  int row=1;
    //  while(row<=total_row){
    //     for (int i=0;i<spaces;i++){
    //         System.out.print(" ");
    //     }
    //       for (int i=0;i<star;i++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     row++;
    //     spaces--;
    //     star++;
    //  }

    // inverted half-pyramid with numbers
    //  Scanner sc= new Scanner(System.in);
    //  int n= sc.nextInt();
    //  int total_row=n;
    //  int star=n;
    //  int spaces=0;
    //  int row=1;
    //  while(row<=total_row){
    //     int number=1;
    //     for(int i=0;i<star;i++){
    //         System.out.print(number);
    //         number++;
    //     }
    //     for (int i=0;i<spaces;i++){
    //         System.out.print(" ");
    //     }
    //     System.out.println();
    //     row++;
    //     spaces++;
    //     star--;
    //  }

    // Butterfuly pattern
    // Scanner sc= new Scanner(System.in);
    //  int n= sc.nextInt();
    //  int total_row=n;
    //  int star=1;
    //  int spaces=n-2;
    //  int row=1;
    //  while(row<=total_row){
    //     for (int i=0;i<star;i++){
    //         System.out.print("*");
    //     }
    //     for (int i=0;i<spaces;i++){
    //         System.out.print(" ");
    //     }
    //     for (int i=0;i<star;i++){
    //         System.out.print("*");
    //     }
    // System.out.println();
    //     if (row<(n/2)){
    //         star++;
    //         spaces=spaces-2;
    //         row++;
    //     }
    //     else if(row==(n/2)){
    //         row++;
    //     }
    //     else {
    //         star--;
    //         spaces=spaces+2;
    //         row++;
    //     }
    //  }


    // print a 0-1 pattern
    // Scanner sc= new Scanner(System.in);
    //  int n= sc.nextInt();
    //  for (int i =1;i<=n;i++){
    //     for (int j =1;j<=i;j++){
    //         if((i+j)%2==0){
    //             System.out.print(1 + " ");
    //         }
    //         else{
    //             System.out.print(0 +" ");
    //         }
    //     }
    //     System.out.println();
    //  }


    // diamond patterns
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();
    // int star=1;
    // int spaces=n-1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=star;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     spaces--;
    //     star+=2;
    // }
    // spaces=0;
    // star=(2*n)-1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=spaces;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=star;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //     spaces++;
    //     star-=2;
    // }

    // pyramid of numbers
        // Scanner sc=new Scanner(System.in);
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(' ');
        //     }
        //     for (int j=1;j<=i;j++){
        //         System.out.print(i);
        //         if(j!=i){
        //             System.out.print(' ');
        //         }
        //     }
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(' ');
        //     }
        //     System.out.println();

        // }

// palindrome pattern with numbers pattern
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
            // blank spaces before pyramid
            for(int j=1;j<=10-2*i;j++){
                System.out.print(' ');
            }
                // pyramid line first half
                for(int j=i;j>=2;j--){
                    System.out.print(j);
                    System.out.print(' ');
                }
                // pyramid line second half
            for (int j=1;j<=i;j++){
                System.out.print(j);
                if(j!=i){
                    System.out.print(' ');
                }
            }
            // blank spaces after pyramid
            for(int j=1;j<=10-2*i;j++){
                System.out.print(' ');
            }
            System.out.println();

        }



    }
 }