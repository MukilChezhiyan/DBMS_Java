package mukilEdubridgejava;

public class This {
   int var;
   This(int var){
	   this.var=var;
	   System.out.println("This is " +this);
   }
	public static void main(String[] args) {
		This obj=new This(3);
		System.out.println("This object is " +obj);
	}

}
