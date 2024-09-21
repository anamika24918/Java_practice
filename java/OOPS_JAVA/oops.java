public class oops{
    public static void main(String args[]){
        Pen p1=new Pen();//pen object  called p1
        p1.setColor("Blue");
        // System.out.println(p1.color);
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        // Bankaccount myacc =new Bankaccount();
        // myacc.username="Anamika";
        // // myacc.password="abc";//not possible
        // myacc.setpassword("absfdgg");
    }
}
class Bankaccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password =pwd;
    }
}

class Pen{
    private String color;
    private int tip;
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;

    }
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int tip){
       this. tip=tip;
    }
}