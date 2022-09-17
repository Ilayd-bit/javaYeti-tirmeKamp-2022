package switchDemo;

public class javaDersi10 {

	public static void main(String[] args) {
		// switch blokları if'e göre daha az kullanılır
		char grade = 'O';
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel: Geçtiniz");
			
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Kötü: Kaldınız");
			break;
			default:
				System.out.println("Geçersiz not girdiniz");

		}
		

	}

}
