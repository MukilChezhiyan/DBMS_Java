package mukilEdubridgejava;

public class Staticblock {
    static int marks;
    static String name;
    static {
    	marks=100;
    	name="Mukil";
    }
	public static void main(String[] args) {
		System.out.println("Name of the student is: " +name);
		System.out.println("Marks obtained: " +marks);

	}

}
