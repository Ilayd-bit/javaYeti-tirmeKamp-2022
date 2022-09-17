package arkadasSayılar;

public class javaDersi22 {

	public static void main(String[] args) {
		// Bilinen en küçük arkadaş sayılar 220-284'dür Kendileri hariç pozitif tam bölenleri birbirine eşit olan sayılara denir.
		int number1 = 284;
		int number2 = 220;
		int total1 = 0;
		int total2 = 0;
		
		for(int i= 1; i<number1;i++) {
			if(number1 % i== 0) {
				total1 = total1 + i;
				}
		}
		for(int i= 1; i<number2;i++) {
			if(number2 % i== 0) {
				total2 = total2 +i;
			}
		}
		
		if(number1==total2) {
			if(number2==total1) {
				System.out.println("Bu iki sayı arkadaştır"); 
			} else {
					System.out.println("Bu iki sayı arkadaş değildir");
					
				}
					
				}
				
			}
	
		
	}

				
