class Operators{
	public static void main(String args[]){
		int result = add (2,2);
		System.out.println(result);
		int result2=sub(2,2);
		System.out.println(result2);
		int result3=div(2,2);
		System.out.println(result3);
		int result4=rest(2,2);
		System.out.println(result4);
		String result5=conc(2,2);
		System.out.println(result5);


	}

	public static int add(int termen1, int termen2){
		return termen1+termen2;
	}


	public static int sub (int termen1, int termen2){
		return termen1-termen2;

	}

	public static int div (int termen1, int termen2){
		return termen1/termen2;
	}

	public static int rest (int termen1, int termen2){
		return termen1%termen2;
	}
	
	//termen2xcat+restul

	public static String conc (int termen1, int termen2){
		return termen2+"*"+div(termen1, termen2)+"+"+rest(termen1, termen2);
	}

	/*public static void String conc(int termen1, int termen2){
	return termen
}*/

}