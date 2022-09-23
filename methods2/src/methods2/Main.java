package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava çok güzel";
		String yeniMesaj= sehirVer(); //substring bir değer döndürüyo (return) ediyor. string olan bir değer void operasyon atanmaz.
		System.out.println(yeniMesaj);
		int sayı = topla(15,7);
		System.out.println(sayı);
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
		
		

	}
	
	public static void ekle() {
		System.out.println("Eklendi");
		
	}
	
	public static void sil() {
		System.out.println("Silindi");
		
	}
	public static void güncelle() { //void operasyon emir kipi gibidir bir şey yapmasını emrediyoruz.
		System.out.println("Güncellendi");
		
	}
     public static int topla(int sayı1, int sayı2) { //istenilen kadar sayı gönderilecek kıvama getirmesini sağlayan argüman variable arguments.
    	 return sayı1 + sayı2;
     }
     
     public static int topla2(int... sayılar) { //birden fazla integer göndereceğim ben demek için sisteme ...(variable arguments) koymamız gerekiyor
    	int toplam = 0;
    	for(int sayı :sayılar) {
    		toplam+=sayı;
    	}
    	
    	return toplam;
     } 
     
     public static String sehirVer() {
    	 return "Ankara";
    	 
    	 
     }
     
}
