// sum of a and b with the help of user inputs
import java.util.*;
public class JavaBasics{
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int a= sc.nextInt();
        // int b=sc.nextInt();
        // int sum=a+b;
        // System.out.println(sum);


// product of two numbers
    // Scanner sc=new Scanner(System.in);
    //     int a= sc.nextInt();
    //     int b=sc.nextInt();
    //     int product=a*b;
    //     System.out.println(product);
// area of a circle
        // Scanner sc=new Scanner(System.in);
        // float r= sc.nextFloat();
        // float area=3.14f*r*r;
        // System.out.println(area);



// CONDITIONAL STATEMENTS
        // int age=20;
        // if(age>=18){
        //     System.out.println("adilt: drive,vote");
        // }
        // else{
        //     System.out.println("not audult");
        // }

    // PRINT THE LARGEST OF TWO NUMBER  
        //   int A =3;
        //   int B=4;
        //   if(A>B){
        //     System.out.println("A is greater");
        //   }
        //   else{
        //     System.out.println("B is greater");
        //   }

    // PRINT IF A NUMBER IS ODD OR EVEN   
        // Scanner sc=new Scanner(System.in);
        // int n= sc.nextInt();
        // if (n%2==0){
        //     System.out.println("the number is even");
        // }
        // else{
        //     System.out.println("the number is odd");
        // }

    // INCOME TAX CALCULATOR
        // Scanner sc=new Scanner(System.in);
        // int income=sc.nextInt();
        // int tax;
        // if (income<500000){
        //     tax=0;
        // }
        // else if(income>=500000 && income<1000000){
        //     tax=(int) (income*0.2);
        // }
        // else{
        //     tax=(int)(income*0.3);
        // }
        // System.out.println("your tax is:" + tax);

    // LARGEST BETWEEN THREE NUMBER
        // int a=1,b=3,c=6;
        // if ((a>=b) && (a>=c)){
        //     System.out.println("largest is a");
        // } 
        // else if(b>=c){
        //     System.out.println("largest is b");
        // }
        // else{
        //     System.out.println("largest is c");
        // }

    // TERNERY OPERATORS
        // int marks=67;
        // String reportcard = marks>=33? "PASS":"FAIL";
        // System.out.println(reportcard);


    //   CALCULATOR  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("Enter b:");
        int b=sc.nextInt();
        System.out.println("Enter operator(+,-,*,/,%):");
        char operator=sc.next().charAt(0);

        switch(operator){
            case '+':System.out.println(a+b);
                        break;
            case '-':System.out.println(a-b);
                        break;
            case '*':System.out.println(a*b);
                        break;
            case '/':System.out.println(a/b);
                        break;
            case '%':System.out.println(a%b);
                        break;
             default:System.out.println("wrong operator");           






        }




    }
}