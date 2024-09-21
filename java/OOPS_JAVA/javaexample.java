import java.util.Scanner;
class javaexample{
        static void checkEligibility(int stuage,int stuweight){
    if(stuage<12 && stuweight<40){
    throw new ArithmeticException("Student not eligible:");
    }
    else{
    System.out.println("Valid student");
}}
    public static void main(String[] args){

        //EXAMPLE 1
        // int n1,n2;
        // Scanner scan=new Scanner(System.in);
        // System.out.print("enter first number(dividend):");
        // n1=scan.nextInt();
        //  System.out.print("enter second number(divisor):");
        // n2=scan.nextInt();
        // int div=n1/n2;
        // System.out.println("quotient:"+div);

        // //EXAMPLE2
        // try{
        //     // int num=Integer.parseInt("123");
        //     // int num=Integer.parseInt("xyz");
        //     int num=Integer.parseInt("1010",2);
        //     System.out.println(num);
        // }catch(NumberFormatException e){
        //     System.out.println("number format exception occurred");
        // }

        //EXAMPLE3
        // try{
        //     String str="beginnersbook";
        //     System.out.println(str.length());
        //     char c=str.charAt(40);
        //     System.out.println(c);
        // }catch(StringIndexOutOfBoundsException e){
        //     System.out.println("Stringindexoutofboundsexception");

        // }

        //EXAMPLE 4
        checkEligibility(100,50);
        System.out.println("Good day");
       
    }
}