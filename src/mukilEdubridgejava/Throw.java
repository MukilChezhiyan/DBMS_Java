package mukilEdubridgejava;

public class Throw {
static void Result(int marks) {
	if(marks<50) {
		throw new ArithmeticException("fail");
	}
	else {
		System.out.println("pass");
	}
}
	public static void main(String[] args) {
		Result(45);
		
	}

}
