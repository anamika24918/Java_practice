public class oops5{
    public static void main(String args[]){
        // Student s1=new Student();
        // s1.schoolName="MPS";
        // Student s2=new Student();
        // System.out.println(s2.schoolName);

        Horse h=new Horse();
        System.out.println(h.color);
    }
}
class Student{
    String name;
    int roll;
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}


//super keyword
class Animal{
    String color;
    Animal(){
        System.out.println("Animal");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="red";
        System.out.println("horse");
    }
}