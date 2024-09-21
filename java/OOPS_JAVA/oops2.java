public class oops2{
    public static void main (String args[]){
        // fish shark =new fish();
        // shark.eat();
        Dog dobby =new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}

// //derived class -----example of single level
// class fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }

//multilevel 
class Mammal extends Animal{
    int legs;
}
class Dog extends Mammal{
    String breed;
}