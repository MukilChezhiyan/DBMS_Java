package mukilEdubridgejava;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,String>opp=new HashMap<String,String>();
		opp.put("Strong", "Weak");
		opp.put("Tall", "Short");
		opp.put("Large", "Small");
		opp.put("Friend", "Foe");
		System.out.println(opp);
		System.out.println(opp.get("Friend"));
		opp.remove("Large");
		System.out.println(opp.size());
		System.out.println(opp);
	}

}
