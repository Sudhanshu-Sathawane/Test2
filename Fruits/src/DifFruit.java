class Fruit{
	String name;
	String taste;
	int size;
	void eat() {
		System.out.println("This is Fruit");
	}
}
class Orange extends Fruit{
	void eat() {
		System.out.println("Fruit is Orange");
	}
}
class Apple extends Fruit{
	void eat() {
		System.out.println("Fruit is Apple");
	}
}

public class DifFruit {

	public static void main(String[] args) {
		Orange O=new Orange();
		Apple A=new Apple();
		Fruit F=new Fruit();
		O.eat();
		A.eat();
		F.eat();
	}

}
