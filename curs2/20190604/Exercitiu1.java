//Write an function that recives an integer from 1-12. Print out corresponding month


public class Exercitiu1{
	public static void main (String[] args){
	
	System.out.println("Este luna" + month(1));

	}

	public static String month(int monthNumber){
		switch(monthNumber){
			case 1:
			return "January";

			case 2:
			return "February";

			case 3:
			return "March";

			case 4:
			return "April";

			default:
			return "nu exista luna";
		}
	}
}