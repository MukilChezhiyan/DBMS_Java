package mukilEdubridgejava;
import java.util.*;
public class Itr {

	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<String>();
		cities.add("Chennai");
		cities.add("Coimbatore");
		cities.add("Madurai");
		cities.add("Trichy");
		cities.add("Thanjavur");
		Iterator<String> it=cities.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
