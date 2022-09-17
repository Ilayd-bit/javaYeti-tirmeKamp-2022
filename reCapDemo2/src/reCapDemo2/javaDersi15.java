package reCapDemo2;

public class javaDersi15 {

	public static void main(String[] args) {
		double[] myList = { 1.2, 1.3, 4.3, 5.6 };
		double total = 0;
		double max = myList[0];
		double min = myList[0];
		for (double number : myList) {
			
			if (max < number) {
				max = number;
				
			}
			if (min >number) {
				min = number; 
			
			}
			total = total+ number;
			System.out.println(number);
			
			
			
		}
		System.out.println("Toplam eşittir =" + total);
		System.out.println("En Büyük =" + max);
		System.out.println("En Küçük="+ min);
		
		// en büyük sayıyı yazdırmak için yapmamız gereken double max yazmaktır.
		
				

	}
}


