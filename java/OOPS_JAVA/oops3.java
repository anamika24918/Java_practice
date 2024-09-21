public class oops3{
    public static void main (String args[]){
        // Calculator calc=new Calculator();
        // System.out.println(calc.sum(1,2));
        // System.out.println(calc.sum((float)1.3,(float)4.5));
        // System.out.println(calc.sum(1,3,4));
        Deer d=new Deer();
        d.eat();
    }
}
//method overloading
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}

//method overriding
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
}