package mükemmelSayı;

public class javaDersi21 {

	public static void main(String[] args) {
		// Mükemmel sayı kendinden başka pozitif tam bölenlerin sayısı kendisine eşit olan denir.
		// 6,28 mükemmel sayılara örnektir.
		int number = 27;
		int total = 0;
		for(int i = 1;i<number;i++) {
			if(number % i ==0) {
				total = total +i ;
				
			}
			
		}
		if(total==number) {
			System.out.println("Mükemmel sayıdır");
		}else {
			System.out.println("Mükemmel sayı değildir");
		}

	}

}
