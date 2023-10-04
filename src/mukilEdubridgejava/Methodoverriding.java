package mukilEdubridgejava;

public class Methodoverriding {
class Result{
	int getMarks() {
		return 0;
	}
	class Maths extends Result{
		int getMarks() {
			return 50;
		}
		class Science extends Result{
			int getMarks() {
				return 90;
			}
		}
	}
}


	}


