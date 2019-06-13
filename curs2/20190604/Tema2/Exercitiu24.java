public class Exercitiu24{
	public static void main (String[] args){
		System.out.println("The month is"+" "+varMonth(1));
	}

	public static String varMonth (int varNumber){
		switch(varNumber){
			case 1:
			return "This is first month";
			
			default:
			return "No month";
		}
	}
}