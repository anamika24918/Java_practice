import java.util.*;
public class loops{
    public static void main(String args[]){
        // print hello world for 5 times
    //     int counter=0;
    //     while(counter<5){
    //         System.out.println("hello world");
    //         counter++;
    //     }
    //     System.out.println("printed hw 100x");
    // }

    //     even numbers between 1 to 100
    // int i=0;
    // for (i=0; i<=100;i+=2){
    //     System.out.println(i);
    // }

    // second solution
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    if(n==2){
        System.out.println("n is prime");
    }
    else{
        boolean isprime =true;
    for (int i=2;i<=n-1;i++){
        if(n%i==0){
            isprime=false;
        }
    }
    if(isprime ==true){
        System.out.println("n is prime");
    }
    else{
        System.out.println("n is not prime");
    }
    }
   

    // solution:- 1
    // for (int i=0;i<5;i++){
    //     System.out.println("h");
    //     i+=2;
    // }

    // find factorial of any number
//     Scanner sc= new Scanner(System.in);
//     System.out.print("enter a number:");
//     int n=sc.nextInt();
//     int fact=1;
//     for (int i=1;i<=n;i++){
//         fact=fact*i;
//     }
//     System.out.println("the factorial of " + n + " is: " + fact);

// Write a program that reads a set of integers,and then prints the sum of the even and odd integers
// int choice;
// int number;
//     int evensum=0;
//     int oddsum=0;
//     Scanner sc=new Scanner(System.in);
//     do{
//             System.out.print("enter a number:");
//     number=sc.nextInt();

//         if (number%2==0){
//             evensum+=number;
//         }
//         else{
//             oddsum+=number;
//         }
//         System.out.println("enter the choice :0 or 1?");
//             choice=sc.nextInt();

//     }while(choice==1);
//     System.out.println("the sum of even number is :" +evensum);
//         System.out.println("the sum of odd number is :" +oddsum);

// sum of first n natural number
// int n;
// int i=1;
// int sum=0;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("enter the number");
//     n= sc.nextInt();
//     while(i<=n){
//         sum+=i;
//         i++;
//     }
//     System.out.println("sum is:" + sum);


// print square pattern
// for(int lines=1;lines<=4;lines++){
//     System.out.println("****");
// }

// print reverse of a number
    // int n=111102;
    // int rev=0;
    // while(n>0){
    //     int lastd=n%10;
    //     // System.out.print(lastd +" ");
    //     rev=(rev*10)+lastd;
    //     n=n/10;
    // }
    // System.out.println(rev);
 }
}