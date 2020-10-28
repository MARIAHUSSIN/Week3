public class Exercise4{
	public static void main(String [] nilaiTerima){
		int [] tataInt = {10,20,30,40};
		//ordiniory for
		for (int i=0;i<tataInt.length; i++){
			System.out.println(tataInt[i]);
        }
		//for-each or advanced for
		for( int t: tataInt){
			System.out.println("for each : " + t);
		}
		
	}
}