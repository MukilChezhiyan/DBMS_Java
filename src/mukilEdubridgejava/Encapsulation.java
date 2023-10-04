package mukilEdubridgejava;

public class Encapsulation {
	private String planets;
	public String getPlanets() {
		return planets;
	}
public void setPlanets(String newPlanets) {
	this.planets=newPlanets;
}

public static void main(String[]args) {
	Encapsulation obj=new Encapsulation();
	obj.setPlanets("Mercurey,Venus,Earth,Mars,Jupiter,Saturn,Uranus,Neptune");
	System.out.println(obj.getPlanets());
}
}
