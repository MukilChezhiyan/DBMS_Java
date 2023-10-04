package mukilEdubridgejava;

public class Multipleparameter {

	//multiple parameter
	static void method1(String Name,int age) {
		System.out.println(Name + "is" + age);
	}
	public static void main(String[]args){
		method1("Mukil", 21);
		method1("Ezhil", 29);
		method1("Geetha", 58);
	}
}
