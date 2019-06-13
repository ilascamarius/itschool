public class Exercitiu22{
	public static void main (String[] args){
		System.out.println("This is the month"+" "+varMonth(2));
	}

	public static String varMonth(int numberMonth){
		switch(numberMonth){
			case 1:
			return "February";

			default:
			return "No month";
		}
	}
}