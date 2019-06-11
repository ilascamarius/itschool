class ArrayExample{
	public static void main(String args[]){
		//definitie + size initialiation+element initialization
		int [] exSir=new int[]{1,2,3,4};
		System.out.println(exSir[0]);

		//definition+initialization
		System.out.println(exSir[0]);
		System.out.println(exSir[1]);
		System.out.println(exSir[2]);
		System.out.println(exSir[3]);

		//definition + initializaiton+change something

		exSir[1]=99;
		exSir[2]=100;
		exSir[3]=101;
			System.out.println(exSir[0]);
		System.out.println(exSir[1]);
		System.out.println(exSir[2]);
		System.out.println(exSir[3]);

		System.out.println(exSir.length);

	}
}