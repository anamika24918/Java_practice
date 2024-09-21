public class oops4{
    public static void main (String args[]){
        // Horse h=new Horse();
        // h.eat();
        // h.walk();

        // // Chicken c=new Chicken();
        // // c.eat();
        // // c.walk();
        // // Animal a=new Animal();//we can not create a object of a instance
        // System.out.println(h.color);


        queen q=new queen();
        q.moves();
    }
}

abstract class Animal{
    // Animal(){//constructor
    //     color="brown";
    // }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
}
class Horse extends Animal {
    // void changecolor() {
    //     color = "dark brown";
    // }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}


class  Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}


//INTERFACE
interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all directions)");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}