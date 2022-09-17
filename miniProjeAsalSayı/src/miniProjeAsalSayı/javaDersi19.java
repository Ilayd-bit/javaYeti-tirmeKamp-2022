package miniProjeAsalSayı;

public class javaDersi19 {

	public static void main(String[] args) {
		int number = -2;
		int remainder = number % 2; // 2 ile bölümünden kalan.
		
		System.out.println(remainder); // asal sayı olup olmadığını bulan program şu şekildedir; isprime asal sayı mı
										// demektir. 1 ise asal sayı değildir.
		boolean isPrime = true;

		if (number == 1) {
			System.out.println("Sayı asal değildir");
			return;

		}

		if (number < 2) {
			System.out.println("Geçersiz sayı");
		}

		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;

			}

		}
		if (isPrime) {
			System.out.println("Sayı asaldır");
		} else {
			System.out.println("Sayı asal değildir");

		}

	}

}
