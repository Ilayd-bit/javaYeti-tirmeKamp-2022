package sayıBulma;

public class javaDersi23 {

	public static void main(String[] args) {
		int[] sayılar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMı = false;

		for (int sayı : sayılar) {
			if (sayı == aranacak) {
				varMı = true;
				break;

			}
		}

		if (varMı) {

			System.out.println("Sayı mevcuttur");

		} else {
			System.out.println("Sayı mevcut değildir");
		}

	}

}
