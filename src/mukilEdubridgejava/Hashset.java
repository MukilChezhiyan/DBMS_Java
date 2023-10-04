package mukilEdubridgejava;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		HashSet<Integer>num=new HashSet<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		System.out.println(num);
		System.out.println(num.contains(1));
		num.remove(5);
		System.out.println(num);
		System.out.println(num.size());
		for(int i=1;i<=9;i++) {
			if(num.contains(i)) {
				System.out.println(i+"found in set");
				}else {
					System.out.println(i+"not found in set");
				}
		}
	}

}
