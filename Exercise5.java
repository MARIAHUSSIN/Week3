import java.util.Scanner;

public class Exercise5{
	public static void main(String [] nilaiTerima){
		
		String nama;
		int nombor;
		double noDouble;

		Scanner input =new Scanner(System.in);

		System.out.println("Enter a name :");
		nama=input.nextLine(); //or input.nextLine();
		System.out.println("Name is " + nama);

		System.out.println("Enter a number :");
		nombor=input.nextInt();
		System.out.println("Number is " + nombor);

		//input.nextLine();

		

		System.out.println("Enter a double :");
		noDouble=input.nextDouble();
		System.out.println("Number is " + noDouble);

		

		

		input.close();
		
	}
}