package mukilEdubridgejava;

public class Attribute {
int x;
	public static void main(String[] args) {
		//modify
		Attribute obj=new Attribute();
		obj.x=34;
		System.out.println(obj.x);
		//override
		int x=11;
		Attribute obj2=new Attribute();
		obj2.x=33;
		System.out.println(obj2.x);
	}

}
