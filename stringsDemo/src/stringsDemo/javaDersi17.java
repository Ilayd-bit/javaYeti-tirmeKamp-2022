package stringsDemo;

public class javaDersi17 {

	public static void main(String[] args) {
		String mesaj= "  Bugün hava çok güzel.  ";
		System.out.println(mesaj);
		
		System.out.println("Eleman sayısı :"+mesaj.length());
		System.out.println("5.eleman :"+mesaj.charAt(4));
		//İki metini birleştirmek concat ile yapılır.
		System.out.println(mesaj.concat(".Yaşasın!"));
		System.out.println(mesaj.startsWith("A")); //başlangıç harf karakteri
		System.out.println(mesaj.endsWith(".")); //son harf
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.lastIndexOf('a'));
		//indexof içinde ara demektir.
		//last indexof sondan aramaya başla
		//char[] karakterler ile başlayan kısım bu karakterler arasından 5. bul demektir.
		//charAt string içersinde mesaj bulmak için kullanılır.
		//replace ilgili metnin kendini değiştirmez yeni bir çıktı üretir.
		//substring nereden itibaren alınması gerektiği ile alakalıdır.
		//substringin istediğimiz indexten kesmesini istersek içerisinde belirtmeliyiz.
		
		String yeniMesaj= mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,4)); //0 dan başla 4 e kadar.
		
		//split bir metni karakter veya karakter dizisini dikkate alarak parçalamaya yarar.
		
		for(String kelime :mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		
		System.out.println(mesaj.toLowerCase()); //mesajı küçük harfle göstermeye yarar.
		System.out.println(mesaj.toUpperCase()); //mesajı büyük harfle göstermeye yarar.
		//veri tabanlarına arama ifadesi gönderdiğimizde kullanırız.
		System.out.println(mesaj.trim()); //mesaj kenarlarındaki boşlukları atmak için kullanılır.
		
		
		
		
		
		
		
		
		
		
		

	}

}
