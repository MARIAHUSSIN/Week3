import java.util.Scanner;

public class Exercise7{
	public static void main(String [] nilaiTerima){
		int noInt=10,x;

		//if(noInt==10)
			//System.out.println("sama");
		//else
			//System.out.println("tak sama");

		System.out.println(noInt==10 ? "sama" : "tak sama");
		if(noInt==10)
			x=3;
		else
			x=19;

		//ternary operator
		x=noInt==10 ? 3: 19;
		System.out.println("x is " + x);

	}
}