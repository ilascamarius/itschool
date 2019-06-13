public class Exercitiu61{
	public static void main(String[] args){
		int[] varArray=new int[]{1,2,3,4,5};

		for (int i=0; i<varArray.length; i=i+3){

			System.out.print(Integer.toString(varArray[i]));
		}
	}
}