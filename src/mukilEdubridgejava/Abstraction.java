package mukilEdubridgejava;


abstract class Animal{
	private String name;
	public Animal(String name) {
		this.name=name;
	}
	public abstract void sound();
	public String getName() {
		return name;
	}
		class Horse extends Animal{
			public Horse(String name) {
				super(name);
			}
			public void sound() {
				System.out.println(getName() + "Neigh neigh");
			}
		}
		class Cat extends Animal{
			public Cat(String name) {
				super(name);
			}
			public void sound() {
				System.out.println(getName() + "Meow meow");
			}
		}
		public class Abstraction {
			public static void main(String[]args) {
				Animal obj1=new Horse("runs fast");
				Animal obj2=new Cat("looks cute");
				obj1.sound();
				obj2.sound();
			}

	}

}
