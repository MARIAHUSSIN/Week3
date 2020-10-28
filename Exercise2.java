public class Exercise2{
	public static void main(String [] nilaiTerima){
		int noInt=123;
		int noInt2=345;
		double noDouble=123.456;


		System.out.format("%4d dan%4d", noInt, noInt2);
		System.out.format("\n%6d", noInt2);
		System.out.format("\nRM%7.1f", noDouble);
		System.out.printf("\nRM%7.3f dan%4d" , noDouble, noInt);
	}
}