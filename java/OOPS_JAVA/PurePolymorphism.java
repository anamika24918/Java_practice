
public class PurePolymorphism{
    public static void main(String args[]){
        ParentClass obj = new ParentClass();
		obj.showData();
		obj=new ChildClass();
		obj.showData();

    }
}
 class ParentClass{
	int num = 10;
	void showData() {
		System.out.println("Inside parentClass ");
		System.out.println("num ="+ num);
	}
}
class ChildClass extends ParentClass{
	void showData() {
		System.out.println("Inside childClass showData() method");
		System.out.println("num = " + num);
	}
}
