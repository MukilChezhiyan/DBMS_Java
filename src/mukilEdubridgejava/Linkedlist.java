package mukilEdubridgejava;
import java.util.*;
public class Linkedlist {

	public static void main(String[] args) {
		LinkedList<String> Languages=new LinkedList<String>();
		Languages.add("English");
		Languages.add("Tamil");
		Languages.add("Hindi");
		Languages.addFirst("Malayalam");
		Languages.addLast("Urudu");
		System.out.println(Languages);
		Languages.removeFirst();
		System.out.println("Remove the first element"+""+Languages);
		Languages.removeLast();
		System.out.println("Remove the last element"+""+Languages);
		System.out.println("Skill set"+""+Languages);
		}

}
