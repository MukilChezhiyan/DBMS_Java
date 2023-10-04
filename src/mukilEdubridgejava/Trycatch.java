package mukilEdubridgejava;

public class Trycatch {

	public static void main(String[] args) {
		try {
			String[] myString= {"Mukil","Subasri","Nithyashree"};
			System.out.println(myString[5]);
			}catch(Exception e) {
				System.out.println("Error");
			}finally {
				System.out.println("Finished");
			}
	}

}
