package mukilEdubridgejava;

public class Staticvariable {
   static int mark=76;
   String name;
	public static void main(String[] args) {
		Staticvariable obj1=new Staticvariable();
		Staticvariable obj2=new Staticvariable();
		obj1.mark=76;
		obj1.name="Mukil";
		obj2.mark=99;
		obj2.name="Nithya";
		System.out.println("Obj1 integer:" +obj1.mark);
		System.out.println("Obj1 string:" +obj1.name);
		System.out.println("Obj2 integer:" +obj2.mark);
		System.out.println("Obj2 string:" +obj2.name);
	}

}
