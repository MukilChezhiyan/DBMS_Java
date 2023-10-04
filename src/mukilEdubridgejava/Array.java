package mukilEdubridgejava;

public class Array {

	public static void main(String[] args) {
		//int[]=n number of arrays can be stored
		//int[7]=7 values only stored
		//for(type variable:arrayname)
		String[]chocolates= {"Kitkat","Milkybar","Diarymilk","Munch"};
		System.out.println(chocolates[0]);
		chocolates[0]="Perk";
		System.out.println(chocolates[0]);
		System.out.println(chocolates.length);
		
		for(int i=0;i<chocolates.length;i++) {
			System.out.println(chocolates[i]);
		}
		int[][]numbers= {{12,13,14},{15,16,17}};
		System.out.println(numbers[1][2]);
		System.out.println(numbers[0][1]);
		String[]drinks= {"Pepsi","Cococola","Miranda","Fanta"};
		for(String j:drinks) {
			System.out.println(j);
		}
		}
	}


