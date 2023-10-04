package mukilEdubridgejava;
import java.util.*;
public class Arraylist {
public static void main(String[] args) {
		ArrayList<String> chocolates=new ArrayList<String>();
		chocolates.add("5.Kitkat");
		chocolates.add("3.Perk");
		chocolates.add("1.Munch");
		chocolates.add("4.Dairy milk");
		chocolates.add("2.Milky bar");
		System.out.println(chocolates);
		System.out.println("Length of the array:"+" "+chocolates.size());
		System.out.println("Sorted Array");
		Collections.sort(chocolates);
		for(String i:chocolates) {
		System.out.println(i);
		}
		chocolates.remove(5);
		System.out.println(chocolates);		
		
		

	}

}
