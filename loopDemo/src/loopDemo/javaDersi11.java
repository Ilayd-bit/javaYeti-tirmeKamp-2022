package loopDemo;

public class javaDersi11 {

	public static void main(String[] args) {
		// for döngüsü
		for(int i=1;i<=100;i+=2) {
			System.out.println(i);
			//int i=1 kısmına sayaç denmektedir.
			//i<10 şart kısmıdır
			//i++ kaçar kaçar artacağını bize göstermektedir.
			//i 10 olana kadar döngü çalışır.
			//11 olduğunda uygulama sonunda kodlamaya devam eder.
			//i<10 deseydik 9 a kadar çalışırdır.
			//1 den 10 kadar ki sadece tek sayıları yazdırmak istediğimizde (i+=2 derdik i=1)
			// in i=2 diyip i+=2 deseydik çift sayıları 2 şer 2 şer ekranda gösterirdik
			
		} System.out.println("For Döngüsü Bitti"); 
		int i=1;
		while (i<10) {
			System.out.println(i);
			i++;
			
		}
		System.out.println("While Döngüsü Bitti");
		//infinite loop : Sonsuz döngü demektir.
		
		//Do-While
		int j= 100;
		do {
			System.out.println(j);
			j+=2;
			} while (j<10);
		System.out.println("Do-While Döngüsü Bitti");
		//Döngü çalışmasa bile yapmak istediğimiz bir operasyon varsa bir kere çalıştırılır do-while döngüsüyle
		
		
		
	}

}
