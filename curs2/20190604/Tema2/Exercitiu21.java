public class Exercitiu21{
	public static void main(String[] args){
		System.out.println("This is the month"+" "+varMonth(1));
	}

	public static String varMonth (int monthNumber) {
		switch (monthNumber){
			case 1:
			return "January";
			//break;
			default: 
			return "No month";
		}
	}
}