package multiDimensionalArrayDemo;

public class javaDersi16 {

	public static void main(String[] args) {
		String[][] kozmetik = new String [5][5];
		kozmetik[0][0]= "Maskara";
		kozmetik[0][1]= "Göz farı";
		kozmetik[0][2]= "Rimel";
		kozmetik[0][3]= "Göz kalemi";
		kozmetik[0][4]= "Tatto liner";
		kozmetik[1][0]= "Lip balm";
		kozmetik[1][1]= "Mat ruj";
		kozmetik[1][2]= "Gloss";
		kozmetik[1][3]= "Ruj";
		kozmetik[1][4]= "Nemlendirici ruj";
		kozmetik[2][0]= "Kapatıcı";
		kozmetik[2][1]= "Fondoten";
		kozmetik[2][2]= "BB krem";
		kozmetik[2][3]= "Beauty Blendır";
		kozmetik[2][4]= "CC krem";
		kozmetik[3][0]= "Şampuan";
		kozmetik[3][1]= "Saç kremi";
		kozmetik[3][2]= "Saç bakım kremi";
		kozmetik[3][3]= "Saç maskesi";
		kozmetik[3][4]= "Bakım yağı";
		kozmetik[4][0]= "Göz kremi";
		kozmetik[4][1]= "Vücut kremi";
		kozmetik[4][2]= "Nemlendirici bakım kremi";
		kozmetik[4][3]= "Ayak kremi";
		kozmetik[4][4]= "Çatlak kremi";
		
		for(int i= 0; i<=4; i++) {
			System.out.println("--------------------");
			for(int j= 0; j<=4; j++) {
				System.out.println(kozmetik[i][j]);
			}
		}
		
		
		
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";
		

		for (int i = 0; i <= 2; i++) {
			System.out.println("----------------");
			for (int j = 0; j <= 2; j++) {
				System.out.println(sehirler[i][j]);

			}

		}

	}

}
