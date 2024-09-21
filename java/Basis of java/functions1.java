import java.util.*;
public class functions1{

public static void swap(int a ,int b){
    int temp=a;
    a=b;
    b=temp;
    System.out.println("a=" + a);
    System.out.println("b=" +b);
}

public static int factorial(int n){
    int f=1;
    for (int i=1;i<=n;i++){
        f=f*i;
    }
    return f;
}

public static int bincoeff(int n,int r){
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);
    int bincoef=fact_n / (fact_r*fact_nmr);
    return bincoef;
}


public static int sum(int a ,int b){
    return a+b;
}
public static int  sum(int a ,int b,int c){
    return a+b+c;
}

public static boolean isprime(int n){
    boolean isprime=true;
    for(int i=2;i<=n-i;i++){
        if(n%i==0){
            isprime=false;
            break;
        }
    }
    return isprime;

}

public static void primesinrange(int n){
    for(int i=2;i<=n;i++){
        if(isprime(i)){
            System.out.print(i +" ");
        }
    }
    System.out.println();
}

public static void bintodec(int num){
    int mynum=num;
    int pow=0;
    int decnum=0;
    while(num>0){
        int lastdigit=num%10;
        decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
        pow++;
        num=num/10;
    }
    System.out.println("Decimal of "+mynum +"="+decnum);
}

public static void dectobin(int num){
    int mynum=num;
    int pow=0;
    int binnum=0;
    while(num>0){
        int rem=num%2;
        binnum=binnum+(rem*(int)Math.pow(10,pow));
        pow++;
        num=num/2;
    }
    System.out.println("Decimal of "+mynum +"="+binnum);
}






public static void main(String args []){
    // int a=5;
    // int b=10;
    // swap(a,b);

    //  int fact=factorial(5);
    //  System.out.print("factorial os a number is:"+ fact);

    // System.out.println(bincoeff(5,2));

        // System.out.println(sum(1,5)); function overloading
        // System.out.println(sum(5,6,7)); function overloading

        // System.out.println(isprime(5));

        // primesinrange(20);

        // bintodec(101);

        dectobin(4);
}
}