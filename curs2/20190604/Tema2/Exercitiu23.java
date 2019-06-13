public class Exercitiu23{
	public static void main (String[] args){
		System.out.println("Thi is"+" "+methodMonth(1));
	}

	public static String methodMonth(int varMonth){
		switch (varMonth){
			case 1: 
			return "January";

			default:
			return "No month";
		}
	}
}